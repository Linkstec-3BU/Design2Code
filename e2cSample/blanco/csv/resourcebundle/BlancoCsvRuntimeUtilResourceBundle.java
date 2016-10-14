/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.resourcebundle;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * BlancoCsvRuntimeUtilクラスのソースコード生成のためのリソースバンドルです。
 *
 * リソースバンドル定義: [BlancoCsvRuntimeUtil]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvRuntimeUtilResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvRuntimeUtilResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvRuntimeUtil]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoCsvRuntimeUtilResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvRuntimeUtil");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvRuntimeUtilResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvRuntimeUtil]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoCsvRuntimeUtilResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvRuntimeUtil", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvRuntimeUtilResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvRuntimeUtil]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoCsvRuntimeUtilResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvRuntimeUtil", locale, loader);
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
     * bundle[BlancoCsvRuntimeUtil], key[PACKAGE.PREFIX]
     *
     * [.util] (ja)<br>
     *
     * @return key[PACKAGE.PREFIX]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getPackagePrefix() {
        // 初期値として定義書の値を利用します。
        String strFormat = ".util";
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
     * bundle[BlancoCsvRuntimeUtil], key[CLASS_NAME]
     *
     * [BlancoCsvRuntimeUtil] (ja)<br>
     *
     * @return key[CLASS_NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClassName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "BlancoCsvRuntimeUtil";
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
     * bundle[BlancoCsvRuntimeUtil], key[CLASSCOMMENT.01]
     *
     * [blancoCsvで利用する実行時ユーティリティクラス] (ja)<br>
     *
     * @return key[CLASSCOMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "blancoCsvで利用する実行時ユーティリティクラス";
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
     * bundle[BlancoCsvRuntimeUtil], key[CLASSCOMMENT.02]
     *
     * [このファイルはblancoIgにより自動生成されています。] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このファイルはblancoIgにより自動生成されています。";
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
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.NAME]
     *
     * [readToken] (ja)<br>
     *
     * @return key[READTOKEN.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "readToken";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.JAVADOC]
     *
     * [関連づけられたReaderから 与えられたデリミタを使ってトークンを取り出します。] (ja)<br>
     *
     * @return key[READTOKEN.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたReaderから 与えられたデリミタを使ってトークンを取り出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKEN.ARG.01.TYPE]
     *
     * [java.io.Reader] (ja)<br>
     *
     * @return key[_READTOKEN.ARG.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.Reader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKEN.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKEN.ARG.01.NAME]
     *
     * [argReader] (ja)<br>
     *
     * @return key[_READTOKEN.ARG.01.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg01Name() {
        // 初期値として定義書の値を利用します。
        String strFormat = "argReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKEN.ARG.01.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKEN.ARG.01.JAVADOC]
     *
     * [与えられたリーダ] (ja)<br>
     *
     * @return key[_READTOKEN.ARG.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "与えられたリーダ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKEN.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.02.TYPE]
     *
     * [char] (ja)<br>
     *
     * @return key[READTOKEN.ARG.02.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg02Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "char";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.02.NAME]
     *
     * [delimiter] (ja)<br>
     *
     * @return key[READTOKEN.ARG.02.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg02Name() {
        // 初期値として定義書の値を利用します。
        String strFormat = "delimiter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.02.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.02.JAVADOC]
     *
     * [デリミタ] (ja)<br>
     *
     * @return key[READTOKEN.ARG.02.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg02Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "デリミタ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.03.TYPE]
     *
     * [boolean] (ja)<br>
     *
     * @return key[READTOKEN.ARG.03.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg03Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "boolean";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.03.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.03.NAME]
     *
     * [isEndOfLine] (ja)<br>
     *
     * @return key[READTOKEN.ARG.03.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg03Name() {
        // 初期値として定義書の値を利用します。
        String strFormat = "isEndOfLine";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.03.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.03.JAVADOC]
     *
     * [行の終端であるのかどうかフラグ] (ja)<br>
     *
     * @return key[READTOKEN.ARG.03.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenArg03Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "行の終端であるのかどうかフラグ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.03.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.RETURN.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[READTOKEN.RETURN.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenReturnType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.RETURN.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.RETURN.JAVADOC]
     *
     * [取り出されたトークン。もはやリーダが空の場合にはnullを返します。] (ja)<br>
     *
     * @return key[READTOKEN.RETURN.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenReturnJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "取り出されたトークン。もはやリーダが空の場合にはnullを返します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[READTOKEN.THROWS.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenThrows01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.THROWS.01.JAVADOC]
     *
     * [入出力例外が発生した場合。] (ja)<br>
     *
     * @return key[READTOKEN.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "入出力例外が発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.01]
     *
     * [final StringBuffer buffer = new StringBuffer();] (ja)<br>
     *
     * @return key[READTOKEN.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "final StringBuffer buffer = new StringBuffer();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.02]
     *
     * [for (;;) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "for (;;) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.03]
     *
     * [final int iRead = fLineReader.read();] (ja)<br>
     *
     * @return key[READTOKEN.LINE.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine03() {
        // 初期値として定義書の値を利用します。
        String strFormat = "final int iRead = fLineReader.read();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.04]
     *
     * [if (iRead &lt; 0) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine04() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead < 0) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.05]
     *
     * [// 終端に到達。] (ja)<br>
     *
     * @return key[READTOKEN.LINE.05]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine05() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 終端に到達。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.06]
     *
     * [if (isEndOfLine == false) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.06]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine06() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isEndOfLine == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.07]
     *
     * [throw new BlancoCsvIOException(&quot;行の終端でないのにも関わらずデリミタが現れずに行が終了してしまいました。&quot;);] (ja)<br>
     *
     * @return key[READTOKEN.LINE.07]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine07() {
        // 初期値として定義書の値を利用します。
        String strFormat = "throw new BlancoCsvIOException(\"行の終端でないのにも関わらずデリミタが現れずに行が終了してしまいました。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.08]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.08]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine08() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.08");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.09]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKEN.LINE.09]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine09() {
        // 初期値として定義書の値を利用します。
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.09");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.10]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.10]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine10() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.10");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.11]
     *
     * [if (iRead == delimiter) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.11]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine11() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead == delimiter) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.11");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.12]
     *
     * [if (isEndOfLine) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.12]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine12() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isEndOfLine) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.13]
     *
     * [throw new BlancoCsvIOException(&quot;行の終端であるべきにも関わらずデリミタが現れました。&quot;);] (ja)<br>
     *
     * @return key[READTOKEN.LINE.13]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine13() {
        // 初期値として定義書の値を利用します。
        String strFormat = "throw new BlancoCsvIOException(\"行の終端であるべきにも関わらずデリミタが現れました。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.13");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.14]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.14]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine14() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.14");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.15]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKEN.LINE.15]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine15() {
        // 初期値として定義書の値を利用します。
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.15");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.16]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.16]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine16() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.16");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.17]
     *
     * [buffer.append((char) iRead);] (ja)<br>
     *
     * @return key[READTOKEN.LINE.17]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine17() {
        // 初期値として定義書の値を利用します。
        String strFormat = "buffer.append((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.17");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.18]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.18]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine18() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.18");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.19]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.19]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine19() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.19");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.20]
     *
     * [return buffer.toString();] (ja)<br>
     *
     * @return key[READTOKEN.LINE.20]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenLine20() {
        // 初期値として定義書の値を利用します。
        String strFormat = "return buffer.toString();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.20");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.NAME]
     *
     * [readTokenWithQuote] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "readTokenWithQuote";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.JAVADOC]
     *
     * [関連づけられたReaderから ダブルクオート処理付きで 与えられたデリミタを使ってトークンを取り出します。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたReaderから ダブルクオート処理付きで 与えられたデリミタを使ってトークンを取り出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKENWITHQUOTE.ARG.01.TYPE]
     *
     * [java.io.Reader] (ja)<br>
     *
     * @return key[_READTOKENWITHQUOTE.ARG.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.Reader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKENWITHQUOTE.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKENWITHQUOTE.ARG.01.NAME]
     *
     * [argReader] (ja)<br>
     *
     * @return key[_READTOKENWITHQUOTE.ARG.01.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg01Name() {
        // 初期値として定義書の値を利用します。
        String strFormat = "argReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKENWITHQUOTE.ARG.01.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKENWITHQUOTE.ARG.01.JAVADOC]
     *
     * [与えられたリーダ] (ja)<br>
     *
     * @return key[_READTOKENWITHQUOTE.ARG.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "与えられたリーダ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKENWITHQUOTE.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.02.TYPE]
     *
     * [char] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.02.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg02Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "char";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.02.NAME]
     *
     * [delimiter] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.02.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg02Name() {
        // 初期値として定義書の値を利用します。
        String strFormat = "delimiter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.02.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.02.JAVADOC]
     *
     * [デリミタ] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.02.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg02Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "デリミタ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.03.TYPE]
     *
     * [boolean] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.03.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg03Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "boolean";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.03.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.03.NAME]
     *
     * [isEndOfLine] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.03.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg03Name() {
        // 初期値として定義書の値を利用します。
        String strFormat = "isEndOfLine";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.03.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.03.JAVADOC]
     *
     * [行の終端であるのかどうかフラグ] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.03.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteArg03Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "行の終端であるのかどうかフラグ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.03.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.RETURN.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.RETURN.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteReturnType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.RETURN.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.RETURN.JAVADOC]
     *
     * [取り出されたトークン。もはやリーダが空の場合にはnullを返します。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.RETURN.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteReturnJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "取り出されたトークン。もはやリーダが空の場合にはnullを返します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.THROWS.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteThrows01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.THROWS.01.JAVADOC]
     *
     * [入出力例外が発生した場合。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "入出力例外が発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.01]
     *
     * [final StringBuffer buffer = new StringBuffer();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "final StringBuffer buffer = new StringBuffer();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.02]
     *
     * [boolean isStringStarted = false;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "boolean isStringStarted = false;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.03]
     *
     * [boolean isStringEnded = false;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine03() {
        // 初期値として定義書の値を利用します。
        String strFormat = "boolean isStringEnded = false;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.04]
     *
     * [for (;;) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine04() {
        // 初期値として定義書の値を利用します。
        String strFormat = "for (;;) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.05]
     *
     * [int iRead = fLineReader.read();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.05]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine05() {
        // 初期値として定義書の値を利用します。
        String strFormat = "int iRead = fLineReader.read();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.06]
     *
     * [if (iRead &lt; 0) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.06]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine06() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead < 0) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.07]
     *
     * [// 終端に到達。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.07]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine07() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 終端に到達。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.08]
     *
     * [if (isStringStarted &amp;&amp; isStringEnded == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.08]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine08() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isStringStarted && isStringEnded == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.08");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.09]
     *
     * [// 改行を出力。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.09]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine09() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 改行を出力。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.09");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.10]
     *
     * [buffer.append('\n');] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.10]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine10() {
        // 初期値として定義書の値を利用します。
        String strFormat = "buffer.append('\\n');";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.10");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.11]
     *
     * [// ダブルクオート内。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.11]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine11() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオート内。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.11");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.12]
     *
     * [fLine = fReader.readLine();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.12]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine12() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fLine = fReader.readLine();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.13]
     *
     * [if (fLine == null) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.13]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine13() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (fLine == null) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.13");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.14]
     *
     * [// ダブルクオート内であるのにもかかわらずファイルの終端に到達しました。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.14]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine14() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオート内であるのにもかかわらずファイルの終端に到達しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.14");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.15]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.15]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine15() {
        // 初期値として定義書の値を利用します。
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.15");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.16]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.16]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine16() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.16");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.17]
     *
     * [fLineReader = new StringReader(fLine);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.17]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine17() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fLineReader = new StringReader(fLine);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.17");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.18]
     *
     * [continue;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.18]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine18() {
        // 初期値として定義書の値を利用します。
        String strFormat = "continue;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.18");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.19]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.19]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine19() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.19");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.20]
     *
     * [} else if (isEndOfLine == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.20]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine20() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else if (isEndOfLine == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.20");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.21]
     *
     * [    throw new BlancoCsvIOException(&quot;行の終端でないのにも関わらずデリミタが現れずに行が終了してしまいました。&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.21]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine21() {
        // 初期値として定義書の値を利用します。
        String strFormat = "    throw new BlancoCsvIOException(\"行の終端でないのにも関わらずデリミタが現れずに行が終了してしまいました。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.21");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.22]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.22]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine22() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.22");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.23]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.23]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine23() {
        // 初期値として定義書の値を利用します。
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.23");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.24]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.24]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine24() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.24");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.25]
     *
     * [if (isStringStarted == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.25]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine25() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isStringStarted == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.25");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.26]
     *
     * [if (iRead != '&quot;') {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.26]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine26() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead != '\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.26");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.27]
     *
     * [throw new BlancoCsvIOException(&quot;ダブルクオート無しで文字列が開始されました。&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.27]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine27() {
        // 初期値として定義書の値を利用します。
        String strFormat = "throw new BlancoCsvIOException(\"ダブルクオート無しで文字列が開始されました。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.27");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.28]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.28]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine28() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.28");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.29]
     *
     * [// ダブルクオーテーションは読み飛ばします。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.29]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine29() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオーテーションは読み飛ばします。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.29");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.30]
     *
     * [isStringStarted = true;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.30]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine30() {
        // 初期値として定義書の値を利用します。
        String strFormat = "isStringStarted = true;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.30");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.31]
     *
     * [} else if (isStringEnded) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.31]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine31() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else if (isStringEnded) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.31");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.32]
     *
     * [if (iRead == delimiter) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.32]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine32() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead == delimiter) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.32");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.33]
     *
     * [// 文字列終端に到達しました。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.33]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine33() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 文字列終端に到達しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.33");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.34]
     *
     * [if (isEndOfLine) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.34]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine34() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isEndOfLine) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.34");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.35]
     *
     * [    throw new BlancoCsvIOException(&quot;行の終端であるべきにも関わらずデリミタが現れました。&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.35]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine35() {
        // 初期値として定義書の値を利用します。
        String strFormat = "    throw new BlancoCsvIOException(\"行の終端であるべきにも関わらずデリミタが現れました。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.35");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.36]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.36]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine36() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.36");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.37]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.37]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine37() {
        // 初期値として定義書の値を利用します。
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.37");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.38]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.38]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine38() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.38");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.39]
     *
     * [throw new BlancoCsvIOException(&quot;ダブルクオートによる文字列終了より後に文字列が与えられました。&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.39]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine39() {
        // 初期値として定義書の値を利用します。
        String strFormat = "throw new BlancoCsvIOException(\"ダブルクオートによる文字列終了より後に文字列が与えられました。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.39");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.40]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.40]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine40() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.40");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.41]
     *
     * [// 通常の文字列エリア] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.41]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine41() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 通常の文字列エリア";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.41");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.42]
     *
     * [if (iRead == '&quot;') {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.42]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine42() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead == '\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.42");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.43]
     *
     * [// ダブルクオートが重ねられたものでないかどうかチェックします。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.43]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine43() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオートが重ねられたものでないかどうかチェックします。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.43");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.44]
     *
     * [fLineReader.mark(1);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.44]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine44() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fLineReader.mark(1);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.44");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.45]
     *
     * [if (fLineReader.read() == '&quot;') {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.45]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine45() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (fLineReader.read() == '\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.45");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.46]
     *
     * [// エスケープされたダブルクオート] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.46]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine46() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// エスケープされたダブルクオート";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.46");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.47]
     *
     * [// 2つでひとつなので、ひとつは読み捨てます。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.47]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine47() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 2つでひとつなので、ひとつは読み捨てます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.47");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.48]
     *
     * [buffer.append((char) iRead);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.48]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine48() {
        // 初期値として定義書の値を利用します。
        String strFormat = "buffer.append((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.48");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.49]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.49]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine49() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.49");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.50]
     *
     * [// ダブルクオートによるエスケープではありませんでした。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.50]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine50() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオートによるエスケープではありませんでした。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.50");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.51]
     *
     * [// これは終端を意味しています。] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.51]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine51() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// これは終端を意味しています。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.51");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.52]
     *
     * [fLineReader.reset();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.52]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine52() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fLineReader.reset();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.52");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.53]
     *
     * [isStringEnded = true;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.53]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine53() {
        // 初期値として定義書の値を利用します。
        String strFormat = "isStringEnded = true;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.53");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.54]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.54]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine54() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.54");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.55]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.55]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine55() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.55");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.56]
     *
     * [buffer.append((char) iRead);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.56]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine56() {
        // 初期値として定義書の値を利用します。
        String strFormat = "buffer.append((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.56");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.57]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.57]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine57() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.57");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.58]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.58]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine58() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.58");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.59]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.59]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine59() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.59");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.60]
     *
     * [if (isStringStarted == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.60]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine60() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isStringStarted == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.60");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.61]
     *
     * [throw new BlancoCsvIOException(&quot;ダブルクオートが必要な文字列であるのにダブルクオートによる開始が現れませんでした。&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.61]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine61() {
        // 初期値として定義書の値を利用します。
        String strFormat = "throw new BlancoCsvIOException(\"ダブルクオートが必要な文字列であるのにダブルクオートによる開始が現れませんでした。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.61");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.62]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.62]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine62() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.62");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.63]
     *
     * [if (isStringEnded == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.63]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine63() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (isStringEnded == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.63");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.64]
     *
     * [throw new BlancoCsvIOException(&quot;ダブルクオートが必要な文字列であるのにダブルクオートによる終了が現れませんでした。&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.64]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine64() {
        // 初期値として定義書の値を利用します。
        String strFormat = "throw new BlancoCsvIOException(\"ダブルクオートが必要な文字列であるのにダブルクオートによる終了が現れませんでした。\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.64");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.65]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.65]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine65() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.65");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.66]
     *
     * [return buffer.toString();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.66]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadtokenwithquoteLine66() {
        // 初期値として定義書の値を利用します。
        String strFormat = "return buffer.toString();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.66");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.NAME]
     *
     * [getTokenWithQuote] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "getTokenWithQuote";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.JAVADOC]
     *
     * [ダブルクオートエスケープ処理付きの文字列を取得します] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "ダブルクオートエスケープ処理付きの文字列を取得します";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ARG.01.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ARG.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteArg01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ARG.01.JAVADOC]
     *
     * [書き出したい文字列] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ARG.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteArg01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "書き出したい文字列";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.RETURN.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.RETURN.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteReturnType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.RETURN.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.RETURN.JAVADOC]
     *
     * [ダブルクオートエスケープ処理付きの文字列] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.RETURN.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteReturnJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "ダブルクオートエスケープ処理付きの文字列";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.THROWS.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteThrows01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.THROWS.01.JAVADOC]
     *
     * [入出力例外などが発生した場合。] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "入出力例外などが発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ADDUSINGTYPE.01]
     *
     * [java.io.StringWriter] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ADDUSINGTYPE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteAddusingtype01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.StringWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ADDUSINGTYPE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ADDUSINGTYPE.02]
     *
     * [java.io.StringReader] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ADDUSINGTYPE.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteAddusingtype02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.StringReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ADDUSINGTYPE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.01]
     *
     * [final StringWriter writer = new StringWriter();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "final StringWriter writer = new StringWriter();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.02]
     *
     * [writer.write(&quot;\&quot;&quot;);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "writer.write(\"\\\"\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.03]
     *
     * [] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine03() {
        // 初期値として定義書の値を利用します。
        String strFormat = "";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.04]
     *
     * [final StringReader reader = new StringReader(value);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine04() {
        // 初期値として定義書の値を利用します。
        String strFormat = "final StringReader reader = new StringReader(value);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.05]
     *
     * [for (;;) {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.05]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine05() {
        // 初期値として定義書の値を利用します。
        String strFormat = "for (;;) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.06]
     *
     * [final int iRead = reader.read();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.06]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine06() {
        // 初期値として定義書の値を利用します。
        String strFormat = "final int iRead = reader.read();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.07]
     *
     * [if (iRead &lt; 0) {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.07]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine07() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead < 0) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.08]
     *
     * [// 終端に到達。] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.08]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine08() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 終端に到達。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.08");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.09]
     *
     * [break;] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.09]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine09() {
        // 初期値として定義書の値を利用します。
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.09");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.10]
     *
     * [}] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.10]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine10() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.10");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.11]
     *
     * [if (iRead == '\&quot;') {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.11]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine11() {
        // 初期値として定義書の値を利用します。
        String strFormat = "if (iRead == '\\\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.11");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.12]
     *
     * [// ダブルクオートは二重で書き出します。] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.12]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine12() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオートは二重で書き出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.13]
     *
     * [writer.write(&quot;\&quot;\&quot;&quot;);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.13]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine13() {
        // 初期値として定義書の値を利用します。
        String strFormat = "writer.write(\"\\\"\\\"\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.13");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.14]
     *
     * [} else {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.14]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine14() {
        // 初期値として定義書の値を利用します。
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.14");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.15]
     *
     * [writer.write((char) iRead);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.15]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine15() {
        // 初期値として定義書の値を利用します。
        String strFormat = "writer.write((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.15");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.16]
     *
     * [}] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.16]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine16() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.16");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.17]
     *
     * [}] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.17]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine17() {
        // 初期値として定義書の値を利用します。
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.17");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.18]
     *
     * [] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.18]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine18() {
        // 初期値として定義書の値を利用します。
        String strFormat = "";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.18");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.19]
     *
     * [writer.write(&quot;\&quot;&quot;);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.19]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine19() {
        // 初期値として定義書の値を利用します。
        String strFormat = "writer.write(\"\\\"\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.19");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.20]
     *
     * [writer.close();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.20]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine20() {
        // 初期値として定義書の値を利用します。
        String strFormat = "writer.close();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.20");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.21]
     *
     * [return writer.toString();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.21]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGettokenwithquoteLine21() {
        // 初期値として定義書の値を利用します。
        String strFormat = "return writer.toString();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.21");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }
}
