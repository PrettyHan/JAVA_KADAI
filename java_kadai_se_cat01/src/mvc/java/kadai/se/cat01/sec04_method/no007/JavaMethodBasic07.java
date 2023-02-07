package mvc.java.kadai.se.cat01.sec04_method.no007;

/*
 * ◆メソッドの定義
 * メソッド「makeMessage()」を使用すると、
 * コンソールに以下の実行結果が表示されるとします。
 *
 * makeMessage()は「おはようございます！」という文字列を
 * 戻り値として返すメソッドです。
 *
 * 以下の実行結果になるように、メソッドを定義しましょう。
 *
 * ===== コンソール 実行結果 =====
 * おはようございます！
 * ======================
 *
 * ※mainメソッドの編集不可
 *
 */
public class JavaMethodBasic07 {

	public static void main(String[] args) {
		String str = makeMessage();
		System.out.println(str);

	}

	// ↓↓↓makeMessage()定義 ここから↓↓↓
	public static String makeMessage() {
		return "おはようございます！";
	}



	// ↑↑↑makeMessage()定義 ここまで↑↑↑

}
