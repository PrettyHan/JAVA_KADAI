package mvc.java.kadai.se.cat01.sec02_controlsyntax.no003;

/*
 * ◆制御構文【条件分岐】の使用
 */
public class JavaControlSyntaxBasic03 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ①「x = 232534」は偶数か奇数か判断するプログラムを作成しましょう。
		//    ⇒【実行結果】偶数である
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 232534;

		if(x % 2 == 0) {
			System.out.println("偶数である");
		}
		else {
			System.out.println("奇数である");
		}


		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 232534」を「x = 232535」に変更した場合、
		//    実行結果が「奇数である」と判断されるか確認しましょう。
		//    ⇒【実行結果】奇数である
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 232535;
		if(x % 2 == 0) {
			System.out.println("偶数である");
		}
		else {
			System.out.println("奇数である");
		}


		// ---------- ②解答 end ----------



	}

}
