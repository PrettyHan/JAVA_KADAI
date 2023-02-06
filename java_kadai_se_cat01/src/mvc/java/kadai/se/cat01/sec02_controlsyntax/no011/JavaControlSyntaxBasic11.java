package mvc.java.kadai.se.cat01.sec02_controlsyntax.no011;

/*
 * ◆制御文の組み合わせ
 */
public class JavaControlSyntaxBasic11 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ① 19(x = 19)以下で正の偶数を昇順で表示するプログラムを作成しましょう。
		//    ⇒【実行結果】2　4　6　8　10　12　14　16　18
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 19;
		for(int i = 2 ; i <= x ; i += 2) {
			System.out.printf("%d ", i);
		}



		// ---------- ①解答 end ----------
		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 19」を「x = 20」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう
		//    ⇒【実行結果】2　4　6　8　10　12　14　16　18　20
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 20;
		for(int i = 2 ; i <= x ; i += 2) {
			System.out.printf("%d ", i);
		}




		// ---------- ②解答 end ----------



	}

}
