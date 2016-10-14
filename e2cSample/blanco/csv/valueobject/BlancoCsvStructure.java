/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.csv.valueobject;

import java.util.List;

/**
 * 構造を保持します。
 */
public class BlancoCsvStructure {
    /**
     * ファイル定義ID
     *
     * フィールド: [name]。
     */
    private String fName;

    /**
     * パッケージ名
     *
     * フィールド: [package]。
     */
    private String fPackage;

    /**
     * ファイルの説明。
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
     * デリミタを保持します。デリミタは、デリミタおよび任意指定デリミタから導き出されます。
     *
     * フィールド: [delimiter]。
     */
    private String fDelimiter;

    /**
     * ファイルのエンコーディング。
     *
     * フィールド: [encoding]。
     */
    private String fEncoding;

    /**
     * CSVファイルのタイトル行の状態
     *
     * フィールド: [titleRow]。
     * デフォルト: ["no title"]。
     */
    private String fTitleRow = "no title";

    /**
     * ランタイムクラスを生成する生成先を指定します。パッケージ名が確定された状態で格納されます。
     *
     * フィールド: [runtimePackage]。
     */
    private String fRuntimePackage;

    /**
     * フィールドのリスト。
     *
     * フィールド: [fieldList]。
     * デフォルト: [new java.util.ArrayList<blanco.csv.valueobject.BlancoCsvFieldStructure>()]。
     */
    private List<blanco.csv.valueobject.BlancoCsvFieldStructure> fFieldList = new java.util.ArrayList<blanco.csv.valueobject.BlancoCsvFieldStructure>();

    /**
     * フィールド [name] の値を設定します。
     *
     * フィールドの説明: [ファイル定義ID]。
     *
     * @param argName フィールド[name]に設定する値。
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド [name] の値を取得します。
     *
     * フィールドの説明: [ファイル定義ID]。
     *
     * @return フィールド[name]から取得した値。
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [package] の値を設定します。
     *
     * フィールドの説明: [パッケージ名]。
     *
     * @param argPackage フィールド[package]に設定する値。
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * フィールド [package] の値を取得します。
     *
     * フィールドの説明: [パッケージ名]。
     *
     * @return フィールド[package]から取得した値。
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * フィールド [description] の値を設定します。
     *
     * フィールドの説明: [ファイルの説明。]。
     *
     * @param argDescription フィールド[description]に設定する値。
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * フィールド [description] の値を取得します。
     *
     * フィールドの説明: [ファイルの説明。]。
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
     * フィールド [delimiter] の値を設定します。
     *
     * フィールドの説明: [デリミタを保持します。デリミタは、デリミタおよび任意指定デリミタから導き出されます。]。
     *
     * @param argDelimiter フィールド[delimiter]に設定する値。
     */
    public void setDelimiter(final String argDelimiter) {
        fDelimiter = argDelimiter;
    }

    /**
     * フィールド [delimiter] の値を取得します。
     *
     * フィールドの説明: [デリミタを保持します。デリミタは、デリミタおよび任意指定デリミタから導き出されます。]。
     *
     * @return フィールド[delimiter]から取得した値。
     */
    public String getDelimiter() {
        return fDelimiter;
    }

    /**
     * フィールド [encoding] の値を設定します。
     *
     * フィールドの説明: [ファイルのエンコーディング。]。
     *
     * @param argEncoding フィールド[encoding]に設定する値。
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * フィールド [encoding] の値を取得します。
     *
     * フィールドの説明: [ファイルのエンコーディング。]。
     *
     * @return フィールド[encoding]から取得した値。
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * フィールド [titleRow] の値を設定します。
     *
     * フィールドの説明: [CSVファイルのタイトル行の状態]。
     *
     * @param argTitleRow フィールド[titleRow]に設定する値。
     */
    public void setTitleRow(final String argTitleRow) {
        fTitleRow = argTitleRow;
    }

    /**
     * フィールド [titleRow] の値を取得します。
     *
     * フィールドの説明: [CSVファイルのタイトル行の状態]。
     * デフォルト: ["no title"]。
     *
     * @return フィールド[titleRow]から取得した値。
     */
    public String getTitleRow() {
        return fTitleRow;
    }

    /**
     * フィールド [runtimePackage] の値を設定します。
     *
     * フィールドの説明: [ランタイムクラスを生成する生成先を指定します。パッケージ名が確定された状態で格納されます。]。
     *
     * @param argRuntimePackage フィールド[runtimePackage]に設定する値。
     */
    public void setRuntimePackage(final String argRuntimePackage) {
        fRuntimePackage = argRuntimePackage;
    }

    /**
     * フィールド [runtimePackage] の値を取得します。
     *
     * フィールドの説明: [ランタイムクラスを生成する生成先を指定します。パッケージ名が確定された状態で格納されます。]。
     *
     * @return フィールド[runtimePackage]から取得した値。
     */
    public String getRuntimePackage() {
        return fRuntimePackage;
    }

    /**
     * フィールド [fieldList] の値を設定します。
     *
     * フィールドの説明: [フィールドのリスト。]。
     *
     * @param argFieldList フィールド[fieldList]に設定する値。
     */
    public void setFieldList(final List<blanco.csv.valueobject.BlancoCsvFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * フィールド [fieldList] の値を取得します。
     *
     * フィールドの説明: [フィールドのリスト。]。
     * デフォルト: [new java.util.ArrayList<blanco.csv.valueobject.BlancoCsvFieldStructure>()]。
     *
     * @return フィールド[fieldList]から取得した値。
     */
    public List<blanco.csv.valueobject.BlancoCsvFieldStructure> getFieldList() {
        return fFieldList;
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
        buf.append("blanco.csv.valueobject.BlancoCsvStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",descriptionList=" + fDescriptionList);
        buf.append(",delimiter=" + fDelimiter);
        buf.append(",encoding=" + fEncoding);
        buf.append(",titleRow=" + fTitleRow);
        buf.append(",runtimePackage=" + fRuntimePackage);
        buf.append(",fieldList=" + fFieldList);
        buf.append("]");
        return buf.toString();
    }
}
