/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.sample.csv.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import blanco.sample.csv.record.BlancoCsvSampleCsvRecord;

/**
 * ファイル定義[BlancoCsvSample/このクラスは単にサンプルです。実際の動作には利用されません。]のリーダクラス。
 *
 * このクラスはblancoCsvファイル定義書から自動生成されたリーダクラスです。<br>
 * 　1.文字列長チェックには、デフォルトエンコーディングを利用します。<br>
 * 　2.クラスの利用した後は必ず close()を呼び出してください。<br>
 */
public class BlancoCsvSampleCsvReader {
    /**
     * リーダオブジェクト
     *
     * CSV処理で関連づけられる、実際に入力を行うリーダ。
     */
    protected BufferedReader fReader;

    /**
     * 現在処理中の行カウンタ。
     *
     * 現在処理を行っている行の位置。
     */
    protected long fLineCounter = 0;

    /**
     * 現在処理中の行データ。
     */
    protected String fLine;

    /**
     * 現在処理中の行のためのリーダ。
     */
    protected StringReader fLineReader;

    /**
     * タイトル行が処理されたかどうか。
     */
    protected boolean fIsTitleProcessed = false;

    /**
     * 項目[field_5]の読み込みの際に利用するフォーマッター。
     *
     * ※インスタンス化しておくことによりメモリゴミ発生を抑制します。
     */
    protected SimpleDateFormat fSimpleDateFormatField5;

    /**
     * 項目[field_15]の読み込みの際に利用するフォーマッター。
     *
     * ※インスタンス化しておくことによりメモリゴミ発生を抑制します。
     */
    protected SimpleDateFormat fSimpleDateFormatField15;

    /**
     * CSVリーダクラスのコンストラクタ。
     */
    public BlancoCsvSampleCsvReader() {
        init();
    }

    /**
     * CSVリーダクラスのコンストラクタ。
     *
     * 与えられたリーダを関連づけます。
     *
     * @param arg 関連づけるリーダ。
     */
    public BlancoCsvSampleCsvReader(final BufferedReader arg) {
        fReader = arg;
        init();
    }

    /**
     * 初期化をおこないます。
     */
    protected void init() {
        fSimpleDateFormatField5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 日付/時刻解析を厳密におこないます。
        fSimpleDateFormatField5.setLenient(false);
        fSimpleDateFormatField15 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 日付/時刻解析を厳密におこないます。
        fSimpleDateFormatField15.setLenient(false);
    }

