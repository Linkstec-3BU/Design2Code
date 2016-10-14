/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * XXXXXXXXCsvReaderクラスのソースコード生成のためのリソースバンドルです。
 *
 * リソースバンドル定義: [BlancoCsvReader]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvReaderResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvReaderResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvReader]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoCsvReaderResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvReader");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvReaderResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvReader]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoCsvReaderResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvReader", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvReaderResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsvReader]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoCsvReaderResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvReader", locale, loader);
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
     * bundle[BlancoCsvReader], key[PACKAGE.PREFIX]
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
     * bundle[BlancoCsvReader], key[CLASS_NAME.SUFFIX]
     *
     * [CsvReader] (ja)<br>
     *
     * @return key[CLASS_NAME.SUFFIX]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClassNameSuffix() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CsvReader";
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
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.01]
     *
     * [ファイル定義[{0}]のリーダクラス。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CLASSCOMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義[{0}]のリーダクラス。";
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
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.02]
     *
     * [このクラスはblancoCsvファイル定義書から自動生成されたリーダクラスです。&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このクラスはblancoCsvファイル定義書から自動生成されたリーダクラスです。<br>";
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
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.03.CASE01]
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
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.03.CASE02]
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
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.04]
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
     * bundle[BlancoCsvReader], key[ADDUSINGTYPE.01.SUFFIX]
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
     * bundle[BlancoCsvReader], key[FIELD.READER.TYPE]
     *
     * [java.io.BufferedReader] (ja)<br>
     *
     * @return key[FIELD.READER.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldReaderType() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.BufferedReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.NAME]
     *
     * [fReader] (ja)<br>
     *
     * @return key[FIELD.READER.NAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldReaderName() {
        // 初期値として定義書の値を利用します。
        String strFormat = "fReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.JAVADOC.01]
     *
     * [リーダオブジェクト] (ja)<br>
     *
     * @return key[FIELD.READER.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldReaderJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "リーダオブジェクト";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.JAVADOC.02]
     *
     * [CSV処理で関連づけられる、実際に入力を行うリーダ。] (ja)<br>
     *
     * @return key[FIELD.READER.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldReaderJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CSV処理で関連づけられる、実際に入力を行うリーダ。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.TYPE]
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
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.NAME]
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
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.JAVADOC.01]
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
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.JAVADOC.02]
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
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.DEFAULT]
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
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.TYPE]
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
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX]
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
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]
     *
     * [項目[{0}]の読み込みの際に利用するフォーマッター。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldSimpleDateFormatJavadoc01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "項目[{0}]の読み込みの際に利用するフォーマッター。";
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
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02]
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
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.JAVADOC.01]
     *
     * [CSVリーダクラスのコンストラクタ。] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Javadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "CSVリーダクラスのコンストラクタ。";
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
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.JAVADOC.02]
     *
     * [与えられたリーダを関連づけます。] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Javadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "与えられたリーダを関連づけます。";
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
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.ARG.01.TYPE]
     *
     * [java.io.BufferedReader] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Arg01Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.BufferedReader";
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
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]
     *
     * [関連づけるリーダ。] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getConstructor01Arg01Javadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけるリーダ。";
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
     * bundle[BlancoCsvReader], key[READRECORD.JAVADOC]
     *
     * [関連づけられたリーダから、次の一行を読み込みます。] (ja)<br>
     *
     * @return key[READRECORD.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたリーダから、次の一行を読み込みます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.RETURN.JAVADOC]
     *
     * [行オブジェクトを返します。リーダが終端に達し、もはや行が無い場合には nullを返します。] (ja)<br>
     *
     * @return key[READRECORD.RETURN.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordReturnJavadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "行オブジェクトを返します。リーダが終端に達し、もはや行が無い場合には nullを返します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.THROWS.01.JAVADOC]
     *
     * [入力データが不正な場合など。] (ja)<br>
     *
     * @return key[READRECORD.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "入力データが不正な場合など。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.THROWS.02.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[READRECORD.THROWS.02.TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordThrows02Type() {
        // 初期値として定義書の値を利用します。
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.THROWS.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.THROWS.02.JAVADOC]
     *
     * [関連づけられたリーダで例外が発生した場合。] (ja)<br>
     *
     * @return key[READRECORD.THROWS.02.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordThrows02Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたリーダで例外が発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.THROWS.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.03]
     *
     * [// ファイルの終端に到達しました。] (ja)<br>
     *
     * @return key[READRECORD.LINE.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordLine03() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// ファイルの終端に到達しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.07]
     *
     * [final {0}CsvRecord record = new {0}CsvRecord();] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[READRECORD.LINE.07]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordLine07(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "final {0}CsvRecord record = new {0}CsvRecord();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.07");
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
     * bundle[BlancoCsvReader], key[READRECORD.LINE.12]
     *
     * [// {0}項目名[{1}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[READRECORD.LINE.12]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordLine12(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "// {0}項目名[{1}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.12");
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
     * bundle[BlancoCsvReader], key[READRECORD.LINE.21]
     *
     * [// クオートを考慮した読み込みを行います。] (ja)<br>
     *
     * @return key[READRECORD.LINE.21]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordLine21() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// クオートを考慮した読み込みを行います。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.21");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.22.CASE01]
     *
     * [tokenString = readTokenWithQuote(''{0}'', {1});] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[READRECORD.LINE.22.CASE01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordLine22Case01(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "tokenString = readTokenWithQuote(''{0}'', {1});";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.22.CASE01");
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
     * bundle[BlancoCsvReader], key[READRECORD.LINE.22.CASE02]
     *
     * [tokenString = readToken(''{0}'', {1});] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[READRECORD.LINE.22.CASE02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getReadrecordLine22Case02(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "tokenString = readToken(''{0}'', {1});";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.22.CASE02");
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
     * bundle[BlancoCsvReader], key[CLOSE.JAVADOC.01]
     *
     * [このリーダを閉じます。] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseJavadoc01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このリーダを閉じます。";
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
     * bundle[BlancoCsvReader], key[CLOSE.JAVADOC.02]
     *
     * [関連づけられたリーダに対してもclose()を呼び出します。] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseJavadoc02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたリーダに対してもclose()を呼び出します。";
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
     * bundle[BlancoCsvReader], key[CLOSE.THROWS.01.TYPE]
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
     * bundle[BlancoCsvReader], key[CLOSE.THROWS.01.JAVADOC]
     *
     * [関連づけられたリーダのclose()に失敗した場合。] (ja)<br>
     *
     * @return key[CLOSE.THROWS.01.JAVADOC]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCloseThrows01Javadoc() {
        // 初期値として定義書の値を利用します。
        String strFormat = "関連づけられたリーダのclose()に失敗した場合。";
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
     * bundle[BlancoCsvReader], key[GETLOCATIONSTRING.LINE.01]
     *
     * [入力&quot; + fLineCounter + &quot;行目 {0}項目目。{1}項目名[{2}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[GETLOCATIONSTRING.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getGetlocationstringLine01(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "入力\" + fLineCounter + \"行目 {0}項目目。{1}項目名[{2}]";
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
