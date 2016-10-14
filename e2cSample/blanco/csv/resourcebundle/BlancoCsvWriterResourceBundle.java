/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * XXXXXXXXCsvWriterクラスのソースコード生成のためのリソースバンドルです。
 *
 * リソースバンドル定義: [BlancoCsvWriter]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvWriterResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvWriterResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvWriter]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoCsvWriterResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvWriter");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvWriterResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvWriter]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoCsvWriterResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvWriter", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvWriterResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvWriter]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoCsvWriterResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvWriter", locale, loader);
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
     * bundle[BlancoCsvWriter], key[PACKAGE.PREFIX]
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
     * bundle[BlancoCsvWriter], key[CLASS_NAME.SUFFIX]
     *
     * [CsvWriter] (ja)<br>
     *
     * @return key[CLASS_NAME.SUFFIX]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClassNameSuffix() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CsvWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASS_NAME.SUFFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.01]
     *
     * [ファイル定義[{0}]のライタクラス。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CLASSCOMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義[{0}]のライタクラス。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.02]
     *
     * [このクラスはblancoCsvファイル定義書から自動生成されたライタクラスです。&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このクラスはblancoCsvファイル定義書から自動生成されたライタクラスです。<br>";
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
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.03.CASE01]
     *
     * [　1.文字列長チェックには、デフォルトエンコーディングを利用します。&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.03.CASE01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment03Case01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "　1.文字列長チェックには、デフォルトエンコーディングを利用します。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.03.CASE01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.03.CASE02]
     *
     * [　1.文字列長チェックには、[{0}]エンコーディングを利用します。&lt;br&gt;] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CLASSCOMMENT.03.CASE02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment03Case02(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "　1.文字列長チェックには、[{0}]エンコーディングを利用します。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.03.CASE02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.04]
     *
     * [　2.クラスの利用した後は必ず close()を呼び出してください。&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment04() {
        // 初期値として定義書の値を利用します。
        String strFormat = "　2.クラスの利用した後は必ず close()を呼び出してください。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.04");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[ADDUSINGTYPE.01.SUFFIX]
     *
     * [.io.BlancoCsvIOException] (ja)<br>
     *
     * @return key[ADDUSINGTYPE.01.SUFFIX]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getAddusingtype01Suffix() {
        // 初期値として定義書の値を利用します。
        String strFormat = ".io.BlancoCsvIOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ADDUSINGTYPE.01.SUFFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.TYPE]
     *
     * [java.io.BufferedWriter] (ja)<br>
     *
     * @return key[FIELD.WRITER.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldWriterType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.BufferedWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.NAME]
     *
     * [fWriter] (ja)<br>
     *
     * @return key[FIELD.WRITER.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldWriterName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.JAVADOC.01]
     *
     * [ライタオブジェクト。] (ja)<br>
     *
     * @return key[FIELD.WRITER.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldWriterJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "ライタオブジェクト。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.JAVADOC.02]
     *
     * [CSV処理で関連づけられる、実際に出力を行うライタ。] (ja)<br>
     *
     * @return key[FIELD.WRITER.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldWriterJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CSV処理で関連づけられる、実際に出力を行うライタ。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.TYPE]
     *
     * [long] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldLineCounterType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "long";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.NAME]
     *
     * [fLineCounter] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldLineCounterName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fLineCounter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.JAVADOC.01]
     *
     * [現在処理中の行カウンタ。] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldLineCounterJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "現在処理中の行カウンタ。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.JAVADOC.02]
     *
     * [現在処理を行っている行の位置。] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldLineCounterJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "現在処理を行っている行の位置。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.DEFAULT]
     *
     * [0] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.DEFAULT]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldLineCounterDefault() {
        // 初期値として定義書の値を利用します。
        String strFormat = "0";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.DEFAULT");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.TYPE]
     *
     * [java.text.SimpleDateFormat] (ja)<br>
     *
     * @return key[FIELD.SIMPLE_DATE_FORMAT.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldSimpleDateFormatType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.text.SimpleDateFormat";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX]
     *
     * [fSimpleDateFormat] (ja)<br>
     *
     * @return key[FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldSimpleDateFormatNamePrefix() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fSimpleDateFormat";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]
     *
     * [項目[{0}]の書き込みの際に利用するフォーマッター。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldSimpleDateFormatJavadoc01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "項目[{0}]の書き込みの際に利用するフォーマッター。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02]
     *
     * [※インスタンス化しておくことによりメモリゴミ発生を抑制します。] (ja)<br>
     *
     * @return key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldSimpleDateFormatJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "※インスタンス化しておくことによりメモリゴミ発生を抑制します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.JAVADOC.01]
     *
     * [CSVライタクラスのコンストラクタ。] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Javadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CSVライタクラスのコンストラクタ。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.JAVADOC.02]
     *
     * [与えられたライタと関連づけます。] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Javadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "与えられたライタと関連づけます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.ARG.01.TYPE]
     *
     * [java.io.BufferedWriter] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Arg01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.BufferedWriter";
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
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]
     *
     * [関連づけるライタ。] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Arg01Javadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけるライタ。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.ARG.01.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.JAVADOC.01]
     *
     * [CSVファイルのタイトル行を書き出します。] (ja)<br>
     *
     * @return key[WRITETITLE.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWritetitleJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CSVファイルのタイトル行を書き出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.JAVADOC.02]
     *
     * [タイトルはデリミタで区切られながらライタに出力され、最後に改行コードが付与されます。&lt;br&gt;] (ja)<br>
     *
     * @return key[WRITETITLE.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWritetitleJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "タイトルはデリミタで区切られながらライタに出力され、最後に改行コードが付与されます。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.JAVADOC.03]
     *
     * [タイトルはダブルクオーテーションで囲まれます。] (ja)<br>
     *
     * @return key[WRITETITLE.JAVADOC.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWritetitleJavadoc03() {
        // 初期値として定義書の値を利用します。
        String strFormat = "タイトルはダブルクオーテーションで囲まれます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.JAVADOC.03");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[WRITETITLE.THROWS.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWritetitleThrows01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.THROWS.01.JAVADOC]
     *
     * [関連づけられたライタ出力の際に例外が発生した場合。] (ja)<br>
     *
     * @return key[WRITETITLE.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWritetitleThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたライタ出力の際に例外が発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.JAVADOC.01]
     *
     * [与えられた一行を書き出します。] (ja)<br>
     *
     * @return key[WRITERECORD.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "与えられた一行を書き出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.JAVADOC.02]
     *
     * [データはデリミタで区切られながらライタに出力され、最後に改行コードが付与されます。] (ja)<br>
     *
     * @return key[WRITERECORD.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "データはデリミタで区切られながらライタに出力され、最後に改行コードが付与されます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.ARG.01.JAVADOC]
     *
     * [レコードオブジェクト。] (ja)<br>
     *
     * @return key[WRITERECORD.ARG.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordArg01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "レコードオブジェクト。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.THROWS.01.JAVADOC]
     *
     * [与えられたレコード中の項目値が不正な場合など。] (ja)<br>
     *
     * @return key[WRITERECORD.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "与えられたレコード中の項目値が不正な場合など。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.THROWS.02.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[WRITERECORD.THROWS.02.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordThrows02Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.THROWS.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.THROWS.02.JAVADOC]
     *
     * [関連づけられたライタ出力の際に例外が発生した場合。] (ja)<br>
     *
     * @return key[WRITERECORD.THROWS.02.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordThrows02Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたライタ出力の際に例外が発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.THROWS.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.LINE.01]
     *
     * [// {0}項目名[{1}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[WRITERECORD.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordLine01(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "// {0}項目名[{1}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.LINE.02]
     *
     * [// ダブルクオート処理付きで書き出しを行います。] (ja)<br>
     *
     * @return key[WRITERECORD.LINE.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordLine02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ダブルクオート処理付きで書き出しを行います。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.LINE.03]
     *
     * [// 最後に改行コードが付与されます。] (ja)<br>
     *
     * @return key[WRITERECORD.LINE.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getWriterecordLine03() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 最後に改行コードが付与されます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.JAVADOC.01]
     *
     * [このライタをフラッシュします。] (ja)<br>
     *
     * @return key[FLUSH.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFlushJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このライタをフラッシュします。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.JAVADOC.02]
     *
     * [関連づけられたライタに対してもflush()を呼び出します。] (ja)<br>
     *
     * @return key[FLUSH.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFlushJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたライタに対してもflush()を呼び出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[FLUSH.THROWS.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFlushThrows01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.THROWS.01.JAVADOC]
     *
     * [関連づけられたライタのflush()に失敗した場合。] (ja)<br>
     *
     * @return key[FLUSH.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFlushThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたライタのflush()に失敗した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLOSE.JAVADOC.01]
     *
     * [このライタを閉じます。] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このライタを閉じます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLOSE.JAVADOC.02]
     *
     * [関連づけられたライタに対してもclose()を呼び出します。] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたライタに対してもclose()を呼び出します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLOSE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[CLOSE.THROWS.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseThrows01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLOSE.THROWS.01.JAVADOC]
     *
     * [関連づけられたライタのclose()に失敗した場合。] (ja)<br>
     *
     * @return key[CLOSE.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたライタのclose()に失敗した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[GETLOCATIONSTRING.LINE.01]
     *
     * [出力&quot; + (fLineCounter + 1) + &quot;行目 {0}項目目。{1}項目名[{2}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[GETLOCATIONSTRING.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGetlocationstringLine01(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "出力\" + (fLineCounter + 1) + \"行目 {0}項目目。{1}項目名[{2}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETLOCATIONSTRING.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }
}
