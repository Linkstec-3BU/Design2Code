/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.sample.csv.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * blancoCsvで利用する実行時ユーティリティクラス
 *
 * このファイルはblancoIgにより自動生成されています。
 */
public class BlancoCsvRuntimeUtil {
    /**
     * ダブルクオートエスケープ処理付きの文字列を取得します
     *
     * @param value 書き出したい文字列
     * @return ダブルクオートエスケープ処理付きの文字列
     * @throws IOException 入出力例外などが発生した場合。
     */
    public static String getTokenWithQuote(final String value) throws IOException {
        final StringWriter writer = new StringWriter();
        writer.write("\"");

        final StringReader reader = new StringReader(value);
        for (;;) {
            final int iRead = reader.read();
            if (iRead < 0) {
                // 終端に到達。
                break;
            }
            if (iRead == '\"') {
                // ダブルクオートは二重で書き出します。
                writer.write("\"\"");
            } else {
                writer.write((char) iRead);
            }
        }

        writer.write("\"");
        writer.close();
        return writer.toString();
    }
}