    /**
     * 関連づけられたリーダから、次の一行を読み込みます。
     *
     * @return 行オブジェクトを返します。リーダが終端に達し、もはや行が無い場合には nullを返します。
     * @throws BlancoCsvIOException 入力データが不正な場合など。
     * @throws IOException 関連づけられたリーダで例外が発生した場合。
     */
    public BlancoCsvSampleCsvRecord readRecord() throws BlancoCsvIOException, IOException {
        if (fReader == null) {
            throw new IllegalArgumentException("[BlancoCsvSample] リーダが設定されていない状態でメソッド[readRecord]が呼び出されました。これは許可されません。リーダをセットしてから呼びだしてください。");
        }

        if (fIsTitleProcessed == false) {
            // タイトル行を読み飛ばし。
            fReader.readLine();
            fIsTitleProcessed = true;
        }

        fLine = fReader.readLine();
        if (fLine == null) {
            // ファイルの終端に到達しました。
            return null;
        }
        fLineCounter++;
        final BlancoCsvSampleCsvRecord record = new BlancoCsvSampleCsvRecord();
        fLineReader = new StringReader(fLine);
        String tokenString = null;

        // 項目番号[1]項目名[field_1/フィールド1]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 1項目目。項目番号[1] 項目名[field_1/フィールド1]の処理中において不正な終端を検知しました。");
        }
        // 任意項目。
        if (tokenString.length() == 0) {
            // 必須項目ではない文字列項目に長さ0の値が読み込まれた場合には、読み込み後の値としても長さ0の文字列とします。
            record.setField1(tokenString);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 1項目目。項目番号[1] 項目名[field_1/フィールド1]の処理中においてMIN長さ(1)よりも短い値[" + tokenString + "]を検知しました。");
            }
            if (tokenString.getBytes().length > 10) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 1項目目。項目番号[1] 項目名[field_1/フィールド1]の処理中においてMAX長さ(10)よりも長い値[" + tokenString + "]を検知しました。");
            }
            record.setField1(tokenString);
        }

        // 項目番号[2]項目名[field_2/フィールド2]
        // クオートを考慮した読み込みを行います。
        tokenString = readTokenWithQuote(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 2項目目。項目番号[2] 項目名[field_2/フィールド2]の処理中において不正な終端を検知しました。");
        }
        // 任意項目。
        if (tokenString.length() == 0) {
            // 必須項目ではない文字列項目に長さ0の値が読み込まれた場合には、読み込み後の値としても長さ0の文字列とします。
            record.setField2(tokenString);
        } else {
            if (tokenString.getBytes().length < 4) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 2項目目。項目番号[2] 項目名[field_2/フィールド2]の処理中においてMIN長さ(4)よりも短い値[" + tokenString + "]を検知しました。");
            }
            if (tokenString.getBytes().length > 4) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 2項目目。項目番号[2] 項目名[field_2/フィールド2]の処理中においてMAX長さ(4)よりも長い値[" + tokenString + "]を検知しました。");
            }
            record.setField2(tokenString);
        }

        // 項目番号[3]項目名[field_3/フィールド3]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 3項目目。項目番号[3] 項目名[field_3/フィールド3]の処理中において不正な終端を検知しました。");
        }
        // 任意項目。
        if (tokenString.length() == 0) {
            // 必須項目ではない項目に長さ0の値が読み込まれた場合には、値としてnullを代入します。
            record.setField3(null);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 3項目目。項目番号[3] 項目名[field_3/フィールド3]の処理中においてMIN長さ(1)よりも短い値[" + tokenString + "]を検知しました。");
            }
            if (tokenString.getBytes().length > 3) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 3項目目。項目番号[3] 項目名[field_3/フィールド3]の処理中においてMAX長さ(3)よりも長い値[" + tokenString + "]を検知しました。");
            }
            try {
                record.setField3(new Integer(tokenString));
            } catch (NumberFormatException ex) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 3項目目。項目番号[3] 項目名[field_3/フィールド3]の処理中において数値(int)としては解析できない文字[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
            }
        }

        // 項目番号[4]項目名[field_4/フィールド4]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 4項目目。項目番号[4] 項目名[field_4/フィールド4]の処理中において不正な終端を検知しました。");
        }
        // 任意項目。
        if (tokenString.length() == 0) {
            // 必須項目ではない項目に長さ0の値が読み込まれた場合には、値としてnullを代入します。
            record.setField4(null);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 4項目目。項目番号[4] 項目名[field_4/フィールド4]の処理中においてMIN長さ(1)よりも短い値[" + tokenString + "]を検知しました。");
            }
            if (tokenString.getBytes().length > 3) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 4項目目。項目番号[4] 項目名[field_4/フィールド4]の処理中においてMAX長さ(3)よりも長い値[" + tokenString + "]を検知しました。");
            }
            try {
                record.setField4(new Long(tokenString));
            } catch (NumberFormatException ex) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 4項目目。項目番号[4] 項目名[field_4/フィールド4]の処理中において数値(long)としては解析できない文字[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
            }
        }

        // 項目番号[5]項目名[field_5/フィールド5]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 5項目目。項目番号[5] 項目名[field_5/フィールド5]の処理中において不正な終端を検知しました。");
        }
        // 任意項目。
        if (tokenString.length() == 0) {
            // 必須項目ではない項目に長さ0の値が読み込まれた場合には、値としてnullを代入します。
            record.setField5(null);
        } else {
            try {
                record.setField5(fSimpleDateFormatField5.parse(tokenString));
            } catch (ParseException ex) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 5項目目。項目番号[5] 項目名[field_5/フィールド5]の処理中において与えられた形式[" + fSimpleDateFormatField5.toPattern() + "]では解析できない文字列[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
            }
        }

        // 項目番号[6]項目名[field_6/フィールド6]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 6項目目。項目番号[6] 項目名[field_6/フィールド6]の処理中において不正な終端を検知しました。");
        }
        // 任意項目。
        if (tokenString.length() == 0) {
            // 必須項目ではない項目に長さ0の値が読み込まれた場合には、値としてnullを代入します。
            record.setField6(null);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 6項目目。項目番号[6] 項目名[field_6/フィールド6]の処理中においてMIN長さ(1)よりも短い値[" + tokenString + "]を検知しました。");
            }
            if (tokenString.getBytes().length > 3) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 6項目目。項目番号[6] 項目名[field_6/フィールド6]の処理中においてMAX長さ(3)よりも長い値[" + tokenString + "]を検知しました。");
            }
            try {
                record.setField6(new BigDecimal(tokenString));
            } catch (NumberFormatException ex) {
                throw new BlancoCsvIOException("入力" + fLineCounter + "行目 6項目目。項目番号[6] 項目名[field_6/フィールド6]の処理中において数値(decimal)としては解析できない文字[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
            }
        }

        // 項目番号[7]項目名[field_11/フィールド11]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 7項目目。項目番号[7] 項目名[field_11/フィールド11]の処理中において不正な終端を検知しました。");
        }
        // 必須項目。
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 7項目目。項目番号[7] 項目名[field_11/フィールド11]の処理中において必須項目に値が入っていないことを検知しました。");
        }
        record.setField11(tokenString);

        // 項目番号[8]項目名[field_12/フィールド12]
        // クオートを考慮した読み込みを行います。
        tokenString = readTokenWithQuote(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 8項目目。項目番号[8] 項目名[field_12/フィールド12]の処理中において不正な終端を検知しました。");
        }
        // 必須項目。
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 8項目目。項目番号[8] 項目名[field_12/フィールド12]の処理中において必須項目に値が入っていないことを検知しました。");
        }
        record.setField12(tokenString);

        // 項目番号[9]項目名[field_13/フィールド13]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 9項目目。項目番号[9] 項目名[field_13/フィールド13]の処理中において不正な終端を検知しました。");
        }
        // 必須項目。
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 9項目目。項目番号[9] 項目名[field_13/フィールド13]の処理中において必須項目に値が入っていないことを検知しました。");
        }
        try {
            record.setField13(Integer.parseInt(tokenString));
        } catch (NumberFormatException ex) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 9項目目。項目番号[9] 項目名[field_13/フィールド13]の処理中において数値(int)としては解析できない文字[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
        }

        // 項目番号[10]項目名[field_14/フィールド14]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 10項目目。項目番号[10] 項目名[field_14/フィールド14]の処理中において不正な終端を検知しました。");
        }
        // 必須項目。
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 10項目目。項目番号[10] 項目名[field_14/フィールド14]の処理中において必須項目に値が入っていないことを検知しました。");
        }
        try {
            record.setField14(Long.parseLong(tokenString));
        } catch (NumberFormatException ex) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 10項目目。項目番号[10] 項目名[field_14/フィールド14]の処理中において数値(long)としては解析できない文字[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
        }

        // 項目番号[11]項目名[field_15/フィールド15]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 11項目目。項目番号[11] 項目名[field_15/フィールド15]の処理中において不正な終端を検知しました。");
        }
        // 必須項目。
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 11項目目。項目番号[11] 項目名[field_15/フィールド15]の処理中において必須項目に値が入っていないことを検知しました。");
        }
        try {
            record.setField15(fSimpleDateFormatField15.parse(tokenString));
        } catch (ParseException ex) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 11項目目。項目番号[11] 項目名[field_15/フィールド15]の処理中において与えられた形式[" + fSimpleDateFormatField15.toPattern() + "]では解析できない文字列[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
        }

        // 項目番号[12]項目名[field_16/フィールド16]
        tokenString = readToken(',', true);
        if (tokenString == null) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 12項目目。項目番号[12] 項目名[field_16/フィールド16]の処理中において不正な終端を検知しました。");
        }
        // 必須項目。
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 12項目目。項目番号[12] 項目名[field_16/フィールド16]の処理中において必須項目に値が入っていないことを検知しました。");
        }
        try {
            record.setField16(new BigDecimal(tokenString));
        } catch (NumberFormatException ex) {
            throw new BlancoCsvIOException("入力" + fLineCounter + "行目 12項目目。項目番号[12] 項目名[field_16/フィールド16]の処理中において数値(decimal)としては解析できない文字[" + tokenString + "]を検知しました。:" + ex.toString(), ex);
        }
        return record;
    }

    /**
     * CSV処理で関連づけられるリーダを返します。
     *
     * @return CSV処理で関連づけられるリーダ。
     */
    public BufferedReader getReader() {
        return fReader;
    }

    /**
     * CSV処理で関連づけられるリーダを設定します。
     *
     * @param argReader CSV処理で関連づけられるリーダ。
     */
    public void setReader(final BufferedReader argReader) {
        fReader = argReader;
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
     * このリーダを閉じます。
     *
     * 関連づけられたリーダに対してもclose()を呼び出します。
     *
     * @throws IOException 関連づけられたリーダのclose()に失敗した場合。
     */
    public void close() throws IOException {
        if (fReader != null) {
            fReader.close();
        }
    }

    /**
     * 関連づけられたReaderから 与えられたデリミタを使ってトークンを取り出します。
     *
     * @param delimiter デリミタ
     * @param isEndOfLine 行の終端であるのかどうかフラグ
     * @return 取り出されたトークン。もはやリーダが空の場合にはnullを返します。
     * @throws BlancoCsvIOException 項目数が足りないなど与えられた文字列に関する例外が発生した場合。
     * @throws IOException 入出力例外が発生した場合。
     */
    protected String readToken(final char delimiter, final boolean isEndOfLine) throws BlancoCsvIOException, IOException {
        final StringBuffer buffer = new StringBuffer();
        for (;;) {
            final int iRead = fLineReader.read();
            if (iRead < 0) {
                // 終端に到達。
                if (isEndOfLine == false) {
                    throw new BlancoCsvIOException("行の終端でないのにも関わらずデリミタが現れずに行が終了してしまいました。");
                }
                break;
            }
            if (iRead == delimiter) {
                if (isEndOfLine) {
                    throw new BlancoCsvIOException("行の終端であるべきにも関わらずデリミタが現れました。");
                }
                break;
            } else {
                buffer.append((char) iRead);
            }
        }
        return buffer.toString();
    }

    /**
     * 関連づけられたReaderから ダブルクオート処理付きで 与えられたデリミタを使ってトークンを取り出します。
     *
     * @param delimiter デリミタ
     * @param isEndOfLine 行の終端であるのかどうかフラグ
     * @return 取り出されたトークン。もはやリーダが空の場合にはnullを返します。
     * @throws BlancoCsvIOException ダブルクオートの不一致など与えられた文字列に関する例外が発生した場合。
     * @throws IOException 入出力例外が発生した場合。
     */
    protected String readTokenWithQuote(final char delimiter, final boolean isEndOfLine) throws BlancoCsvIOException, IOException {
        final StringBuffer buffer = new StringBuffer();
        boolean isStringStarted = false;
        boolean isStringEnded = false;
        for (;;) {
            int iRead = fLineReader.read();
            if (iRead < 0) {
                // 終端に到達。
                if (isStringStarted && isStringEnded == false) {
                    // 改行を出力。
                    buffer.append('\n');
                    // ダブルクオート内。
                    fLine = fReader.readLine();
                    if (fLine == null) {
                        // ダブルクオート内であるのにもかかわらずファイルの終端に到達しました。
                        break;
                    } else {
                        fLineReader = new StringReader(fLine);
                        continue;
                    }
                } else if (isEndOfLine == false) {
                    throw new BlancoCsvIOException("行の終端でないのにも関わらずデリミタが現れずに行が終了してしまいました。");
                }
                break;
            }
            if (isStringStarted == false) {
                if (iRead != '"') {
                    throw new BlancoCsvIOException("ダブルクオート無しで文字列が開始されました。");
                }
                // ダブルクオーテーションは読み飛ばします。
                isStringStarted = true;
            } else if (isStringEnded) {
                if (iRead == delimiter) {
                    // 文字列終端に到達しました。
                    if (isEndOfLine) {
                        throw new BlancoCsvIOException("行の終端であるべきにも関わらずデリミタが現れました。");
                    }
                    break;
                }
                throw new BlancoCsvIOException("ダブルクオートによる文字列終了より後に文字列が与えられました。");
            } else {
                // 通常の文字列エリア
                if (iRead == '"') {
                    // ダブルクオートが重ねられたものでないかどうかチェックします。
                    fLineReader.mark(1);
                    if (fLineReader.read() == '"') {
                        // エスケープされたダブルクオート
                        // 2つでひとつなので、ひとつは読み捨てます。
                        buffer.append((char) iRead);
                    } else {
                        // ダブルクオートによるエスケープではありませんでした。
                        // これは終端を意味しています。
                        fLineReader.reset();
                        isStringEnded = true;
                    }
                } else {
                    buffer.append((char) iRead);
                }
            }
        }
        if (isStringStarted == false) {
            throw new BlancoCsvIOException("ダブルクオートが必要な文字列であるのにダブルクオートによる開始が現れませんでした。");
        }
        if (isStringEnded == false) {
            throw new BlancoCsvIOException("ダブルクオートが必要な文字列であるのにダブルクオートによる終了が現れませんでした。");
        }
        return buffer.toString();
    }
}
