package mvc.java.kadai.se.cat01.sec04_method.no006;

/*
 * ◆メソッドの定義
 * メソッド「showMessage()」を使用すると、
 * コンソールに以下の実行結果が表示されるとします。
 *
 * showMessage()は「おはようございます！」という文字列を
 * コンソール上に表示するメソッドです。
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
public class JavaMethodBasic06 {

	public static void main(String[] args) {


		System.out.println(showMessage());

	}

	// ↓↓↓showMessage()定義 ここから↓↓↓
	public static String showMessage() {
		return "おはようございます！";
	}


	// ↑↑↑showMessage()定義 ここまで↑↑↑

}
