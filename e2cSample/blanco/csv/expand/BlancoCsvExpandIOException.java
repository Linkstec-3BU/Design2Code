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
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoStringUtil;
import blanco.csv.resourcebundle.BlancoCsvIOExceptionResourceBundle;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvExpandIOException {
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

    private final BlancoCsvIOExceptionResourceBundle bundle = new BlancoCsvIOExceptionResourceBundle();

    /**
     * 自動生成するソースファイルの文字エンコーディング。
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    public void expand(final BlancoCsvStructure processStructure,
            final File directoryTarget) {

        // 従来と互換性を持たせるため、/mainサブフォルダに出力します。
        final File fileBlancoMain = new File(directoryTarget.getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getRuntimePackage()
                + bundle.getPackagePrefix(),
                "このソースコードは blanco Frameworkによって自動生成されています。");
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(bundle.getClassName(),
                BlancoStringUtil.null2Blank(bundle.getClasscomment01()));
        fCgSourceFile.getClassList().add(fCgClass);
        fCgClass.getExtendClassList().add(
                fCgFactory.createType(bundle.getSuperclassName()));
        fCgClass.getLangDoc().getDescriptionList().add(
                bundle.getClasscomment02());

        // シリアルIDの警告を抑制。
        fCgClass.getAnnotationList().add("SuppressWarnings(\"serial\")");

        {
            final BlancoCgMethod method = fCgFactory.createMethod(bundle
                    .getClassName(), "メッセージを伴いblancoCsv例外クラスを生成します。");
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getParameterList().add(
                    fCgFactory.createParameter("message", bundle
                            .getConstructor01Arg01Type(), "メッセージ。"));
            method.getLineList().add(bundle.getConstructor01Line01());
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod(bundle
                    .getClassName(), "メッセージおよび原因を伴いblancoCsv例外クラスを生成します。");
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getParameterList().add(
                    fCgFactory.createParameter("message", bundle
                            .getConstructor01Arg01Type(), "メッセージ。"));
            method.getParameterList().add(
                    fCgFactory.createParameter("argCause",
                            "java.lang.Throwable", "原因となる例外オブジェクト。"));
            method.getLineList().add("super(message, argCause);");
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }
}
