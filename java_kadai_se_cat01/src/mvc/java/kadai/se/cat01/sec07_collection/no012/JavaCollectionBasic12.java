package mvc.java.kadai.se.cat01.sec07_collection.no012;

/*
 * ◆コレクション(JavaAPI)利用
 * JavaCollectionBasic12Subクラスは
 * JavaCollectionBasic12Obj型ArrayList「memList」
 * (ArrayList<JavaCollectionBasic12Obj> memList = new ArrayList<>())と
 * memListフィールドに第1引数で渡されたJavaCollectionBasic12Obj型データを
 * 格納できるaddMemberメソッド、
 * memListフィールドに格納されたデータから「氏名(年齢)、性別」を
 * 一覧表示するshowAllMemberメソッドがあります。
 *
 * 以下の実行結果になるように
 * JavaCollectionBasic12Subクラスの①、②を補い
 * JavaCollectionBasic12Subクラスを完成させましょう。
 *
 * ☆JavaCollectionBasic12Objに性別はchar型のデータ「m」「f」で
 * 保持されています。「m」なら男性、「f」なら女性になります。
 * ===== コンソール 実行結果 =====
 * [原正人]さんを格納しました
 * [岸川千絵]さんを格納しました
 * [杉山洋一]さんを格納しました
 * [白木美緒]さんを格納しました
 * [一宮眞一]さんを格納しました
 * [下山麗華]さんを格納しました
 * ◆従業員一覧
 * 原正人(24)、男性
 * 岸川千絵(31)、女性
 * 杉山洋一(45)、男性
 * 白木美緒(27)、女性
 * 一宮眞一(36)、男性
 * 下山麗華(28)、女性
 * ===============================
 *
 * ※JavaCollectionBasic12.java、JavaCollectionBasic12Obj.java
 *  JavaCollectionBasic12Sub.java既存プログラムの編集不可
 *
 */
public class JavaCollectionBasic12 {

	public static void main(String[] args) {

		JavaCollectionBasic12Sub ujcs = new JavaCollectionBasic12Sub();

		JavaCollectionBasic12Obj objA = new JavaCollectionBasic12Obj("原", "正人", 24, 'm', "111-1111", "東京都", "11-1111-1111");
		ujcs.addMember(objA);

		JavaCollectionBasic12Obj objB = new JavaCollectionBasic12Obj("岸川", "千絵", 31, 'f', "222-2222", "栃木県", "22-2222-2222");
		ujcs.addMember(objB);

		JavaCollectionBasic12Obj objC = new JavaCollectionBasic12Obj("杉山", "洋一", 45, 'm', "333-3333", "秋田県", "33-3333-3333");
		ujcs.addMember(objC);

		JavaCollectionBasic12Obj objD = new JavaCollectionBasic12Obj("白木", "美緒", 27, 'f', "444-4444", "神奈川県", "44-4444-4444");
		ujcs.addMember(objD);

		JavaCollectionBasic12Obj objE = new JavaCollectionBasic12Obj("一宮", "眞一", 36, 'm', "555-5555", "福岡県", "55-5555-5555");
		ujcs.addMember(objE);

		JavaCollectionBasic12Obj objF = new JavaCollectionBasic12Obj("下山", "麗華", 28, 'f', "666-6666", "長野県", "66-6666-6666");
		ujcs.addMember(objF);

		ujcs.showAllMember();

	}

}
