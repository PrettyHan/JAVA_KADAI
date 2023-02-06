package mvc.java.kadai.se.cat01.sec08_exception.no001;

/*
 * ◆意図的な例外の発生
 *
 * JavaExceptionBasic01Objクラスには
 * 引数で渡した数値の割り算を行うdivideメソッドがあります。
 *
 *【システム上、divideメソッドの第二引数には0を渡すことができません。】
 *
 * mainメソッドでJavaExceptionBasic01Objクラスをインスタンス化し使用した結果
 * 以下の実行結果が表示されるようにJavaExceptionBasic01Objクラスの①、②を補い、
 * プログラムを完成させましょう。
 *
 * ☆既存の各クラスのプログラムや実行結果から解答を導きましょう
 *
 * ===== コンソール 実行結果 =====
 * 10÷5＝2
 * 0で割ることはできません。
 * 3÷1＝3
 * ===============================
 *
 * ※JavaExceptionBasic01.java、
 *   JavaExceptionBasic01Obj.java既存プログラムの編集不可
 *
 */
public class JavaExceptionBasic01 {

	public static void main(String[] args) {

		JavaExceptionBasic01Obj obj = new JavaExceptionBasic01Obj();
		obj.divide(10, 5);
		obj.divide(5, 0);
		obj.divide(3, 1);

	}

}
