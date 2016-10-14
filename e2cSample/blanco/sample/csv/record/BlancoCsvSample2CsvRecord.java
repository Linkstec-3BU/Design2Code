/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.sample.csv.record;

import java.math.BigDecimal;
import java.util.Date;

/**
 * blancoCsvファイル定義書から作成されたレコードクラス。
 *
 * ファイル定義[BlancoCsvSample2/このクラスは単にサンプルです。タブ区切りのタイトル行無しのサンプルです。]のレコードクラス。
 */
public class BlancoCsvSample2CsvRecord {
    /**
     * フィールド1
     *
     * 項目番号: 1
     * MIN長さ: 1
     * MAX長さ: 10
     * フィールド: [field_1]。
     * デフォルト: [試験]。
     */
    private String fField1 = "試験";

    /**
     * フィールド2
     *
     * 項目番号: 2
     * 文字列はダブルクオート処理されて入出力されます。
     * MIN長さ: 4
     * MAX長さ: 4
     * フィールド: [field_2]。
     * デフォルト: [テスト]。
     */
    private String fField2 = "テスト";

    /**
     * フィールド3
     *
     * 項目番号: 3
     * MIN長さ: 1
     * MAX長さ: 3
     * フィールド: [field_3]。
     */
    private Integer fField3;

    /**
     * フィールド4
     *
     * 項目番号: 4
     * MIN長さ: 1
     * MAX長さ: 3
     * フィールド: [field_4]。
     * デフォルト: [10]。
     */
    private Long fField4 = new Long(10);

    /**
     * フィールド5
     *
     * 項目番号: 5
     * フィールド: [field_5]。
     */
    private Date fField5;

    /**
     * フィールド6
     *
     * 項目番号: 6
     * MIN長さ: 1
     * MAX長さ: 3
     * フィールド: [field_6]。
     */
    private BigDecimal fField6;

    /**
     * フィールド11
     *
     * 項目番号: 7
     * 必須項目
     * フィールド: [field_11]。
     */
    private String fField11;

    /**
     * フィールド12
     *
     * 項目番号: 8
     * 文字列はダブルクオート処理されて入出力されます。
     * 必須項目
     * フィールド: [field_12]。
     */
    private String fField12;

    /**
     * フィールド13
     *
     * 項目番号: 9
     * 必須項目
     * フィールド: [field_13]。
     */
    private int fField13;

    /**
     * フィールド14
     *
     * 項目番号: 10
     * 必須項目
     * フィールド: [field_14]。
     */
    private long fField14;

    /**
     * フィールド15
     *
     * 項目番号: 11
     * 必須項目
     * フィールド: [field_15]。
     */
    private Date fField15;

    /**
     * フィールド16
     *
     * 項目番号: 12
     * 必須項目
     * フィールド: [field_16]。
     */
    private BigDecimal fField16;

    /**
     * フィールド [field_1] の値を設定します。
     *
     * フィールドの説明: [フィールド1]。
     * 項目番号: 1
     * MIN長さ: 1
     * MAX長さ: 10
     *
     * @param argField1 フィールド[field_1]に設定する値。
     */
    public void setField1(final String argField1) {
        fField1 = argField1;
    }

    /**
     * フィールド [field_1] の値を取得します。
     *
     * フィールドの説明: [フィールド1]。
     * 項目番号: 1
     * MIN長さ: 1
     * MAX長さ: 10
     * デフォルト: [試験]。
     *
     * @return フィールド[field_1]から取得した値。
     */
    public String getField1() {
        return fField1;
    }

    /**
     * フィールド [field_2] の値を設定します。
     *
     * フィールドの説明: [フィールド2]。
     * 項目番号: 2
     * 文字列はダブルクオート処理されて入出力されます。
     * MIN長さ: 4
     * MAX長さ: 4
     *
     * @param argField2 フィールド[field_2]に設定する値。
     */
    public void setField2(final String argField2) {
        fField2 = argField2;
    }

    /**
     * フィールド [field_2] の値を取得します。
     *
     * フィールドの説明: [フィールド2]。
     * 項目番号: 2
     * 文字列はダブルクオート処理されて入出力されます。
     * MIN長さ: 4
     * MAX長さ: 4
     * デフォルト: [テスト]。
     *
     * @return フィールド[field_2]から取得した値。
     */
    public String getField2() {
        return fField2;
    }

    /**
     * フィールド [field_3] の値を設定します。
     *
     * フィールドの説明: [フィールド3]。
     * 項目番号: 3
     * MIN長さ: 1
     * MAX長さ: 3
     *
     * @param argField3 フィールド[field_3]に設定する値。
     */
    public void setField3(final Integer argField3) {
        fField3 = argField3;
    }

    /**
     * フィールド [field_3] の値を取得します。
     *
     * フィールドの説明: [フィールド3]。
     * 項目番号: 3
     * MIN長さ: 1
     * MAX長さ: 3
     *
     * @return フィールド[field_3]から取得した値。
     */
    public Integer getField3() {
        return fField3;
    }

    /**
     * フィールド [field_4] の値を設定します。
     *
     * フィールドの説明: [フィールド4]。
     * 項目番号: 4
     * MIN長さ: 1
     * MAX長さ: 3
     *
     * @param argField4 フィールド[field_4]に設定する値。
     */
    public void setField4(final Long argField4) {
        fField4 = argField4;
    }

    /**
     * フィールド [field_4] の値を取得します。
     *
     * フィールドの説明: [フィールド4]。
     * 項目番号: 4
     * MIN長さ: 1
     * MAX長さ: 3
     * デフォルト: [10]。
     *
     * @return フィールド[field_4]から取得した値。
     */
    public Long getField4() {
        return fField4;
    }

