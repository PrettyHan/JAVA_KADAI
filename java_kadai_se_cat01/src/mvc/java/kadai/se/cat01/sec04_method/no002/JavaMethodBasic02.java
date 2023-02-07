package mvc.java.kadai.se.cat01.sec04_method.no002;

/*
 * ◆メソッドの利用
 * メソッド「showMessage(String msg)」をmainメソッドで使用し、
 * コンソールに以下の実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * UseJavaMethod02#showMessage(String msg)
 * こんにちは！
 * ======================
 *
 * ※showMessage(String msg)メソッドの編集不可
 *
 */
public class JavaMethodBasic02 {

	public static void main(String[] args) {
		String str = "こんにちは！"; // この変数を利用すること
		showMessage(str);

	}

	public static void showMessage(String msg) {
		System.out.println("UseJavaMethod02#showMessage(String msg)");
		System.out.println(msg);
	}

}
