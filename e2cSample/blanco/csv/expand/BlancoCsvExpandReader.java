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
import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.csv.resourcebundle.BlancoCsvReaderResourceBundle;
import blanco.csv.resourcebundle.BlancoCsvResourceBundle;
import blanco.csv.resourcebundle.BlancoCsvRuntimeUtilResourceBundle;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvExpandReader {
    /**
     * 内部的に利用するblancoCg用ファクトリ。
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * 内部的に利用するblancoCg用ソースファイル情報。
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * 内部的に利用するblancoCg用クラス情報。
     */
    private BlancoCgClass fCgClass = null;

    final BlancoCsvResourceBundle bundle = new BlancoCsvResourceBundle();

    final BlancoCsvReaderResourceBundle fBundleReader = new BlancoCsvReaderResourceBundle();

    final BlancoCsvRuntimeUtilResourceBundle fBundleUtil = new BlancoCsvRuntimeUtilResourceBundle();

    /**
     * 自動生成するソースファイルの文字エンコーディング。
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    public void expand(final BlancoCsvStructure processStructure,
            final File directoryTarget) {

        final String className = BlancoNameAdjuster
                .toClassName(processStructure.getName())
                + fBundleReader.getClassNameSuffix();
        final String classNameblancoCsvIOException = processStructure
                .getRuntimePackage()
                + fBundleReader.getAddusingtype01Suffix();

        // 従来と互換性を持たせるため、/mainサブフォルダに出力します。
        final File fileBlancoMain = new File(directoryTarget.getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getPackage()
                + fBundleReader.getPackagePrefix(),
                "このソースコードは blanco Frameworkによって自動生成されています。");
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(className, BlancoStringUtil
                .null2Blank(fBundleReader.getClasscomment01(processStructure
                        .getName()
                        + (processStructure.getDescription() == null ? "" : "/"
                                + processStructure.getDescription()))));
        fCgSourceFile.getClassList().add(fCgClass);

        fCgSourceFile.getImportList().add(classNameblancoCsvIOException);

        fCgClass.getLangDoc().getDescriptionList().add(
                fBundleReader.getClasscomment02());
        if (processStructure.getEncoding() == null) {
            fCgClass.getLangDoc().getDescriptionList().add(
                    fBundleReader.getClasscomment03Case01());
        } else {
            fCgClass.getLangDoc().getDescriptionList().add(
                    fBundleReader.getClasscomment03Case02(processStructure
                            .getEncoding()));
        }
        fCgClass.getLangDoc().getDescriptionList().add(
                fBundleReader.getClasscomment04());

        {
            final BlancoCgField field = fCgFactory.createField(fBundleReader
                    .getFieldReaderName(), fBundleReader.getFieldReaderType(),
                    fBundleReader.getFieldReaderJavadoc01());
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.getLangDoc().getDescriptionList().add(
                    fBundleReader.getFieldReaderJavadoc02());
        }

        {
            final BlancoCgField field = fCgFactory.createField(fBundleReader
                    .getFieldLineCounterName(), fBundleReader
                    .getFieldLineCounterType(), fBundleReader
                    .getFieldLineCounterJavadoc01());
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.getLangDoc().getDescriptionList().add(
                    fBundleReader.getFieldLineCounterJavadoc02());
            field.setDefault(fBundleReader.getFieldLineCounterDefault());
        }

        {
            final BlancoCgField field = fCgFactory.createField("fLine",
                    "java.lang.String", "現在処理中の行データ。");
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
        }

        {
            final BlancoCgField field = fCgFactory.createField("fLineReader",
                    "java.io.StringReader", "現在処理中の行のためのリーダ。");
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
        }

        if (processStructure.getTitleRow().equals("title with quote")
                || processStructure.getTitleRow().equals("title without quote")) {
            final BlancoCgField field = fCgFactory.createField(
                    "fIsTitleProcessed", "boolean", "タイトル行が処理されたかどうか。");
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.setDefault("false");
        }

        // 「書式」対応
        for (int indexField = 0; indexField < processStructure.getFieldList()
                .size(); indexField++) {
            final BlancoCsvFieldStructure fieldStructure = (BlancoCsvFieldStructure) processStructure
                    .getFieldList().get(indexField);

            if (fieldStructure.getType().equals("java.util.Date")) {
                final BlancoCgField field = fCgFactory
                        .createField(
                                fBundleReader
                                        .getFieldSimpleDateFormatNamePrefix()
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()),
                                fBundleReader.getFieldSimpleDateFormatType(),
                                fBundleReader
                                        .getFieldSimpleDateFormatJavadoc01(fieldStructure
                                                .getName()));
                fCgClass.getFieldList().add(field);
                field.setAccess("protected");
                field.getLangDoc().getDescriptionList().add(
                        fBundleReader.getFieldSimpleDateFormatJavadoc02());
            }
        }

        {
            // コンストラクタ
            final BlancoCgMethod method = fCgFactory.createMethod(className,
                    fBundleReader.getConstructor01Javadoc01());
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);

            // 「書式」対応
            method.getLineList().add("init();");
        }

        {
            // コンストラクタ
            final BlancoCgMethod method = fCgFactory.createMethod(className,
                    fBundleReader.getConstructor01Javadoc01());
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getLangDoc().getDescriptionList().add(
                    fBundleReader.getConstructor01Javadoc02());
            method.getParameterList().add(
                    fCgFactory.createParameter("arg", fBundleReader
                            .getConstructor01Arg01Type(), fBundleReader
                            .getConstructor01Arg01Javadoc01()));

            // メソッドの実装
            method.getLineList().add("fReader = arg;");

            // 「書式」対応
            method.getLineList().add("init();");
        }

        {
            // initメソッド
            final BlancoCgMethod method = fCgFactory.createMethod("init",
                    "初期化をおこないます。");
            fCgClass.getMethodList().add(method);
            method.setAccess("protected");

            // 「書式」対応
            for (int indexField = 0; indexField < processStructure
                    .getFieldList().size(); indexField++) {
                final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                        .getFieldList().get(indexField);

                if (field.getType().equals("java.util.Date")) {
                    method
                            .getLineList()
                            .add(
                                    fBundleReader
                                            .getFieldSimpleDateFormatNamePrefix()
                                            + BlancoNameAdjuster
                                                    .toClassName(field
                                                            .getName())
                                            + " = new SimpleDateFormat("
                                            + (field.getFormat() == null ? "\"yyyy/MM/dd\""
                                                    : "\"" + field.getFormat()
                                                            + "\"") + ");");
                    method.getLineList().add("// 日付/時刻解析を厳密におこないます。");
                    method
                            .getLineList()
                            .add(
                                    fBundleReader
                                            .getFieldSimpleDateFormatNamePrefix()
                                            + BlancoNameAdjuster
                                                    .toClassName(field
                                                            .getName())
                                            + ".setLenient(false);");
                }
            }
        }

        final String recordClassName = processStructure.getPackage()
                + ".record."
                + BlancoNameAdjuster.toClassName(processStructure.getName())
                + "CsvRecord";

        // メソッドのシグニチャ指定
        {
            final BlancoCgMethod method = fCgFactory.createMethod("readRecord",
                    fBundleReader.getReadrecordJavadoc());
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn(recordClassName,
                    fBundleReader.getReadrecordReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            fBundleReader.getReadrecordThrows01Javadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleReader
                            .getReadrecordThrows02Type(), fBundleReader
                            .getReadrecordThrows02Javadoc()));

            // メソッドの実装
            method.getLineList().add("if (fReader == null) {");
            method
                    .getLineList()
                    .add(
                            "throw new IllegalArgumentException(\"["
                                    + processStructure.getName()
                                    + "] リーダが設定されていない状態でメソッド[readRecord]が呼び出されました。これは許可されません。リーダをセットしてから呼びだしてください。\");");
            method.getLineList().add("}");
            method.getLineList().add("");

            if (processStructure.getTitleRow().equals("title with quote")
                    || processStructure.getTitleRow().equals(
                            "title without quote")) {
                method.getLineList().add("if (fIsTitleProcessed == false) {");
                method.getLineList().add("// タイトル行を読み飛ばし。");
                method.getLineList().add("fReader.readLine();");
                method.getLineList().add("fIsTitleProcessed = true;");
                method.getLineList().add("}");
                method.getLineList().add("");
            }

            method.getLineList().add("fLine = fReader.readLine();");
            method.getLineList().add("if (fLine == null) {");
            method.getLineList().add(fBundleReader.getReadrecordLine03());
            method.getLineList().add("return null;");
            method.getLineList().add("}");
            method.getLineList().add("fLineCounter++;");
            method.getLineList().add(
                    fBundleReader.getReadrecordLine07(BlancoNameAdjuster
                            .toClassName(processStructure.getName())));
            fCgSourceFile.getImportList().add("java.io.StringReader");
            method.getLineList().add("fLineReader = new StringReader(fLine);");
            method.getLineList().add("String tokenString = null;");

            for (int indexField = 0; indexField < processStructure
                    .getFieldList().size(); indexField++) {
                final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                        .getFieldList().get(indexField);

                method.getLineList().add("");
                method
                        .getLineList()
                        .add(
                                (fBundleReader
                                        .getReadrecordLine12(
                                                (field.getNo() == null ? ""
                                                        : bundle
                                                                .getFieldNo(field
                                                                        .getNo())),
                                                field.getName()
                                                        + (field
                                                                .getDescription() == null ? ""
                                                                : "/"
                                                                        + BlancoJavaSourceUtil
                                                                                .escapeStringAsJavaSource(field
                                                                                        .getDescription())))));
                // 「BlancoCsvRuntimeUtil」はインポートしなくなりました。
                // fCgSourceFile.getImportList().add(
                // processStructure.getRuntimePackage()
                // + ".util.BlancoCsvRuntimeUtil");

                if (field.getType().endsWith("(quote)")) {
                    // 文字列のクオート付。
                    method.getLineList().add(
                            fBundleReader.getReadrecordLine21());
                    method.getLineList().add(
                            fBundleReader.getReadrecordLine22Case01(
                                    processStructure.getDelimiter(),
                                    (indexField == processStructure
                                            .getFieldList().size() - 1 ? "true"
                                            : "false")));
                } else {
                    method.getLineList().add(
                            fBundleReader.getReadrecordLine22Case02(
                                    processStructure.getDelimiter(),
                                    (indexField == processStructure
                                            .getFieldList().size() - 1 ? "true"
                                            : "false")));
                }
                method.getLineList().add("if (tokenString == null) {");
                method.getLineList().add(
                        "throw new BlancoCsvIOException(\""
                                + bundle.getCsvReaderErr001(getLocationString(
                                        indexField, field.getNo(), field
                                                .getName(),
                                        BlancoJavaSourceUtil
                                                .escapeStringAsJavaSource(field
                                                        .getDescription())))
                                + "\");");
                method.getLineList().add("}");

                final String encodingString = (processStructure.getEncoding() == null ? ""
                        : "\"" + processStructure.getEncoding() + "\"");
                if (field.getRequired()) {
                    method.getLineList().add("// 必須項目。");
                    method.getLineList()
                            .add("if (tokenString.length() == 0) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr008(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\");");
                    method.getLineList().add("}");
                } else {
                    method.getLineList().add("// 任意項目。");
                    method.getLineList()
                            .add("if (tokenString.length() == 0) {");
                    if (field.getType().startsWith("java.lang.String")) {
                        method
                                .getLineList()
                                .add(
                                        "// 必須項目ではない文字列項目に長さ0の値が読み込まれた場合には、読み込み後の値としても長さ0の文字列とします。");
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName()) + "(tokenString);");
                    } else {
                        method
                                .getLineList()
                                .add(
                                        "// 必須項目ではない項目に長さ0の値が読み込まれた場合には、値としてnullを代入します。");
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName()) + "(null);");
                    }
                    method.getLineList().add("} else {");
                }
                if (field.getMinLength() != null) {
                    method.getLineList().add(
                            "if (tokenString.getBytes(" + encodingString
                                    + ").length < " + field.getMinLength()
                                    + ") {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr002(
                                                            getLocationString(
                                                                    indexField,
                                                                    field
                                                                            .getNo(),
                                                                    field
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(field
                                                                                    .getDescription())),
                                                            field
                                                                    .getMinLength())
                                            + "\");");
                    method.getLineList().add("}");
                }
                if (field.getMaxLength() != null) {
                    method.getLineList().add(
                            "if (tokenString.getBytes(" + encodingString
                                    + ").length > " + field.getMaxLength()
                                    + ") {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr003(
                                                            getLocationString(
                                                                    indexField,
                                                                    field
                                                                            .getNo(),
                                                                    field
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(field
                                                                                    .getDescription())),
                                                            field
                                                                    .getMaxLength())
                                            + "\");");
                    method.getLineList().add("}");
                }

                if (field.getType().equals("java.lang.String")
                        || field.getType().equals("java.lang.String(quote)")) {
                    method.getLineList().add(
                            "record.set"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName()) + "(tokenString);");
                } else if (field.getType().equals("int")) {
                    method.getLineList().add("try {");
                    if (field.getRequired()) {
                        // 必須の場合
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(Integer.parseInt(tokenString));");
                    } else {
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(new Integer(tokenString));");
                    }
                    method.getLineList().add(
                            "} catch (NumberFormatException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr004(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else if (field.getType().equals("long")) {
                    method.getLineList().add("try {");
                    if (field.getRequired()) {
                        // 必須の場合
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(Long.parseLong(tokenString));");
                    } else {
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(new Long(tokenString));");
                    }
                    method.getLineList().add(
                            "} catch (NumberFormatException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr005(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else if (field.getType().equals("java.util.Date")) {
                    fCgSourceFile.getImportList().add(
                            "java.text.ParseException");
                    method.getLineList().add("try {");
                    method.getLineList().add(
                            "record.set"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName())
                                    + "(fSimpleDateFormat"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName())
                                    + ".parse(tokenString));");
                    method.getLineList().add("} catch (ParseException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr006(
                                                            getLocationString(
                                                                    indexField,
                                                                    field
                                                                            .getNo(),
                                                                    field
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(field
                                                                                    .getDescription())),
                                                            BlancoNameAdjuster
                                                                    .toClassName(field
                                                                            .getName()))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else if (field.getType().equals("java.math.BigDecimal")) {
                    fCgSourceFile.getImportList().add("java.math.BigDecimal");
                    method.getLineList().add("try {");
                    method.getLineList().add(
                            "record.set"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName())
                                    + "(new BigDecimal(tokenString));");
                    method.getLineList().add(
                            "} catch (NumberFormatException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr007(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else {
                    method.getLineList().add(
                            bundle.getNotSupportedType(field.getType()));
                }

                if (field.getRequired()) {
                    // 必須項目。
                } else {
                    method.getLineList().add("}");
                }
            }

            method.getLineList().add("return record;");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod("getReader",
                    "CSV処理で関連づけられるリーダを返します。");
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn("java.io.BufferedReader",
                    "CSV処理で関連づけられるリーダ。"));

            method.getLineList().add("return fReader;");
        }

        {
            // DI対策。
            final BlancoCgMethod method = fCgFactory.createMethod("setReader",
                    "CSV処理で関連づけられるリーダを設定します。");
            fCgClass.getMethodList().add(method);
            method.getParameterList().add(
                    fCgFactory.createParameter("argReader",
                            "java.io.BufferedReader", "CSV処理で関連づけられるリーダ。"));

            method.getLineList().add("fReader = argReader;");
        }

        // メソッドのシグニチャ指定
        {
            final BlancoCgMethod method = fCgFactory.createMethod(
                    "getLineCounter", "現在処理中の行カウンタを返します。");
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn("long", "現在処理中の行カウンタ。"));

            // メソッドの実装
            method.getLineList().add("return fLineCounter;");
        }

        // メソッドのシグニチャ指定
        {
            final BlancoCgMethod method = fCgFactory.createMethod("close",
                    fBundleReader.getCloseJavadoc01());
            fCgClass.getMethodList().add(method);
            method.getLangDoc().getDescriptionList().add(
                    fBundleReader.getCloseJavadoc02());
            method.getThrowList().add(
                    fCgFactory.createException(fBundleReader
                            .getCloseThrows01Type(), fBundleReader
                            .getCloseThrows01Javadoc()));

            // メソッドの実装
            method.getLineList().add("if (fReader != null) {");
            method.getLineList().add("fReader.close();");
            method.getLineList().add("}");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod(fBundleUtil
                    .getReadtokenName(), fBundleUtil.getReadtokenJavadoc());
            fCgClass.getMethodList().add(method);
            method.setAccess("protected");

            // メソッドのシグニチャ指定
            // method.getParameterList().add(
            // fCgFactory.createParameter(fBundleUtil
            // .getReadtokenArg01Name(), fBundleUtil
            // .getReadtokenArg01Type(), fBundleUtil
            // .getReadtokenArg01Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenArg02Name(), fBundleUtil
                            .getReadtokenArg02Type(), fBundleUtil
                            .getReadtokenArg02Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenArg03Name(), fBundleUtil
                            .getReadtokenArg03Type(), fBundleUtil
                            .getReadtokenArg03Javadoc()));
            method.setReturn(fCgFactory.createReturn(fBundleUtil
                    .getReadtokenReturnType(), fBundleUtil
                    .getReadtokenReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            "項目数が足りないなど与えられた文字列に関する例外が発生した場合。"));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleUtil
                            .getReadtokenThrows01Type(), fBundleUtil
                            .getReadtokenThrows01Javadoc()));

            // メソッドの実装
            final List<java.lang.String> lineList = method.getLineList();
            lineList.add(fBundleUtil.getReadtokenLine01());
            lineList.add(fBundleUtil.getReadtokenLine02());
            lineList.add(fBundleUtil.getReadtokenLine03());
            lineList.add(fBundleUtil.getReadtokenLine04());
            lineList.add(fBundleUtil.getReadtokenLine05());
            lineList.add(fBundleUtil.getReadtokenLine06());
            lineList.add(fBundleUtil.getReadtokenLine07());
            lineList.add(fBundleUtil.getReadtokenLine08());
            lineList.add(fBundleUtil.getReadtokenLine09());
            lineList.add(fBundleUtil.getReadtokenLine10());
            lineList.add(fBundleUtil.getReadtokenLine11());
            lineList.add(fBundleUtil.getReadtokenLine12());
            lineList.add(fBundleUtil.getReadtokenLine13());
            lineList.add(fBundleUtil.getReadtokenLine14());
            lineList.add(fBundleUtil.getReadtokenLine15());
            lineList.add(fBundleUtil.getReadtokenLine16());
            lineList.add(fBundleUtil.getReadtokenLine17());
            lineList.add(fBundleUtil.getReadtokenLine18());
            lineList.add(fBundleUtil.getReadtokenLine19());
            lineList.add(fBundleUtil.getReadtokenLine20());
        }

        // メソッドのシグニチャ指定
        {
            final BlancoCgMethod method = fCgFactory.createMethod(fBundleUtil
                    .getReadtokenwithquoteName(), fBundleUtil
                    .getReadtokenwithquoteJavadoc());
            fCgClass.getMethodList().add(method);
            method.setAccess("protected");

            // method.getParameterList().add(
            // fCgFactory.createParameter(fBundleUtil
            // .getReadtokenwithquoteArg01Name(), fBundleUtil
            // .getReadtokenwithquoteArg01Type(), fBundleUtil
            // .getReadtokenwithquoteArg01Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenwithquoteArg02Name(), fBundleUtil
                            .getReadtokenwithquoteArg02Type(), fBundleUtil
                            .getReadtokenwithquoteArg02Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenwithquoteArg03Name(), fBundleUtil
                            .getReadtokenwithquoteArg03Type(), fBundleUtil
                            .getReadtokenwithquoteArg03Javadoc()));
            method.setReturn(fCgFactory.createReturn(fBundleUtil
                    .getReadtokenwithquoteReturnType(), fBundleUtil
                    .getReadtokenwithquoteReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            "ダブルクオートの不一致など与えられた文字列に関する例外が発生した場合。"));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleUtil
                            .getReadtokenwithquoteThrows01Type(), fBundleUtil
                            .getReadtokenwithquoteThrows01Javadoc()));

            // メソッドの実装
            final List<java.lang.String> lineList = method.getLineList();
            lineList.add(fBundleUtil.getReadtokenwithquoteLine01());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine02());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine03());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine04());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine05());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine06());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine07());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine08());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine09());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine10());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine11());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine12());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine13());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine14());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine15());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine16());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine17());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine18());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine19());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine20());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine21());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine22());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine23());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine24());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine25());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine26());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine27());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine28());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine29());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine30());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine31());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine32());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine33());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine34());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine35());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine36());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine37());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine38());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine39());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine40());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine41());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine42());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine43());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine44());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine45());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine46());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine47());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine48());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine49());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine50());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine51());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine52());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine53());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine54());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine55());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine56());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine57());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine58());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine59());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine60());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine61());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine62());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine63());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine64());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine65());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine66());
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }

    private String getLocationString(int indexField, String fieldNo,
            String fieldName, String fieldDescription) {
        return fBundleReader.getGetlocationstringLine01("" + (indexField + 1),
                (fieldNo == null ? "" : bundle.getFieldNo(fieldNo) + " "),
                fieldName
                        + (fieldDescription == null ? "" : "/"
                                + fieldDescription));
    }
}
