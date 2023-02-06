package mvc.java.kadai.se.cat01.sec05_class.no008;

/*
 * ◆別クラスのメソッド定義
 * JavaClassBasic08Sub.javaのdoubleNumberメソッドを使用すると、
 * 第1引数で受け取った整数を2倍にして戻り値として返すものとします。
 *
 * 以下の実行結果になるように、JavaClassBasic08Subクラスに
 * doubleNumberメソッドを定義しましょう。
 *
 * ===== コンソール 実行結果 =====
 * 16
 * ===============================
 *
 * ※JavaClassBasic08.javaの編集不可
 *
 */
public class JavaClassBasic08 {

	public static void main(String[] args) {
		JavaClassBasic08Sub ucs = new JavaClassBasic08Sub();
		int testNum = 8;
		int resultNum = ucs.doubleNumber(testNum);
		System.out.println(resultNum);

	}

}
