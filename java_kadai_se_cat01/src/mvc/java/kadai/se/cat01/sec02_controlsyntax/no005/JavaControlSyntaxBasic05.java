package mvc.java.kadai.se.cat01.sec02_controlsyntax.no005;

/*
 * ◆制御構文【繰り返し】の使用
 */
public class JavaControlSyntaxBasic05 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ① 1から10までの和(1+2+3+…+10)を求めるプログラムを
		// 　制御構文「for」を使用し作成しましょう。
		//    ⇒【実行結果】合計は55
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 0;

		for(int i=0; i<=10; i++) {
			x += i;
		}

		System.out.println("合計は" + x);

		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①のプログラムと全く同じ動作をするプログラムを
		//    制御構文「while」を使用して作成しましょう。
		//    ⇒【実行結果】合計は55
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		int y = 0;
		int count = 1;
		while(true) {
			if(count > 10) {
				break;
			}
			y += count;
			count++;
		}

		System.out.println("合計は" + y);

		// ---------- ②解答 end ----------

	}

}
