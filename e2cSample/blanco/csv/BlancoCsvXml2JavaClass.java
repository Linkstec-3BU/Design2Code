/*
 * blancoCsv Copyright (C) 2005 Tosiki Iga
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 */
package blanco.csv;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import blanco.commons.util.BlancoNameUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.commons.util.BlancoXmlUtil;
import blanco.csv.expand.BlancoCsvExpandIOException;
import blanco.csv.expand.BlancoCsvExpandReader;
import blanco.csv.expand.BlancoCsvExpandRecord;
import blanco.csv.expand.BlancoCsvExpandRuntimeUtil;
import blanco.csv.expand.BlancoCsvExpandWriter;
import blanco.csv.resourcebundle.BlancoCsvResourceBundle;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvXml2JavaClass {
    private final BlancoCsvResourceBundle fBundle = new BlancoCsvResourceBundle();

    private String fRuntimePackage = null;

    /**
     * 自動生成するソースファイルの文字エンコーディング。
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * 与えられた中間ファイルを、与えられた中間ディレクトリを用いながら、ターゲットディレクトリに生成します。
     * 
     * @param fileXmlSource
     *            中間ファイル
     * @param runtimePackage
     *            ランタイムパッケージ。無指定の場合には定義書の値を利用。
     * @param directoryValueObjectWork
     *            VOのためのワークディレクトリ。
     * @param directoryBlancoTarget
     *            ソースコード出力先の blanco フォルダ。
     * @throws TransformerException
     *             XML変換例外が発生した場合。
     */
    public void process(final File fileXmlSource, final String runtimePackage,
            final File directoryValueObjectWork,
            final File directoryBlancoTarget) throws TransformerException {
        fRuntimePackage = runtimePackage;

        final DOMResult result = BlancoXmlUtil.transformFile2Dom(fileXmlSource);

        try {
            final Node rootNode = result.getNode();
            if (rootNode instanceof Document) {
                // これが正常系。ドキュメントルートを取得
                final Document rootDocument = (Document) rootNode;
                final NodeList listSheet = rootDocument
                        .getElementsByTagName("sheet");
                final int sizeListSheet = listSheet.getLength();
                for (int index = 0; index < sizeListSheet; index++) {
                    final Element elementSheet = (Element) listSheet
                            .item(index);

                    final NodeList listCommon = elementSheet
                            .getElementsByTagName(fBundle
                                    .getMeta2xmlElementCommon());
                    if (listCommon.getLength() == 0) {
                        // blancocsv-commonが無い場合にはスキップします。
                        continue;
                    }

                    final Element elementCommon = (Element) listCommon.item(0);

                    final BlancoCsvStructure processStructure = new BlancoCsvStructure();

                    processStructure.setName(BlancoXmlUtil.getTextContent(
                            elementCommon, "fileDefinitionId"));
                    if (processStructure.getName() == null) {
                        // ファイル定義IDが未定義のものは処理スキップします。
                        continue;
                    }

                    processStructure.setPackage(BlancoXmlUtil.getTextContent(
                            elementCommon, "packageName"));
                    if (processStructure.getPackage() == null) {
                        throw new IllegalArgumentException(fBundle
                                .getXml2javaclassErr001(processStructure
                                        .getName()));
                    }

                    processStructure.setDescription(BlancoXmlUtil
                            .getTextContent(elementCommon, "fileDescription"));
                    if (processStructure.getDescription() != null) {
                        final String[] lines = BlancoNameUtil.splitString(
                                processStructure.getDescription(), '\n');
                        for (int indexLine = 0; indexLine < lines.length; indexLine++) {
                            if (indexLine == 0) {
                                processStructure
                                        .setDescription(lines[indexLine]);
                            } else {
                                // 複数行の description については、これを分割して格納します。
                                // ２行目からは、適切に文字参照エンコーディングが実施されているものと仮定します。
                                processStructure.getDescriptionList().add(
                                        lines[indexLine]);
                            }
                        }
                    }

                    final String csvDelimiter = BlancoXmlUtil.getTextContent(
                            elementCommon, "csvDelimiter");
                    if (csvDelimiter == null) {
                        throw new IllegalArgumentException(fBundle
                                .getXml2javaclassErr002(processStructure
                                        .getName()));
                    }

                    // ここからは CSVのデリミタを確定させるための処理です。
                    // まずはCSVデリミタを記憶します。
                    processStructure.setDelimiter(csvDelimiter);
                    if (csvDelimiter.equals("option")) {
                        final String optionCsvDelimiter = BlancoXmlUtil
                                .getTextContent(elementCommon,
                                        "optionCsvDelimiter");
                        if (optionCsvDelimiter == null) {
                            throw new IllegalArgumentException(fBundle
                                    .getXml2javaclassErr003(processStructure
                                            .getName()));
                        }

                        // オプションのCSVデリミタ文字が指定されているので、それを利用します。
                        processStructure.setDelimiter(optionCsvDelimiter);
                    }

                    // ランタイムパッケージの確定。
                    if (fRuntimePackage != null
                            && fRuntimePackage.trim().length() > 0) {
                        // ランタイムパッケージの指定がある場合にはそれを利用します。
                        processStructure.setRuntimePackage(fRuntimePackage);
                    } else {
                        // ランタイムパッケージの指定がない場合には、定義書上のパッケージ名を利用します。
                        processStructure.setRuntimePackage(processStructure
                                .getPackage());
                    }

                    processStructure.setEncoding(BlancoXmlUtil.getTextContent(
                            elementCommon, "encoding"));

                    final String titleRow = BlancoXmlUtil.getTextContent(
                            elementCommon, "titleRow");
                    if (titleRow != null) {
                        processStructure.setTitleRow(titleRow);
                    }

                    final NodeList listRow = elementSheet
                            .getElementsByTagName("field");
                    final int sizeListRow = listRow.getLength();
                    for (int indexField = 0; indexField < sizeListRow; indexField++) {
                        final Element elementField = (Element) listRow
                                .item(indexField);

                        final BlancoCsvFieldStructure field = new BlancoCsvFieldStructure();

                        field.setName(BlancoXmlUtil.getTextContent(
                                elementField, "name"));
                        if (field.getName() == null) {
                            continue;
                        }

                        field.setType(BlancoXmlUtil.getTextContent(
                                elementField, "type"));
                        field.setNo(BlancoXmlUtil.getTextContent(elementField,
                                "no"));

                        field.setDescription(BlancoXmlUtil.getTextContent(
                                elementField, "description"));
                        if (field.getDescription() != null) {
                            final String[] lines = BlancoNameUtil.splitString(
                                    field.getDescription(), '\n');
                            for (int indexLine = 0; indexLine < lines.length; indexLine++) {
                                if (indexLine == 0) {
                                    field.setDescription(lines[indexLine]);
                                } else {
                                    // 複数行の description については、これを分割して格納します。
                                    // ２行目からは、適切に文字参照エンコーディングが実施されているものと仮定します。
                                    field.getDescriptionList().add(
                                            lines[indexLine]);
                                }
                            }
                        }

                        field.setRequired(BlancoStringUtil.null2Blank(
                                BlancoXmlUtil.getTextContent(elementField,
                                        "required")).equals("true"));
                        field.setMinLength(BlancoXmlUtil.getTextContent(
                                elementField, "minLength"));
                        field.setMaxLength(BlancoXmlUtil.getTextContent(
                                elementField, "maxLength"));
                        field.setDefault(BlancoXmlUtil.getTextContent(
                                elementField, "default"));
                        field.setFormat(BlancoXmlUtil.getTextContent(
                                elementField, "format"));

                        if (field.getType() == null) {
                            throw new IllegalArgumentException(fBundle
                                    .getXml2javaclassErr004(processStructure
                                            .getName(), field.getName()));
                        }
                        if (field.getType().equals("java.util.Date")) {
                            if (field.getFormat() == null) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr005(
                                                processStructure.getName(),
                                                field.getName()));
                            }
                        } else {
                            if (field.getFormat() != null) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr006(
                                                processStructure.getName(),
                                                field.getName()));
                            }
                        }

                        if (field.getMinLength() != null) {
                            try {
                                if (Integer.parseInt(field.getMinLength()) < 0) {
                                    // 0以上の整数のみが指定可能
                                    throw new IllegalArgumentException(fBundle
                                            .getXml2javaclassErr007(
                                                    processStructure.getName(),
                                                    field.getName(), field
                                                            .getMinLength()));
                                }
                            } catch (NumberFormatException ex) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr008(
                                                processStructure.getName(),
                                                field.getName(), field
                                                        .getMinLength()));
                            }
                        }

                        if (field.getMaxLength() != null) {
                            try {
                                if (Integer.parseInt(field.getMaxLength()) < 0) {
                                    // 0以上の整数のみが指定可能
                                    throw new IllegalArgumentException(fBundle
                                            .getXml2javaclassErr009(
                                                    processStructure.getName(),
                                                    field.getName(), field
                                                            .getMaxLength()));
                                }
                            } catch (NumberFormatException ex) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr010(
                                                processStructure.getName(),
                                                field.getName(), field
                                                        .getMaxLength()));
                            }
                        }

                        if (field.getMinLength() != null
                                && field.getMaxLength() != null) {
                            // 大小関係をチェック。
                            if (Integer.parseInt(field.getMinLength()) > Integer
                                    .parseInt(field.getMaxLength())) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr011(
                                                processStructure.getName(),
                                                field.getName(), field
                                                        .getMinLength(), field
                                                        .getMaxLength()));
                            }
                        }

                        processStructure.getFieldList().add(field);
                    }

                    expandSheet(processStructure, elementSheet, elementCommon,
                            directoryValueObjectWork, directoryBlancoTarget);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * シートを展開します。
     * 
     * @param elementSheet
     * @param elementCommon
     * @param directoryValueObjectWork
     * @param directoryTarget
     * @param isGenerateJUnit
     * @throws IOException
     * @throws TransformerException
     */
    private void expandSheet(final BlancoCsvStructure processStructure,
            final Element elementSheet, final Element elementCommon,
            final File directoryValueObjectWork, final File directoryTarget)
            throws IOException, TransformerException {
        // 最初にレコードから展開することとします。
        // レコードの処理の中に妥当性チェックなどを含めることとします。
        {
            final BlancoCsvExpandRecord expander = new BlancoCsvExpandRecord();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryValueObjectWork,
                    directoryTarget);
        }
        {
            final BlancoCsvExpandReader expander = new BlancoCsvExpandReader();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
        {
            final BlancoCsvExpandWriter expander = new BlancoCsvExpandWriter();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
        {
            final BlancoCsvExpandIOException expander = new BlancoCsvExpandIOException();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
        {
            final BlancoCsvExpandRuntimeUtil expander = new BlancoCsvExpandRuntimeUtil();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
    }
}