    /**
     * フィールド [field_5] の値を設定します。
     *
     * フィールドの説明: [フィールド5]。
     * 項目番号: 5
     *
     * @param argField5 フィールド[field_5]に設定する値。
     */
    public void setField5(final Date argField5) {
        fField5 = argField5;
    }

    /**
     * フィールド [field_5] の値を取得します。
     *
     * フィールドの説明: [フィールド5]。
     * 項目番号: 5
     *
     * @return フィールド[field_5]から取得した値。
     */
    public Date getField5() {
        return fField5;
    }

    /**
     * フィールド [field_6] の値を設定します。
     *
     * フィールドの説明: [フィールド6]。
     * 項目番号: 6
     * MIN長さ: 1
     * MAX長さ: 3
     *
     * @param argField6 フィールド[field_6]に設定する値。
     */
    public void setField6(final BigDecimal argField6) {
        fField6 = argField6;
    }

    /**
     * フィールド [field_6] の値を取得します。
     *
     * フィールドの説明: [フィールド6]。
     * 項目番号: 6
     * MIN長さ: 1
     * MAX長さ: 3
     *
     * @return フィールド[field_6]から取得した値。
     */
    public BigDecimal getField6() {
        return fField6;
    }

    /**
     * フィールド [field_11] の値を設定します。
     *
     * フィールドの説明: [フィールド11]。
     * 項目番号: 7
     * 必須項目
     *
     * @param argField11 フィールド[field_11]に設定する値。
     */
    public void setField11(final String argField11) {
        fField11 = argField11;
    }

    /**
     * フィールド [field_11] の値を取得します。
     *
     * フィールドの説明: [フィールド11]。
     * 項目番号: 7
     * 必須項目
     *
     * @return フィールド[field_11]から取得した値。
     */
    public String getField11() {
        return fField11;
    }

    /**
     * フィールド [field_12] の値を設定します。
     *
     * フィールドの説明: [フィールド12]。
     * 項目番号: 8
     * 文字列はダブルクオート処理されて入出力されます。
     * 必須項目
     *
     * @param argField12 フィールド[field_12]に設定する値。
     */
    public void setField12(final String argField12) {
        fField12 = argField12;
    }

    /**
     * フィールド [field_12] の値を取得します。
     *
     * フィールドの説明: [フィールド12]。
     * 項目番号: 8
     * 文字列はダブルクオート処理されて入出力されます。
     * 必須項目
     *
     * @return フィールド[field_12]から取得した値。
     */
    public String getField12() {
        return fField12;
    }

    /**
     * フィールド [field_13] の値を設定します。
     *
     * フィールドの説明: [フィールド13]。
     * 項目番号: 9
     * 必須項目
     *
     * @param argField13 フィールド[field_13]に設定する値。
     */
    public void setField13(final int argField13) {
        fField13 = argField13;
    }

    /**
     * フィールド [field_13] の値を取得します。
     *
     * フィールドの説明: [フィールド13]。
     * 項目番号: 9
     * 必須項目
     *
     * @return フィールド[field_13]から取得した値。
     */
    public int getField13() {
        return fField13;
    }

    /**
     * フィールド [field_14] の値を設定します。
     *
     * フィールドの説明: [フィールド14]。
     * 項目番号: 10
     * 必須項目
     *
     * @param argField14 フィールド[field_14]に設定する値。
     */
    public void setField14(final long argField14) {
        fField14 = argField14;
    }

    /**
     * フィールド [field_14] の値を取得します。
     *
     * フィールドの説明: [フィールド14]。
     * 項目番号: 10
     * 必須項目
     *
     * @return フィールド[field_14]から取得した値。
     */
    public long getField14() {
        return fField14;
    }

    /**
     * フィールド [field_15] の値を設定します。
     *
     * フィールドの説明: [フィールド15]。
     * 項目番号: 11
     * 必須項目
     *
     * @param argField15 フィールド[field_15]に設定する値。
     */
    public void setField15(final Date argField15) {
        fField15 = argField15;
    }

    /**
     * フィールド [field_15] の値を取得します。
     *
     * フィールドの説明: [フィールド15]。
     * 項目番号: 11
     * 必須項目
     *
     * @return フィールド[field_15]から取得した値。
     */
    public Date getField15() {
        return fField15;
    }

    /**
     * フィールド [field_16] の値を設定します。
     *
     * フィールドの説明: [フィールド16]。
     * 項目番号: 12
     * 必須項目
     *
     * @param argField16 フィールド[field_16]に設定する値。
     */
    public void setField16(final BigDecimal argField16) {
        fField16 = argField16;
    }

    /**
     * フィールド [field_16] の値を取得します。
     *
     * フィールドの説明: [フィールド16]。
     * 項目番号: 12
     * 必須項目
     *
     * @return フィールド[field_16]から取得した値。
     */
    public BigDecimal getField16() {
        return fField16;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ文字列化の処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @return バリューオブジェクトの文字列表現。
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.sample.csv.record.BlancoCsvSample2CsvRecord[");
        buf.append("field_1=" + fField1);
        buf.append(",field_2=" + fField2);
        buf.append(",field_3=" + fField3);
        buf.append(",field_4=" + fField4);
        buf.append(",field_5=" + fField5);
        buf.append(",field_6=" + fField6);
        buf.append(",field_11=" + fField11);
        buf.append(",field_12=" + fField12);
        buf.append(",field_13=" + fField13);
        buf.append(",field_14=" + fField14);
        buf.append(",field_15=" + fField15);
        buf.append(",field_16=" + fField16);
        buf.append("]");
        return buf.toString();
    }
}
