/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.sample.csv.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import blanco.sample.csv.record.BlancoCsvSampleCsvRecord;
import blanco.sample.csv.util.BlancoCsvRuntimeUtil;

/**
 * ファイル定義[BlancoCsvSample/このクラスは単にサンプルです。実際の動作には利用されません。]のライタクラス。
 *
 * このクラスはblancoCsvファイル定義書から自動生成されたライタクラスです。<br>
 * 　1.文字列長チェックには、デフォルトエンコーディングを利用します。<br>
 * 　2.クラスの利用した後は必ず close()を呼び出してください。<br>
 */
public class BlancoCsvSampleCsvWriter {
    /**
     * ライタオブジェクト。
     *
     * CSV処理で関連づけられる、実際に出力を行うライタ。
     */
    protected BufferedWriter fWriter;

    /**
     * 現在処理中の行カウンタ。
     *
     * 現在処理を行っている行の位置。
     */
    protected long fLineCounter = 0;

    /**
     * タイトル行が処理されたかどうか。
     */
    protected boolean fIsTitleProcessed = false;

    /**
     * 項目[field_5]の書き込みの際に利用するフォーマッター。
     *
     * ※インスタンス化しておくことによりメモリゴミ発生を抑制します。
     */
    protected SimpleDateFormat fSimpleDateFormatField5;

    /**
     * 項目[field_15]の書き込みの際に利用するフォーマッター。
     *
     * ※インスタンス化しておくことによりメモリゴミ発生を抑制します。
     */
    protected SimpleDateFormat fSimpleDateFormatField15;

    /**
     * CSVライタクラスのコンストラクタ。
     */
    public BlancoCsvSampleCsvWriter() {
        init();
    }

    /**
     * CSVライタクラスのコンストラクタ。
     *
     * 与えられたライタと関連づけます。
     *
     * @param arg 関連づけるライタ。
     */
    public BlancoCsvSampleCsvWriter(final BufferedWriter arg) {
        fWriter = arg;
        init();
    }

    /**
     * 初期化をおこないます。
     */
    protected void init() {
        fSimpleDateFormatField5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fSimpleDateFormatField15 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    }

    /**
     * CSVファイルのタイトル行を書き出します。
     *
     * タイトルはデリミタで区切られながらライタに出力され、最後に改行コードが付与されます。<br>
     * タイトルはダブルクオーテーションで囲まれます。
     *
     * @throws IOException 関連づけられたライタ出力の際に例外が発生した場合。
     */
    public void writeTitle() throws IOException {
        if (fWriter == null) {
            throw new IllegalArgumentException("[BlancoCsvSample] ライタが設定されていない状態でメソッド[writeTitle]が呼び出されました。これは許可されません。ライタをセットしてから呼びだしてください。");
        }

        fWriter.write("\"フィールド1\"");
        fWriter.write(",\"フィールド2\"");
        fWriter.write(",\"フィールド3\"");
        fWriter.write(",\"フィールド4\"");
        fWriter.write(",\"フィールド5\"");
        fWriter.write(",\"フィールド6\"");
        fWriter.write(",\"フィールド11\"");
        fWriter.write(",\"フィールド12\"");
        fWriter.write(",\"フィールド13\"");
        fWriter.write(",\"フィールド14\"");
        fWriter.write(",\"フィールド15\"");
        fWriter.write(",\"フィールド16\"");
        fWriter.newLine();
    }

