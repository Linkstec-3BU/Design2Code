/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.sample.csv.io;

/**
 * blancoCsvが生成したクラスが実行時に発生する例外クラスです。
 *
 * 型・桁チェックの結果が異常であった場合などにこの例外は発生します。
 */
@SuppressWarnings("serial")
public class BlancoCsvIOException extends Exception {
    /**
     * メッセージを伴いblancoCsv例外クラスを生成します。
     *
     * @param message メッセージ。
     */
    public BlancoCsvIOException(final String message) {
        super(message);
    }

    /**
     * メッセージおよび原因を伴いblancoCsv例外クラスを生成します。
     *
     * @param message メッセージ。
     * @param argCause 原因となる例外オブジェクト。
     */
    public BlancoCsvIOException(final String message, final Throwable argCause) {
        super(message, argCause);
    }
}
