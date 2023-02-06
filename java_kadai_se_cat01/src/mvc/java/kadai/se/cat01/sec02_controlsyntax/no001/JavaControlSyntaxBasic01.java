package mvc.java.kadai.se.cat01.sec02_controlsyntax.no001;

/*
 * ◆制御構文【条件分岐】の使用
 */
public class JavaControlSyntaxBasic01 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ① 「x = 1450」が10の倍数であるか否かを判断するプログラムを作成しましょう。
		//    ⇒【コンソール 実行結果】10の倍数である
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 1450;
		if(x % 10 == 0) {
			System.out.printf("%dの倍数である", 10);
		}
		else {
			System.out.printf("%dの倍数ではない", 10);
		}


		// ---------- ①解答 end ----------
		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 1450」を「x = 12345」に変更した場合、
		//    実行結果が「10の倍数ではない」と判断されるか確認しましょう。
		//    ⇒【実行結果】10の倍数ではない
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 12345;
		if(x % 10 == 0) {
			System.out.printf("%dの倍数である", 10);
		}
		else {
			System.out.printf("%dの倍数ではない", 10);
		}


		// ---------- ②解答 end ----------



	}

}
