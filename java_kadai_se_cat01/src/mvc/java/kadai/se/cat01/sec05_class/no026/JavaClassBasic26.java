package mvc.java.kadai.se.cat01.sec05_class.no026;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic26Subクラスは
 * JavaClassBasic26Obj型配列「ucoArray」(JavaClassBasic26Obj[] ucoArray = new JavaClassBasic26Obj[5])と
 * int型の「count」フィールド、
 * ucoArrayフィールドに第1引数で渡されたJavaClassBasic26Obj型データを
 * 格納できるaddMemberメソッド、
 * ucoArrayフィールドに格納されたJavaClassBasic26Obj型データから
 * 「氏名(年齢)」を一覧表示するshowAllMemberメソッドがあります。
 *
 * 以下の実行結果になるように
 * JavaClassBasic26Subクラスの①～③までを補い
 * JavaClassBasic26Subクラスを完成させましょう。
 *
 * ☆JavaClassBasic26ObjはJavaClassBasic17Objと構成が同じクラスです
 * ☆JavaClassBasic26Subクラスの
 * 「ucoArray」「count」フィールドを有効に活用しましょう
 * ===== コンソール 実行結果 =====
 * [原正人]さんを格納しました
 * [岸川千絵]さんを格納しました
 * [杉山洋一]さんを格納しました
 * [白木美緒]さんを格納しました
 * [一宮眞一]さんを格納しました
 * これ以上格納できません
 * ◆従業員一覧
 * 原正人(24)
 * 岸川千絵(31)
 * 杉山洋一(45)
 * 白木美緒(27)
 * 一宮眞一(36)
 * ===============================
 *
 * ※JavaClassBasic26.java、JavaClassBasic26Obj.java
 * JavaClassBasic26Sub.java既存プログラムの編集不可
 *
 */
public class JavaClassBasic26 {

	public static void main(String[] args) {

		JavaClassBasic26Sub ucs = new JavaClassBasic26Sub();

		JavaClassBasic26Obj objA = new JavaClassBasic26Obj("原", "正人", 24, 'm', "111-1111", "東京都", "11-1111-1111");
		ucs.addMember(objA);

		JavaClassBasic26Obj objB = new JavaClassBasic26Obj("岸川", "千絵", 31, 'f', "222-2222", "栃木県", "22-2222-2222");
		ucs.addMember(objB);

		JavaClassBasic26Obj objC = new JavaClassBasic26Obj("杉山", "洋一", 45, 'm', "333-3333", "秋田県", "33-3333-3333");
		ucs.addMember(objC);

		JavaClassBasic26Obj objD = new JavaClassBasic26Obj("白木", "美緒", 27, 'f', "444-4444", "神奈川県", "44-4444-4444");
		ucs.addMember(objD);

		JavaClassBasic26Obj objE = new JavaClassBasic26Obj("一宮", "眞一", 36, 'm', "555-5555", "福岡県", "55-5555-5555");
		ucs.addMember(objE);

		JavaClassBasic26Obj objF = new JavaClassBasic26Obj("下山", "麗華", 28, 'f', "666-6666", "長野県", "66-6666-6666");
		ucs.addMember(objF);

		ucs.showAllMember();

	}

}
