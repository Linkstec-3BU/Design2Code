/*
 * blancoCsv Copyright (C) 2005 Tosiki Iga
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 */
package blanco.csv.expand;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.commons.util.BlancoNameAdjuster;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;
import blanco.valueobject.BlancoValueObjectXml2JavaClass;
import blanco.valueobject.valueobject.BlancoValueObjectClassStructure;
import blanco.valueobject.valueobject.BlancoValueObjectFieldStructure;

public class BlancoCsvExpandRecord {
    /**
     * 自動生成するソースファイルの文字エンコーディング。
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * レコードを展開します。
     * 
     * @param processStructure
     * @param direcotryValueObjectWork
     * @param directoryTarget
     * @throws IOException
     * @throws TransformerException
     */
    public void expand(final BlancoCsvStructure processStructure,
            final File direcotryValueObjectWork, final File directoryTarget)
            throws IOException, TransformerException {
        final String className = BlancoNameAdjuster
                .toClassName(processStructure.getName())
                + "CsvRecord";
        final String packageName = processStructure.getPackage() + ".record";

        final BlancoValueObjectClassStructure voClass = new BlancoValueObjectClassStructure();
        voClass.setName(className);
        voClass.setPackage(packageName);
        voClass.setDescription("blancoCsvファイル定義書から作成されたレコードクラス。");
        voClass.getDescriptionList().add(
                "ファイル定義["
                        + processStructure.getName()
                        + (processStructure.getDescription() == null ? "" : "/"
                                + processStructure.getDescription())
                        + "]のレコードクラス。");

        for (int indexField = 0; indexField < processStructure.getFieldList()
                .size(); indexField++) {
            final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                    .getFieldList().get(indexField);

            boolean isQuoted = false;
            String actualType = field.getType();
            if (field.getType().endsWith("(quote)")) {
                // クオート指定がある場合には、型名称から(quote)を除去します。
                actualType = field.getType().substring(0,
                        field.getType().length() - "(quote)".length());
                isQuoted = true;
            }
            if (field.getRequired() == false) {
                // 必要に応じてラッパー型に対応します。
                if (actualType.equals("int")) {
                    actualType = "java.lang.Integer";
                } else if (actualType.equals("long")) {
                    actualType = "java.lang.Long";
                }
            }

            final BlancoValueObjectFieldStructure voField = new BlancoValueObjectFieldStructure();
            voClass.getFieldList().add(voField);

            if (field.getNo() != null) {
                voField.setNo(field.getNo());
            }

            voField.setName(field.getName());
            voField.setType(actualType);

            if (field.getDescription() != null) {
                voField.setDescription(field.getDescription());
            }

            if (field.getNo() != null) {
                voField.getDescriptionList().add("項目番号: " + field.getNo());
            }
            if (isQuoted) {
                voField.getDescriptionList().add("文字列はダブルクオート処理されて入出力されます。");
            }

            if (field.getMinLength() != null) {
                voField.getDescriptionList().add(
                        "MIN長さ: " + field.getMinLength());
            }
            if (field.getMaxLength() != null) {
                voField.getDescriptionList().add(
                        "MAX長さ: " + field.getMaxLength());
            }
            if (field.getRequired()) {
                voField.getDescriptionList().add("必須項目");
            }

            if (field.getDefault() != null) {
                voField.setDefault(field.getDefault());
            }
        }

        final BlancoValueObjectXml2JavaClass xml2source = new BlancoValueObjectXml2JavaClass();
        xml2source.setEncoding(fEncoding);
        xml2source.structure2Source(voClass, directoryTarget);
    }
}
