package mvc.java.kadai.se.cat01.sec05_class.no025;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic25Subクラスは
 * String型配列「strArray」(String[] strArray = new String[5])と
 * int型の「count」フィールド、
 * strArrayフィールドに第1引数で渡されたString型データを
 * 格納できるaddStrメソッド、
 * strArrayフィールドに格納されたString型データを
 * 【新しく格納された順】で表示するshowAllStrDescメソッドがあります。
 *
 * 以下の実行結果になるように
 * JavaClassBasic25Subクラスの①～③までを補い
 * JavaClassBasic25Subクラスを完成させましょう。
 *
 * ☆JavaClassBasic25Subクラスの
 * 「strArray」「count」フィールドを有効に活用しましょう
 * ===== コンソール 実行結果 =====
 * [あいうえお]を格納しました
 * [かきくけこ]を格納しました
 * [さしすせそ]を格納しました
 * [たちつてと]を格納しました
 * [なにぬねの]を格納しました
 * これ以上格納できません
 * ◆strArray文字列一覧(新しく格納された順)
 * なにぬねの
 * たちつてと
 * さしすせそ
 * かきくけこ
 * あいうえお
 * ===============================
 *
 * ※JavaClassBasic25.java、
 * JavaClassBasic25Sub.java既存プログラムの編集不可
 *
 */
public class JavaClassBasic25 {

	public static void main(String[] args) {

		JavaClassBasic25Sub ucs = new JavaClassBasic25Sub();
		ucs.addStr("あいうえお");
		ucs.addStr("かきくけこ");
		ucs.addStr("さしすせそ");
		ucs.addStr("たちつてと");
		ucs.addStr("なにぬねの");
		ucs.addStr("はひふへほ");
		ucs.showAllStrDesc();

	}

}
