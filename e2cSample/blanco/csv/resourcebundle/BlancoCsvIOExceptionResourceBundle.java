/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.resourcebundle;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * BlancoCsvIOExceptionクラスのソースコード生成のためのリソースバンドルです。
 *
 * リソースバンドル定義: [BlancoCsvIOException]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvIOExceptionResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvIOExceptionResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvIOException]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoCsvIOExceptionResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvIOException");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvIOExceptionResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvIOException]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoCsvIOExceptionResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvIOException", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvIOExceptionResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvIOException]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoCsvIOExceptionResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvIOException", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * 内部的に保持しているリソースバンドルオブジェクトを取得します。
     *
     * @return 内部的に保持しているリソースバンドルオブジェクト。
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoCsvIOException], key[PACKAGE.PREFIX]
     *
     * [.io] (ja)<br>
     *
     * @return key[PACKAGE.PREFIX]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getPackagePrefix() {
        // 初期値として定義書の値を利用します。
        String strFormat = ".io";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("PACKAGE.PREFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[CLASS_NAME]
     *
     * [BlancoCsvIOException] (ja)<br>
     *
     * @return key[CLASS_NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClassName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "BlancoCsvIOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASS_NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[SUPERCLASS_NAME]
     *
     * [java.lang.Exception] (ja)<br>
     *
     * @return key[SUPERCLASS_NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getSuperclassName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.lang.Exception";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("SUPERCLASS_NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[CLASSCOMMENT.01]
     *
     * [blancoCsvが生成したクラスが実行時に発生する例外クラスです。] (ja)<br>
     *
     * @return key[CLASSCOMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "blancoCsvが生成したクラスが実行時に発生する例外クラスです。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[CLASSCOMMENT.02]
     *
     * [型・桁チェックの結果が異常であった場合などにこの例外は発生します。] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "型・桁チェックの結果が異常であった場合などにこの例外は発生します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[CONSTRUCTOR.01.ARG.01.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Arg01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[CONSTRUCTOR.01.LINE.01]
     *
     * [super(message);] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Line01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "super(message);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }
}