    /**
     * 与えられた一行を書き出します。
     *
     * データはデリミタで区切られながらライタに出力され、最後に改行コードが付与されます。
     *
     * @param record レコードオブジェクト。
     * @throws BlancoCsvIOException 与えられたレコード中の項目値が不正な場合など。
     * @throws IOException 関連づけられたライタ出力の際に例外が発生した場合。
     */
    public void writeRecord(final BlancoCsvSampleCsvRecord record) throws BlancoCsvIOException, IOException {
        if (fWriter == null) {
            throw new IllegalArgumentException("[BlancoCsvSample] ライタが設定されていない状態でメソッド[writeRecord]が呼び出されました。これは許可されません。ライタをセットしてから呼びだしてください。");
        }

        if (fIsTitleProcessed == false) {
            // タイトル行を書き込み。
            writeTitle();
            fIsTitleProcessed = true;
        }

        String writeToken = null;

        // 項目番号[1] 項目名[field_1/フィールド1]
        // 任意項目で文字列の項目に nullまたは長さ0の文字列が与えられた場合には、いずれも値が入っていないものとみなします。
        // この場合には長さチェックは行いません。
        writeToken = record.getField1() == null ? "" : record.getField1();
        if (writeToken.length() > 0) {
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 1項目目。項目番号[1] 項目名[field_1/フィールド1]の処理中においてMIN長さ(1)よりも短い値[" + writeToken + "]を検知しました。");
            }
            if (writeToken.getBytes().length > 10) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 1項目目。項目番号[1] 項目名[field_1/フィールド1]の処理中においてMAX長さ(10)よりも長い値[" + writeToken + "]を検知しました。");
            }
        }
        if (writeToken.indexOf(",") >= 0) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 1項目目。項目番号[1] 項目名[field_1/フィールド1]の処理中においてデータ中[" + writeToken + "]に項目のデリミタ[,]が含まれることを検知しました。");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[2] 項目名[field_2/フィールド2]
        // 任意項目で文字列の項目に nullまたは長さ0の文字列が与えられた場合には、いずれも値が入っていないものとみなします。
        // この場合には長さチェックは行いません。
        writeToken = record.getField2() == null ? "" : record.getField2();
        if (writeToken.length() > 0) {
            if (writeToken.getBytes().length < 4) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 2項目目。項目番号[2] 項目名[field_2/フィールド2]の処理中においてMIN長さ(4)よりも短い値[" + writeToken + "]を検知しました。");
            }
            if (writeToken.getBytes().length > 4) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 2項目目。項目番号[2] 項目名[field_2/フィールド2]の処理中においてMAX長さ(4)よりも長い値[" + writeToken + "]を検知しました。");
            }
        }
        // ダブルクオート処理付きで書き出しを行います。
        fWriter.write(BlancoCsvRuntimeUtil.getTokenWithQuote(writeToken));
        fWriter.write(',');

        // 項目番号[3] 項目名[field_3/フィールド3]
        if (record.getField3() == null) {
            writeToken = "";
        } else {
            writeToken = String.valueOf(record.getField3());
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 3項目目。項目番号[3] 項目名[field_3/フィールド3]の処理中においてMIN長さ(1)よりも短い値[" + writeToken + "]を検知しました。");
            }
            if (writeToken.getBytes().length > 3) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 3項目目。項目番号[3] 項目名[field_3/フィールド3]の処理中においてMAX長さ(3)よりも長い値[" + writeToken + "]を検知しました。");
            }
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[4] 項目名[field_4/フィールド4]
        if (record.getField4() == null) {
            writeToken = "";
        } else {
            writeToken = String.valueOf(record.getField4());
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 4項目目。項目番号[4] 項目名[field_4/フィールド4]の処理中においてMIN長さ(1)よりも短い値[" + writeToken + "]を検知しました。");
            }
            if (writeToken.getBytes().length > 3) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 4項目目。項目番号[4] 項目名[field_4/フィールド4]の処理中においてMAX長さ(3)よりも長い値[" + writeToken + "]を検知しました。");
            }
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[5] 項目名[field_5/フィールド5]
        if (record.getField5() == null) {
            writeToken = "";
        } else {
            writeToken = fSimpleDateFormatField5.format(record.getField5());
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[6] 項目名[field_6/フィールド6]
        if (record.getField6() == null) {
            writeToken = "";
        } else {
            writeToken = record.getField6() == null ? "" : record.getField6().toString();
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 6項目目。項目番号[6] 項目名[field_6/フィールド6]の処理中においてMIN長さ(1)よりも短い値[" + writeToken + "]を検知しました。");
            }
            if (writeToken.getBytes().length > 3) {
                throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 6項目目。項目番号[6] 項目名[field_6/フィールド6]の処理中においてMAX長さ(3)よりも長い値[" + writeToken + "]を検知しました。");
            }
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[7] 項目名[field_11/フィールド11]
        if (record.getField11() == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 7項目目。項目番号[7] 項目名[field_11/フィールド11]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        if (record.getField11().length() == 0) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 7項目目。項目番号[7] 項目名[field_11/フィールド11]の処理中において必須項目に長さ0の文字列が与えられていることを検知しました。");
        }
        writeToken = record.getField11();
        if (writeToken == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 7項目目。項目番号[7] 項目名[field_11/フィールド11]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        if (writeToken.indexOf(",") >= 0) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 7項目目。項目番号[7] 項目名[field_11/フィールド11]の処理中においてデータ中[" + writeToken + "]に項目のデリミタ[,]が含まれることを検知しました。");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[8] 項目名[field_12/フィールド12]
        if (record.getField12() == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 8項目目。項目番号[8] 項目名[field_12/フィールド12]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        if (record.getField12().length() == 0) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 8項目目。項目番号[8] 項目名[field_12/フィールド12]の処理中において必須項目に長さ0の文字列が与えられていることを検知しました。");
        }
        writeToken = record.getField12();
        if (writeToken == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 8項目目。項目番号[8] 項目名[field_12/フィールド12]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        // ダブルクオート処理付きで書き出しを行います。
        fWriter.write(BlancoCsvRuntimeUtil.getTokenWithQuote(writeToken));
        fWriter.write(',');

        // 項目番号[9] 項目名[field_13/フィールド13]
        writeToken = String.valueOf(record.getField13());
        if (writeToken == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 9項目目。項目番号[9] 項目名[field_13/フィールド13]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[10] 項目名[field_14/フィールド14]
        writeToken = String.valueOf(record.getField14());
        if (writeToken == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 10項目目。項目番号[10] 項目名[field_14/フィールド14]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[11] 項目名[field_15/フィールド15]
        if (record.getField15() == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 11項目目。項目番号[11] 項目名[field_15/フィールド15]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        writeToken = fSimpleDateFormatField15.format(record.getField15());
        if (writeToken == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 11項目目。項目番号[11] 項目名[field_15/フィールド15]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // 項目番号[12] 項目名[field_16/フィールド16]
        if (record.getField16() == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 12項目目。項目番号[12] 項目名[field_16/フィールド16]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        writeToken = record.getField16().toString();
        if (writeToken == null) {
            throw new BlancoCsvIOException("出力" + (fLineCounter + 1) + "行目 12項目目。項目番号[12] 項目名[field_16/フィールド16]の処理中において必須項目にnullが与えられていることを検知しました。");
        }
        fWriter.write(writeToken);

        // 最後に改行コードが付与されます。
        fWriter.newLine();
        fLineCounter++;
    }

    /**
     * CSV処理で関連づけられるライタを返します。
     *
     * @return CSV処理で関連づけられるライタ。
     */
    public BufferedWriter getWriter() {
        return fWriter;
    }

    /**
     * CSV処理で関連づけられるライタを設定します。
     *
     * @param argWriter CSV処理で関連づけられるライタ。
     */
    public void setWriter(final BufferedWriter argWriter) {
        fWriter = argWriter;
    }

    /**
     * 現在処理中の行カウンタを返します。
     *
     * @return 現在処理中の行カウンタ。
     */
    public long getLineCounter() {
        return fLineCounter;
    }

    /**
     * このライタをフラッシュします。
     *
     * 関連づけられたライタに対してもflush()を呼び出します。
     *
     * @throws IOException 関連づけられたライタのflush()に失敗した場合。
     */
    public void flush() throws IOException {
        if (fWriter != null) {
            fWriter.flush();
        }
    }

    /**
     * このライタを閉じます。
     *
     * 関連づけられたライタに対してもclose()を呼び出します。
     *
     * @throws IOException 関連づけられたライタのclose()に失敗した場合。
     */
    public void close() throws IOException {
        if (fWriter != null) {
            if (fIsTitleProcessed == false) {
                // タイトル行を書き込み。
                writeTitle();
                fIsTitleProcessed = true;
            }

            fWriter.close();
        }
    }
}
