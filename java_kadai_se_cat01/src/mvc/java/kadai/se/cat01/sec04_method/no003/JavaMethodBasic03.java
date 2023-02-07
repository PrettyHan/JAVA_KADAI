package mvc.java.kadai.se.cat01.sec04_method.no003;

/*
 * ◆メソッドの利用
 * メソッド「showMessage(String msg, int num)」を
 * mainメソッドで使用し、
 * コンソールに以下の実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * UseJavaMethod03#showMessage(String msg, String num)
 * こんにちは！
 * 300
 * ======================
 *
 * ※showMessage(String msg, int num)メソッドの編集不可
 *
 */
public class JavaMethodBasic03 {

	public static void main(String[] args) {
		String str = "こんにちは！"; // この変数を利用すること
		int count = 30; // この変数を利用すること
		showMessage(str, count);
	}

	public static void showMessage(String msg, int num) {
		System.out.println("UseJavaMethod03#showMessage(String msg, String num)");
		System.out.println(msg);
		System.out.println(num * 10);
	}

}
