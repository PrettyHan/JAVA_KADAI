package mvc.java.kadai.se.cat01.sec07_collection.no011;

/*
 * ◆コレクション(JavaAPI)利用
 * JavaCollectionBasic11Subクラスは
 * キー(key)がString型、値(value)がInteger型LinkedHashMap
 * 「memMap」(LinkedHashMap<String, Integer> memMap = new LinkedHashMap<>())と
 * memMapフィールドに第1引数、第2引数で渡された名前(String)と年齢(int)データを
 * 格納できるaddMemberメソッド、
 * memMapフィールドに格納されたデータから「氏名(年齢)」を
 * 一覧表示するshowAllMemberメソッドがあります。
 *
 * 以下実行結果になるように
 * JavaCollectionBasic11Subクラスの①、②を補い
 * JavaCollectionBasic11Subクラスを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * [原正人]さんを格納しました
 * [岸川千絵]さんを格納しました
 * [杉山洋一]さんを格納しました
 * [白木美緒]さんを格納しました
 * [一宮眞一]さんを格納しました
 * [下山麗華]さんを格納しました
 * ◆従業員一覧
 * 原正人(24)
 * 岸川千絵(31)
 * 杉山洋一(45)
 * 白木美緒(27)
 * 一宮眞一(36)
 * 下山麗華(28)
 * ===============================
 *
 * ※JavaCollectionBasic11.java、
 * 　JavaCollectionBasic11Sub.java既存プログラムの編集不可
 *
 */
public class JavaCollectionBasic11 {

	public static void main(String[] args) {

		JavaCollectionBasic11Sub ujcs = new JavaCollectionBasic11Sub();
		ujcs.addMember("原正人",24);
		ujcs.addMember("岸川千絵", 31);
		ujcs.addMember("杉山洋一", 45);
		ujcs.addMember("白木美緒", 27);
		ujcs.addMember("一宮眞一", 36);
		ujcs.addMember("下山麗華", 28);
		ujcs.showAllMember();

	}

}
