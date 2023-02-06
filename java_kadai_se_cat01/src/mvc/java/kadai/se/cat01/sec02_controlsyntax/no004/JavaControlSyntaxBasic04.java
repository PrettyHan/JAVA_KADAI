package mvc.java.kadai.se.cat01.sec02_controlsyntax.no004;

/*
 * ◆制御構文【条件分岐】の使用
 */
public class JavaControlSyntaxBasic04 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ①「x = 244」と「y = 230」の差は10以下であるか否かを判断するプログラムを作成しましょう。
		//    ⇒【実行結果】差は10以下ではない
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 244;
		int y = 230;

		if(Math.abs(x - y) <= 10) {
			System.out.println("差は10以下です");
		}
		else {
			System.out.println("差は10以下ではない");
		}


		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 244」を「x = 240」に変更した場合、
		//    実行結果が「差は10以下ではない」と判断されるか確認しましょう。
		//    ⇒【実行結果】差は10以下です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 240;
		if(Math.abs(x - y) <= 10) {
			System.out.println("差は10以下です");
		}
		else {
			System.out.println("差は10以下ではない");
		}


		// ---------- ②解答 end ----------



	}

}
