/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoCsvの基本的なメッセージリソースを蓄えます。
 *
 * リソースバンドル定義: [BlancoCsv]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsv]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoCsvResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsv");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsv]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoCsvResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsv", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoCsv]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoCsvResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsv", locale, loader);
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
     * bundle[BlancoCsv], key[METAFILE_DISPLAYNAME]
     *
     * [ファイル定義書(CSV)] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMetafileDisplayname() {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義書(CSV)";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsv], key[META2XML.ELEMENT_COMMON]
     *
     * [blancocsv-common] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_COMMON]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMeta2xmlElementCommon() {
        // 初期値として定義書の値を利用します。
        String strFormat = "blancocsv-common";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_COMMON");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsv], key[META2XML.ELEMENT_LIST]
     *
     * [blancocsv-fieldList] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_LIST]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMeta2xmlElementList() {
        // 初期値として定義書の値を利用します。
        String strFormat = "blancocsv-fieldList";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_LIST");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoCsv], key[CSV_READER.ERR001]
     *
     * [{0}の処理中において不正な終端を検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr001(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において不正な終端を検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR001");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR002]
     *
     * [{0}の処理中においてMIN長さ({1})よりも短い値[&quot; + tokenString + &quot;]を検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr002(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中においてMIN長さ({1})よりも短い値[\" + tokenString + \"]を検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR002");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR003]
     *
     * [{0}の処理中においてMAX長さ({1})よりも長い値[&quot; + tokenString + &quot;]を検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR003]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr003(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中においてMAX長さ({1})よりも長い値[\" + tokenString + \"]を検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR003");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR004]
     *
     * [{0}の処理中において数値(int)としては解析できない文字[&quot; + tokenString + &quot;]を検知しました。:] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR004]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr004(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において数値(int)としては解析できない文字[\" + tokenString + \"]を検知しました。:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR004");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR005]
     *
     * [{0}の処理中において数値(long)としては解析できない文字[&quot; + tokenString + &quot;]を検知しました。:] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR005]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr005(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において数値(long)としては解析できない文字[\" + tokenString + \"]を検知しました。:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR005");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR006]
     *
     * [{0}の処理中において与えられた形式[&quot; + fSimpleDateFormat{1}.toPattern() + &quot;]では解析できない文字列[&quot; + tokenString + &quot;]を検知しました。:] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR006]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr006(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において与えられた形式[\" + fSimpleDateFormat{1}.toPattern() + \"]では解析できない文字列[\" + tokenString + \"]を検知しました。:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR006");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR007]
     *
     * [{0}の処理中において数値(decimal)としては解析できない文字[&quot; + tokenString + &quot;]を検知しました。:] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR007]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr007(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において数値(decimal)としては解析できない文字[\" + tokenString + \"]を検知しました。:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR007");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR008]
     *
     * [{0}の処理中において必須項目に値が入っていないことを検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_READER.ERR008]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvReaderErr008(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において必須項目に値が入っていないことを検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR008");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR001]
     *
     * [{0}の処理中においてMIN長さ({1})よりも短い値[&quot; + writeToken + &quot;]を検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_WRITER.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvWriterErr001(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中においてMIN長さ({1})よりも短い値[\" + writeToken + \"]を検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR001");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR002]
     *
     * [{0}の処理中においてMAX長さ({1})よりも長い値[&quot; + writeToken + &quot;]を検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_WRITER.ERR002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvWriterErr002(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中においてMAX長さ({1})よりも長い値[\" + writeToken + \"]を検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR002");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR003]
     *
     * [{0}の処理中においてデータ中[&quot; + writeToken + &quot;]に項目のデリミタ[{1}]が含まれることを検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_WRITER.ERR003]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvWriterErr003(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中においてデータ中[\" + writeToken + \"]に項目のデリミタ[{1}]が含まれることを検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR003");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR004]
     *
     * [{0}の処理中において必須項目にnullが与えられていることを検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_WRITER.ERR004]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvWriterErr004(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において必須項目にnullが与えられていることを検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR004");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR005]
     *
     * [{0}の処理中において必須項目に長さ0の文字列が与えられていることを検知しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CSV_WRITER.ERR005]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getCsvWriterErr005(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}の処理中において必須項目に長さ0の文字列が与えられていることを検知しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR005");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR001]
     *
     * [ファイル定義書(CSV) ファイル定義ID[{0}]のパッケージ名が指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr001(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義書(CSV) ファイル定義ID[{0}]のパッケージ名が指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR001");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR002]
     *
     * [ファイル定義書(CSV) ファイル定義ID[{0}]のデリミタが指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr002(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義書(CSV) ファイル定義ID[{0}]のデリミタが指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR002");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR003]
     *
     * [ファイル定義書(CSV) ファイル定義ID[{0}]の「デリミタ」を「任意指定」に設定する場合には、「任意指定デリミタ文字」を指定する必要があります。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR003]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr003(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義書(CSV) ファイル定義ID[{0}]の「デリミタ」を「任意指定」に設定する場合には、「任意指定デリミタ文字」を指定する必要があります。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR003");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR004]
     *
     * [ファイル定義ID[{0}] 項目[{1}]の「型」が指定されていません。「型」を指定してください。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR004]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr004(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]の「型」が指定されていません。「型」を指定してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR004");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR005]
     *
     * [ファイル定義ID[{0}] 項目[{1}]は「日時型」ですが、「書式」が指定されていません。「日時型」の場合は「書式」を指定してください。\n例: [yyyy/MM/dd HH:mm:ss]のように指定します。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR005]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr005(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]は「日時型」ですが、「書式」が指定されていません。「日時型」の場合は「書式」を指定してください。\n例: [yyyy/MM/dd HH:mm:ss]のように指定します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR005");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR006]
     *
     * [ファイル定義ID[{0}] 項目[{1}]は「日時型」ではありませんが、「書式」が指定されています。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR006]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr006(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]は「日時型」ではありませんが、「書式」が指定されています。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR006");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR007]
     *
     * [ファイル定義ID[{0}] 項目[{1}]の「MIN桁」に負の値[{2}]が与えられました。0以上の整数値を設定してください。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR007]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr007(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]の「MIN桁」に負の値[{2}]が与えられました。0以上の整数値を設定してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR008]
     *
     * [ファイル定義ID[{0}] 項目[{1}]の「MIN桁」に整数として処理されない値[{2}]が与えられました。0以上の整数を設定してください。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR008]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr008(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]の「MIN桁」に整数として処理されない値[{2}]が与えられました。0以上の整数を設定してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR009]
     *
     * [ファイル定義ID[{0}] 項目[{1}]の「MAX桁」に負の値[{2}]が与えられました。0以上の整数値を設定してください。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR009]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr009(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]の「MAX桁」に負の値[{2}]が与えられました。0以上の整数値を設定してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR009");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR010]
     *
     * [ファイル定義ID[{0}] 項目[{1}]の「MAX桁」に整数として処理されない値[{2}]が与えられました。0以上の整数を設定してください。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR010]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr010(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]の「MAX桁」に整数として処理されない値[{2}]が与えられました。0以上の整数を設定してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR010");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR011]
     *
     * [ファイル定義ID[{0}] 項目[{1}]の「MIN桁」({2})と「MAX桁」({3})の大小関係が不正です。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @param arg3 置換文字列{3}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR011]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr011(final String arg0, final String arg1, final String arg2, final String arg3) {
        // 初期値として定義書の値を利用します。
        String strFormat = "ファイル定義ID[{0}] 項目[{1}]の「MIN桁」({2})と「MAX桁」({3})の大小関係が不正です。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR011");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[FIELD_NO]
     *
     * [項目番号[{0}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[FIELD_NO]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldNo(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "項目番号[{0}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD_NO");
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
     * bundle[BlancoCsv], key[NOT_SUPPORTED_TYPE]
     *
     * [// TODO: 警告: サポートしない型[{0}]が与えられました。処理をスキップします。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[NOT_SUPPORTED_TYPE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getNotSupportedType(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "// TODO: 警告: サポートしない型[{0}]が与えられました。処理をスキップします。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("NOT_SUPPORTED_TYPE");
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
     * bundle[BlancoCsv], key[ANTTASK.ERR001]
     *
     * [メタディレクトリ[{0}]が存在しません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[ANTTASK.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getAnttaskErr001(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メタディレクトリ[{0}]が存在しません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ANTTASK.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
