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

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.csv.resourcebundle.BlancoCsvResourceBundle;
import blanco.csv.resourcebundle.BlancoCsvWriterResourceBundle;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvExpandWriter {
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

    final BlancoCsvWriterResourceBundle writerBundle = new BlancoCsvWriterResourceBundle();

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
                + writerBundle.getClassNameSuffix();

        final String classNameblancoCsvIOException = processStructure
                .getRuntimePackage()
                + ".io.BlancoCsvIOException";

        // 従来と互換性を持たせるため、/mainサブフォルダに出力します。
        final File fileBlancoMain = new File(directoryTarget.getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getPackage()
                + writerBundle.getPackagePrefix(),
                "このソースコードは blanco Frameworkによって自動生成されています。");
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(className, BlancoStringUtil
                .null2Blank(writerBundle.getClasscomment01(processStructure
                        .getName()
                        + (processStructure.getDescription() == null ? "" : "/"
                                + processStructure.getDescription()))));
        fCgSourceFile.getClassList().add(fCgClass);
        fCgClass.getLangDoc().getDescriptionList().add(
                writerBundle.getClasscomment02());

        if (processStructure.getEncoding() == null) {
            fCgClass.getLangDoc().getDescriptionList().add(
                    writerBundle.getClasscomment03Case01());
        } else {
            fCgClass.getLangDoc().getDescriptionList().add(
                    writerBundle.getClasscomment03Case02(processStructure
                            .getEncoding()));
        }
        fCgClass.getLangDoc().getDescriptionList().add(
                writerBundle.getClasscomment04());

        // フィールド追加
        {
            final BlancoCgField field = fCgFactory.createField(writerBundle
                    .getFieldWriterName(), writerBundle.getFieldWriterType(),
                    writerBundle.getFieldWriterJavadoc01());
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.getLangDoc().getDescriptionList().add(
                    writerBundle.getFieldWriterJavadoc02());
        }

        {
            final BlancoCgField field = fCgFactory.createField(writerBundle
                    .getFieldLineCounterName(), writerBundle
                    .getFieldLineCounterType(), writerBundle
                    .getFieldLineCounterJavadoc01());
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.getLangDoc().getDescriptionList().add(
                    writerBundle.getFieldLineCounterJavadoc02());
            field.setDefault(writerBundle.getFieldLineCounterDefault());
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
                                writerBundle
                                        .getFieldSimpleDateFormatNamePrefix()
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()),
                                "java.text.SimpleDateFormat",
                                writerBundle
                                        .getFieldSimpleDateFormatJavadoc01(fieldStructure
                                                .getName()));
                fCgClass.getFieldList().add(field);
                field.setAccess("protected");
                field.getLangDoc().getDescriptionList().add(
                        writerBundle.getFieldSimpleDateFormatJavadoc02());
            }
        }

        {
            // コンストラクタ
            final BlancoCgMethod method = fCgFactory.createMethod(className,
                    writerBundle.getConstructor01Javadoc01());
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);

            // 「書式」対応
            method.getLineList().add("init();");
        }

        {
            // コンストラクタ
            final BlancoCgMethod method = fCgFactory.createMethod(className,
                    writerBundle.getConstructor01Javadoc01());
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getLangDoc().getDescriptionList().add(
                    writerBundle.getConstructor01Javadoc02());
            method.getParameterList().add(
                    fCgFactory.createParameter("arg", writerBundle
                            .getConstructor01Arg01Type(), writerBundle
                            .getConstructor01Arg01Javadoc01()));

            // メソッドの実装
            method.getLineList().add("fWriter = arg;");

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
                                    "fSimpleDateFormat"
                                            + BlancoNameAdjuster
                                                    .toClassName(field
                                                            .getName())
                                            + " = new SimpleDateFormat("
                                            + (field.getFormat() == null ? "\"yyyy/MM/dd\""
                                                    : "\"" + field.getFormat()
                                                            + "\"") + ");");

                }
            }
        }

        // 常にタイトル行を出力する。
        {
            final BlancoCgMethod method = fCgFactory.createMethod("writeTitle",
                    writerBundle.getWritetitleJavadoc01());
            fCgClass.getMethodList().add(method);

            method.getLangDoc().getDescriptionList().add(
                    writerBundle.getWritetitleJavadoc02());
            if (processStructure.getTitleRow().equals("title with quote")) {
                method.getLangDoc().getDescriptionList().add(
                        writerBundle.getWritetitleJavadoc03());
            }
            method.getThrowList().add(
                    fCgFactory.createException(writerBundle
                            .getWritetitleThrows01Type(), writerBundle
                            .getWritetitleThrows01Javadoc()));

            method.getLineList().add("if (fWriter == null) {");
            method
                    .getLineList()
                    .add(
                            "throw new IllegalArgumentException(\"["
                                    + processStructure.getName()
                                    + "] ライタが設定されていない状態でメソッド[writeTitle]が呼び出されました。これは許可されません。ライタをセットしてから呼びだしてください。\");");
            method.getLineList().add("}");
            method.getLineList().add("");

            for (int indexField = 0; indexField < processStructure
                    .getFieldList().size(); indexField++) {
                final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                        .getFieldList().get(indexField);
                final String delimiter = (indexField != 0 ? processStructure
                        .getDelimiter() : "");
                final String quote = (processStructure.getTitleRow().equals(
                        "title with quote") ? BlancoJavaSourceUtil
                        .escapeStringAsJavaSource("\"") : "");
                method.getLineList().add(
                        "fWriter.write(\""
                                + delimiter
                                + quote
                                + BlancoJavaSourceUtil
                                        .escapeStringAsJavaSource(field
                                                .getDescription()) + quote
                                + "\");");
            }
            method.getLineList().add("fWriter.newLine();");
        }

        final String recordClassName = processStructure.getPackage()
                + ".record."
                + BlancoNameAdjuster.toClassName(processStructure.getName())
                + "CsvRecord";

        // メソッドのシグニチャ指定
        {
            final BlancoCgMethod method = fCgFactory.createMethod(
                    "writeRecord", writerBundle.getWriterecordJavadoc01());
            fCgClass.getMethodList().add(method);
            method.getLangDoc().getDescriptionList().add(
                    writerBundle.getWriterecordJavadoc02());
            method.getParameterList().add(
                    fCgFactory.createParameter("record", recordClassName,
                            writerBundle.getWriterecordArg01Javadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            writerBundle.getWriterecordThrows01Javadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(writerBundle
                            .getWriterecordThrows02Type(), writerBundle
                            .getWriterecordThrows02Javadoc()));

            // メソッドの実装
            method.getLineList().add("if (fWriter == null) {");
            method
                    .getLineList()
                    .add(
                            "throw new IllegalArgumentException(\"["
                                    + processStructure.getName()
                                    + "] ライタが設定されていない状態でメソッド[writeRecord]が呼び出されました。これは許可されません。ライタをセットしてから呼びだしてください。\");");
            method.getLineList().add("}");
            method.getLineList().add("");

            if (processStructure.getTitleRow().equals("title with quote")
                    || processStructure.getTitleRow().equals(
                            "title without quote")) {
                method.getLineList().add("if (fIsTitleProcessed == false) {");
                method.getLineList().add("// タイトル行を書き込み。");
                method.getLineList().add("writeTitle();");
                method.getLineList().add("fIsTitleProcessed = true;");
                method.getLineList().add("}");
                method.getLineList().add("");
            }

            method.getLineList().add("String writeToken = null;");
            for (int indexField = 0; indexField < processStructure
                    .getFieldList().size(); indexField++) {
                final BlancoCsvFieldStructure fieldStructure = (BlancoCsvFieldStructure) processStructure
                        .getFieldList().get(indexField);

                if (indexField != 0) {
                    // デリミタを出力。
                    method.getLineList().add(
                            "fWriter.write('" + processStructure.getDelimiter()
                                    + "');");
                }

                method.getLineList().add("");
                method
                        .getLineList()
                        .add(
                                writerBundle
                                        .getWriterecordLine01(
                                                (fieldStructure.getNo() == null ? ""
                                                        : bundle
                                                                .getFieldNo(fieldStructure
                                                                        .getNo())
                                                                + " "),
                                                fieldStructure.getName()
                                                        + (fieldStructure
                                                                .getDescription() == null ? ""
                                                                : "/"
                                                                        + fieldStructure
                                                                                .getDescription())));

                if (fieldStructure.getType().equals("java.lang.String")
                        || fieldStructure.getType().equals(
                                "java.lang.String(quote)")) {
                    if (fieldStructure.getRequired()) {
                        // 必須項目。
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null) {");
                        method
                                .getLineList()
                                .add(
                                        "throw new BlancoCsvIOException(\""
                                                + bundle
                                                        .getCsvWriterErr004(getLocationString(
                                                                indexField,
                                                                fieldStructure
                                                                        .getNo(),
                                                                fieldStructure
                                                                        .getName(),
                                                                BlancoJavaSourceUtil
                                                                        .escapeStringAsJavaSource(fieldStructure
                                                                                .getDescription())))
                                                + "\");");
                        method.getLineList().add("}");
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "().length() == 0) {");
                        method
                                .getLineList()
                                .add(
                                        "throw new BlancoCsvIOException(\""
                                                + bundle
                                                        .getCsvWriterErr005(getLocationString(
                                                                indexField,
                                                                fieldStructure
                                                                        .getNo(),
                                                                fieldStructure
                                                                        .getName(),
                                                                BlancoJavaSourceUtil
                                                                        .escapeStringAsJavaSource(fieldStructure
                                                                                .getDescription())))
                                                + "\");");
                        method.getLineList().add("}");
                        method.getLineList().add(
                                "writeToken = record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()) + "();");
                    } else {
                        // 任意項目であるので nullは長さ0の文字列へと読み替えます。
                        method
                                .getLineList()
                                .add(
                                        "// 任意項目で文字列の項目に nullまたは長さ0の文字列が与えられた場合には、いずれも値が入っていないものとみなします。");
                        method.getLineList().add("// この場合には長さチェックは行いません。");
                        method.getLineList().add(
                                "writeToken = record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null ? \"\" : record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()) + "();");
                        // if文が開始した状態のままにします。
                        method.getLineList().add(
                                "if (writeToken.length() > 0) {");
                    }
                } else if (fieldStructure.getType().equals("int")
                        || fieldStructure.getType().equals("long")) {
                    if (fieldStructure.getRequired()) {
                        // 必須項目。
                        // int, longはプリミティブ型なのでnullチェックは不要。
                        method.getLineList().add(
                                "writeToken = String.valueOf(record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()) + "());");
                    } else {
                        // 任意項目。
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null) {");
                        method.getLineList().add("writeToken = \"\";");
                        method.getLineList().add("} else {");
                        // if文が開始した状態のままにします。
                        method.getLineList().add(
                                "writeToken = String.valueOf(record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()) + "());");
                    }
                } else if (fieldStructure.getType().equals("java.util.Date")) {
                    fCgSourceFile.getImportList().add("java.io.IOException");
                    if (fieldStructure.getRequired()) {
                        // 必須項目。
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null) {");
                        method
                                .getLineList()
                                .add(
                                        "throw new BlancoCsvIOException(\""
                                                + bundle
                                                        .getCsvWriterErr004(getLocationString(
                                                                indexField,
                                                                fieldStructure
                                                                        .getNo(),
                                                                fieldStructure
                                                                        .getName(),
                                                                BlancoJavaSourceUtil
                                                                        .escapeStringAsJavaSource(fieldStructure
                                                                                .getDescription())))
                                                + "\");");
                        method.getLineList().add("}");
                        method.getLineList().add(
                                "writeToken = fSimpleDateFormat"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + ".format(record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()) + "());");
                    } else {
                        // 任意項目。
                        // 任意項目であるので nullは長さ0の文字列へと読み替えます。
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null) {");
                        method.getLineList().add("writeToken = \"\";");
                        method.getLineList().add("} else {");
                        // if文が開始した状態のままにします。
                        method.getLineList().add(
                                "writeToken = fSimpleDateFormat"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + ".format(record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()) + "());");
                    }
                } else if (fieldStructure.getType().equals(
                        "java.math.BigDecimal")) {
                    // java.math.BigDecimalのインポートは不要。
                    if (fieldStructure.getRequired()) {
                        // 必須項目。
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null) {");
                        method
                                .getLineList()
                                .add(
                                        "throw new BlancoCsvIOException(\""
                                                + bundle
                                                        .getCsvWriterErr004(getLocationString(
                                                                indexField,
                                                                fieldStructure
                                                                        .getNo(),
                                                                fieldStructure
                                                                        .getName(),
                                                                BlancoJavaSourceUtil
                                                                        .escapeStringAsJavaSource(fieldStructure
                                                                                .getDescription())))
                                                + "\");");
                        method.getLineList().add("}");
                        method.getLineList().add(
                                "writeToken = record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "().toString();");
                    } else {
                        // 任意項目であるので nullは長さ0の文字列へと読み替えます。
                        method.getLineList().add(
                                "if (record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null) {");
                        method.getLineList().add("writeToken = \"\";");
                        method.getLineList().add("} else {");
                        // if文が開始した状態のままにします。
                        method.getLineList().add(
                                "writeToken = record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "() == null ? \"\" : record.get"
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName())
                                        + "().toString();");
                    }
                } else {
                    method.getLineList().add(
                            bundle
                                    .getNotSupportedType(fieldStructure
                                            .getType()));
                    method.getLineList().add("writeToken = \"\";");
                }

                if (fieldStructure.getRequired()) {
                    // 必須項目。
                    method.getLineList().add("if (writeToken == null) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvWriterErr004(getLocationString(
                                                            indexField,
                                                            fieldStructure
                                                                    .getNo(),
                                                            fieldStructure
                                                                    .getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(fieldStructure
                                                                            .getDescription())))
                                            + "\");");
                    method.getLineList().add("}");
                }

                final String encodingString = (processStructure.getEncoding() == null ? ""
                        : "\"" + processStructure.getEncoding() + "\"");
                if (fieldStructure.getMinLength() != null) {
                    method.getLineList().add(
                            "if (writeToken.getBytes(" + encodingString
                                    + ").length < "
                                    + fieldStructure.getMinLength() + ") {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvWriterErr001(
                                                            getLocationString(
                                                                    indexField,
                                                                    fieldStructure
                                                                            .getNo(),
                                                                    fieldStructure
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(fieldStructure
                                                                                    .getDescription())),
                                                            fieldStructure
                                                                    .getMinLength())
                                            + "\");");
                    method.getLineList().add("}");
                }
                if (fieldStructure.getMaxLength() != null) {
                    method.getLineList().add(
                            "if (writeToken.getBytes(" + encodingString
                                    + ").length > "
                                    + fieldStructure.getMaxLength() + ") {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvWriterErr002(
                                                            getLocationString(
                                                                    indexField,
                                                                    fieldStructure
                                                                            .getNo(),
                                                                    fieldStructure
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(fieldStructure
                                                                                    .getDescription())),
                                                            fieldStructure
                                                                    .getMaxLength())
                                            + "\");");
                    method.getLineList().add("}");
                }

                if (fieldStructure.getRequired()) {
                } else {
                    // 任意項目はカッコが開きっぱなしであるので、ここで閉じます。
                    method.getLineList().add("}");
                }

                if (fieldStructure.getType().equals("java.lang.String")) {
                    method.getLineList().add(
                            "if (writeToken.indexOf(\""
                                    + processStructure.getDelimiter()
                                    + "\") >= 0) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvWriterErr003(
                                                            getLocationString(
                                                                    indexField,
                                                                    fieldStructure
                                                                            .getNo(),
                                                                    fieldStructure
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(fieldStructure
                                                                                    .getDescription())),
                                                            processStructure
                                                                    .getDelimiter())
                                            + "\");");
                    method.getLineList().add("}");
                    method.getLineList().add("fWriter.write(writeToken);");
                } else if (fieldStructure.getType().equals(
                        "java.lang.String(quote)")) {
                    // 型の利用を追加します。
                    fCgSourceFile.getImportList().add(
                            processStructure.getRuntimePackage()
                                    + ".util.BlancoCsvRuntimeUtil");

                    method.getLineList().add(
                            writerBundle.getWriterecordLine02());
                    method
                            .getLineList()
                            .add(
                                    "fWriter.write(BlancoCsvRuntimeUtil.getTokenWithQuote(writeToken));");
                } else {
                    method.getLineList().add("fWriter.write(writeToken);");
                }
            }
            method.getLineList().add("");
            method.getLineList().add(writerBundle.getWriterecordLine03());
            method.getLineList().add("fWriter.newLine();");
            method.getLineList().add("fLineCounter++;");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod("getWriter",
                    "CSV処理で関連づけられるライタを返します。");
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn("java.io.BufferedWriter",
                    "CSV処理で関連づけられるライタ。"));

            method.getLineList().add("return fWriter;");
        }

        {
            // DI対策。
            final BlancoCgMethod method = fCgFactory.createMethod("setWriter",
                    "CSV処理で関連づけられるライタを設定します。");
            fCgClass.getMethodList().add(method);
            method.getParameterList().add(
                    fCgFactory.createParameter("argWriter",
                            "java.io.BufferedWriter", "CSV処理で関連づけられるライタ。"));

            method.getLineList().add("fWriter = argWriter;");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod(
                    "getLineCounter", "現在処理中の行カウンタを返します。");
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn("long", "現在処理中の行カウンタ。"));

            // メソッドの実装
            // public void implement() {
            method.getLineList().add("return fLineCounter;");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod("flush",
                    writerBundle.getFlushJavadoc01());
            fCgClass.getMethodList().add(method);
            method.getLangDoc().getDescriptionList().add(
                    writerBundle.getFlushJavadoc02());
            method.getThrowList().add(
                    fCgFactory.createException(writerBundle
                            .getFlushThrows01Type(), writerBundle
                            .getFlushThrows01Javadoc()));

            // メソッドの実装
            method.getLineList().add("if (fWriter != null) {");
            method.getLineList().add("fWriter.flush();");
            method.getLineList().add("}");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod("close",
                    writerBundle.getCloseJavadoc01());
            fCgClass.getMethodList().add(method);
            method.getLangDoc().getDescriptionList().add(
                    writerBundle.getCloseJavadoc02());
            method.getThrowList().add(
                    fCgFactory.createException(writerBundle
                            .getCloseThrows01Type(), writerBundle
                            .getCloseThrows01Javadoc()));

            // メソッドの実装
            method.getLineList().add("if (fWriter != null) {");
            if (processStructure.getTitleRow().equals("title with quote")
                    || processStructure.getTitleRow().equals(
                            "title without quote")) {
                method.getLineList().add("if (fIsTitleProcessed == false) {");
                method.getLineList().add("// タイトル行を書き込み。");
                method.getLineList().add("writeTitle();");
                method.getLineList().add("fIsTitleProcessed = true;");
                method.getLineList().add("}");
                method.getLineList().add("");
            }
            method.getLineList().add("fWriter.close();");
            method.getLineList().add("}");
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }

    private String getLocationString(int indexField, String fieldNo,
            String fieldName, String fieldDescription) {
        return writerBundle.getGetlocationstringLine01("" + (indexField + 1),
                (fieldNo == null ? "" : bundle.getFieldNo(fieldNo) + " "),
                fieldName
                        + (fieldDescription == null ? "" : "/"
                                + fieldDescription));
    }
}
