package mvc.java.kadai.se.cat01.sec08_exception.no003;

/*
 * ◆意図的な例外の発生
 *
 * JavaExceptionBasic01Objクラスには
 * 引数で渡した数値の割り算を行うdivideメソッドがあります。
 *
 *【システム上、divideメソッドの第二引数には0を渡すことができません。】
 *
 * 以下の実行結果が表示されるようにJavaExceptionBasic03ObjA～JavaExceptionBasic03ObjCクラスに
 * divideメソッドを定義しプログラムを完成させましょう。
 * ただし、divideメソッドにtry～catch文を使用しないでください。
 *
 * ☆既存の各クラスのプログラムや実行結果から解答を導きましょう
 *
 * ===== コンソール 実行結果 =====
 * JavaExceptionBasic03ObjA#divideメソッドです。9÷3＝3
 * JavaExceptionBasic03ObjA#divideメソッドです。22÷2＝11
 * JavaExceptionBasic03ObjB#divideメソッドです。10÷1＝10
 * JavaExceptionBasic03ObjB#divideメソッドです。0で割ることはできません。
 * ------------------------------
 * JavaExceptionBasic03ObjC#divideメソッドです。9÷3＝3
 * JavaExceptionBasic03ObjC#divideメソッドです。22÷2＝11
 * JavaExceptionBasic03ObjA#divideメソッドです。10÷1＝10
 * JavaExceptionBasic03ObjA#divideメソッドです。0で割ることはできません。
------------------------------
 * JavaExceptionBasic03ObjB#divideメソッドです。9÷3＝3
 * JavaExceptionBasic03ObjB#divideメソッドです。22÷2＝11
 * JavaExceptionBasic03ObjC#divideメソッドです。10÷1＝10
 * JavaExceptionBasic03ObjC#divideメソッドです。0で割ることはできません。
 * ===============================
 *
 * ※JavaExceptionBasic03.java 既存プログラムの編集不可
 *
 */
public class JavaExceptionBasic03 {

	public static void main(String[] args) {

		JavaExceptionBasic03ObjA objA = new JavaExceptionBasic03ObjA();
		JavaExceptionBasic03ObjB objB = new JavaExceptionBasic03ObjB();
		JavaExceptionBasic03ObjC objC = new JavaExceptionBasic03ObjC();

		// パターン①
		try {

			objA.divide(9,3);
			objA.divide(22,2);

			objB.divide(10,1);
			objB.divide(1,0);

			objC.divide(2,0);
			objC.divide(3,0);

		} catch (Exception e) {
			System.out.println("0で割ることはできません。");
		}

		System.out.println("------------------------------");

		// パターン②
		try {

			objC.divide(9,3);
			objC.divide(22,2);

			objA.divide(10,1);
			objA.divide(1,0);

			objB.divide(2,0);
			objB.divide(3,0);

		} catch (Exception e) {
			System.out.println("0で割ることはできません。");
		}

		System.out.println("------------------------------");

		// パターン③
		try {

			objB.divide(9,3);
			objB.divide(22,2);

			objC.divide(10,1);
			objC.divide(1,0);

			objA.divide(2,0);
			objA.divide(3,0);

		} catch (Exception e) {
			System.out.println("0で割ることはできません。");
		}



	}

}
