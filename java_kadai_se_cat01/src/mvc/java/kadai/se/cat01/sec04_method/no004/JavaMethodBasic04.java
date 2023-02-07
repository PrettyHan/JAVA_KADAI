package mvc.java.kadai.se.cat01.sec04_method.no004;

/*
 * ◆メソッドの利用
 * メソッド「makeMessage()」をmainメソッドで使用し、
 * コンソールに以下の実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * UseJavaMethod04#makeMessage()
 * こんにちは！
 * ======================
 *
 * ※makeMessage()メソッドの編集不可
 *
 */
public class JavaMethodBasic04 {

	public static void main(String[] args) {

		System.out.println(makeMessage());
	}

	public static String makeMessage() {
		String msg = "UseJavaMethod04#makeMessage()\nこんにちは！";
		return msg;
	}

}
