package mvc.java.kadai.se.cat01.sec07_collection.no010;

/*
 * ◆コレクション(JavaAPI)利用
 * JavaCollectionBasic10Subクラスは
 * String型ArrayList「strArrayList」(ArrayList<String> strArrayList = new ArrayList<>())と
 * strArrayListフィールドに第1引数で渡されたString型データを格納できるaddStrメソッド、
 * strArrayListフィールドに格納されたString型データを
 * 【新しく格納された順】で表示するshowAllStrDescメソッドがあります。
 *
 * 以下実行結果になるように
 * JavaCollectionBasic10Subクラスの①、②を補い
 * JavaCollectionBasic10Subクラスを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * [あいうえお]を格納しました
 * [かきくけこ]を格納しました
 * [さしすせそ]を格納しました
 * [たちつてと]を格納しました
 * [なにぬねの]を格納しました
 * [はひふへほ]を格納しました
 * ◆strArrayList文字列一覧(新しく格納された順)
 * はひふへほ
 * なにぬねの
 * たちつてと
 * さしすせそ
 * かきくけこ
 * あいうえお
 * ===============================
 *
 * ※JavaCollectionBasic10.java、
 * 　JavaCollectionBasic10Sub.java既存プログラムの編集不可
 *
 */
public class JavaCollectionBasic10 {

	public static void main(String[] args) {

		JavaCollectionBasic10Sub ujcs = new JavaCollectionBasic10Sub();
		ujcs.addStr("あいうえお");
		ujcs.addStr("かきくけこ");
		ujcs.addStr("さしすせそ");
		ujcs.addStr("たちつてと");
		ujcs.addStr("なにぬねの");
		ujcs.addStr("はひふへほ");
		ujcs.showAllStrDesc();

	}

}
