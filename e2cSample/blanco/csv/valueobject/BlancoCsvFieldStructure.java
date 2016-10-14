/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.valueobject;

import java.util.List;

/**
 * フィールド構造を保持します。
 */
public class BlancoCsvFieldStructure {
    /**
     * 行番号。
     *
     * フィールド: [no]。
     */
    private String fNo;

    /**
     * フィールド名。
     *
     * フィールド: [name]。
     */
    private String fName;

    /**
     * フィールドの型。
     *
     * フィールド: [type]。
     */
    private String fType;

    /**
     * フィールドの説明。
     *
     * フィールド: [description]。
     */
    private String fDescription;

    /**
     * クラスの補助説明です。文字参照エンコード済みの値を格納してください。
     *
     * フィールド: [descriptionList]。
     * デフォルト: [new java.util.ArrayList<java.lang.String>()]。
     */
    private List<java.lang.String> fDescriptionList = new java.util.ArrayList<java.lang.String>();

    /**
     * 必須。
     *
     * フィールド: [required]。
     * デフォルト: [false]。
     */
    private boolean fRequired = false;

    /**
     * 最小長さ。
     *
     * フィールド: [minLength]。
     */
    private String fMinLength;

    /**
     * 最大長さ。
     *
     * フィールド: [maxLength]。
     */
    private String fMaxLength;

    /**
     * デフォルト値。
     *
     * フィールド: [default]。
     */
    private String fDefault;

    /**
     * フォーマット(正規表現)
     *
     * フィールド: [format]。
     */
    private String fFormat;

    /**
     * フィールド [no] の値を設定します。
     *
     * フィールドの説明: [行番号。]。
     *
     * @param argNo フィールド[no]に設定する値。
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * フィールド [no] の値を取得します。
     *
     * フィールドの説明: [行番号。]。
     *
     * @return フィールド[no]から取得した値。
     */
    public String getNo() {
        return fNo;
    }

    /**
     * フィールド [name] の値を設定します。
     *
     * フィールドの説明: [フィールド名。]。
     *
     * @param argName フィールド[name]に設定する値。
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド [name] の値を取得します。
     *
     * フィールドの説明: [フィールド名。]。
     *
     * @return フィールド[name]から取得した値。
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [type] の値を設定します。
     *
     * フィールドの説明: [フィールドの型。]。
     *
     * @param argType フィールド[type]に設定する値。
     */
    public void setType(final String argType) {
        fType = argType;
    }

    /**
     * フィールド [type] の値を取得します。
     *
     * フィールドの説明: [フィールドの型。]。
     *
     * @return フィールド[type]から取得した値。
     */
    public String getType() {
        return fType;
    }

    /**
     * フィールド [description] の値を設定します。
     *
     * フィールドの説明: [フィールドの説明。]。
     *
     * @param argDescription フィールド[description]に設定する値。
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * フィールド [description] の値を取得します。
     *
     * フィールドの説明: [フィールドの説明。]。
     *
     * @return フィールド[description]から取得した値。
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * フィールド [descriptionList] の値を設定します。
     *
     * フィールドの説明: [クラスの補助説明です。文字参照エンコード済みの値を格納してください。]。
     *
     * @param argDescriptionList フィールド[descriptionList]に設定する値。
     */
    public void setDescriptionList(final List<java.lang.String> argDescriptionList) {
        fDescriptionList = argDescriptionList;
    }

    /**
     * フィールド [descriptionList] の値を取得します。
     *
     * フィールドの説明: [クラスの補助説明です。文字参照エンコード済みの値を格納してください。]。
     * デフォルト: [new java.util.ArrayList<java.lang.String>()]。
     *
     * @return フィールド[descriptionList]から取得した値。
     */
    public List<java.lang.String> getDescriptionList() {
        return fDescriptionList;
    }

    /**
     * フィールド [required] の値を設定します。
     *
     * フィールドの説明: [必須。]。
     *
     * @param argRequired フィールド[required]に設定する値。
     */
    public void setRequired(final boolean argRequired) {
        fRequired = argRequired;
    }

    /**
     * フィールド [required] の値を取得します。
     *
     * フィールドの説明: [必須。]。
     * デフォルト: [false]。
     *
     * @return フィールド[required]から取得した値。
     */
    public boolean getRequired() {
        return fRequired;
    }

    /**
     * フィールド [minLength] の値を設定します。
     *
     * フィールドの説明: [最小長さ。]。
     *
     * @param argMinLength フィールド[minLength]に設定する値。
     */
    public void setMinLength(final String argMinLength) {
        fMinLength = argMinLength;
    }

    /**
     * フィールド [minLength] の値を取得します。
     *
     * フィールドの説明: [最小長さ。]。
     *
     * @return フィールド[minLength]から取得した値。
     */
    public String getMinLength() {
        return fMinLength;
    }

    /**
     * フィールド [maxLength] の値を設定します。
     *
     * フィールドの説明: [最大長さ。]。
     *
     * @param argMaxLength フィールド[maxLength]に設定する値。
     */
    public void setMaxLength(final String argMaxLength) {
        fMaxLength = argMaxLength;
    }

    /**
     * フィールド [maxLength] の値を取得します。
     *
     * フィールドの説明: [最大長さ。]。
     *
     * @return フィールド[maxLength]から取得した値。
     */
    public String getMaxLength() {
        return fMaxLength;
    }

    /**
     * フィールド [default] の値を設定します。
     *
     * フィールドの説明: [デフォルト値。]。
     *
     * @param argDefault フィールド[default]に設定する値。
     */
    public void setDefault(final String argDefault) {
        fDefault = argDefault;
    }

    /**
     * フィールド [default] の値を取得します。
     *
     * フィールドの説明: [デフォルト値。]。
     *
     * @return フィールド[default]から取得した値。
     */
    public String getDefault() {
        return fDefault;
    }

    /**
     * フィールド [format] の値を設定します。
     *
     * フィールドの説明: [フォーマット(正規表現)]。
     *
     * @param argFormat フィールド[format]に設定する値。
     */
    public void setFormat(final String argFormat) {
        fFormat = argFormat;
    }

    /**
     * フィールド [format] の値を取得します。
     *
     * フィールドの説明: [フォーマット(正規表現)]。
     *
     * @return フィールド[format]から取得した値。
     */
    public String getFormat() {
        return fFormat;
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
        buf.append("blanco.csv.valueobject.BlancoCsvFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",type=" + fType);
        buf.append(",description=" + fDescription);
        buf.append(",descriptionList=" + fDescriptionList);
        buf.append(",required=" + fRequired);
        buf.append(",minLength=" + fMinLength);
        buf.append(",maxLength=" + fMaxLength);
        buf.append(",default=" + fDefault);
        buf.append(",format=" + fFormat);
        buf.append("]");
        return buf.toString();
    }
}
