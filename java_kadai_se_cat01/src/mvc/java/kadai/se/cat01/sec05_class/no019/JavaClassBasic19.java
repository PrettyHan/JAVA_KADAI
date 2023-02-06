package mvc.java.kadai.se.cat01.sec05_class.no019;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic19Objクラスは次のフィールドを保有しています。
 * ・bookTitle  (本のタイトル/String型)
 * ・bookPrice  (本の価格/int型)
 * ・bookAuthor (本の著者/String型)
 *
 * JavaClassBasic19Objクラスの各フィールドにデータを格納し、以下の実行結果になるように
 * JavaClassBasic19Objクラス(JavaClassBasic19Obj.java)を完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * ◆本の情報
 * タイトル：桃太郎
 * 価格：800
 * 著者：OPST太郎
 * ===============================
 *
 * ※JavaClassBasic19.javaの編集不可
 *
 */
public class JavaClassBasic19 {

	public static void main(String[] args) {

		String bookTitle = "桃太郎";
		int bookPrice = 800;
		String bookAuthor  = "OPST太郎";

		JavaClassBasic19Obj book = new JavaClassBasic19Obj(bookTitle, bookPrice, bookAuthor);
		showBookInfo(book);

	}

	public static void showBookInfo(JavaClassBasic19Obj uco) {

		System.out.println("◆本の情報");
		System.out.println("タイトル：" + uco.getBookTitle());
		System.out.println("価格：" + uco.getBookPrice());
		System.out.println("著者：" + uco.getBookAuthor());

	}

}
