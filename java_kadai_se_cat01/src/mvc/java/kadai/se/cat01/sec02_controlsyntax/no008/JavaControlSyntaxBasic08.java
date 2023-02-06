package mvc.java.kadai.se.cat01.sec02_controlsyntax.no008;

/*
 * ◆制御構文【繰り返し】の使用
 */
public class JavaControlSyntaxBasic08 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ① 28(x = 28)以上37(y = 37)以下の整数の和を求めるプログラムを作成しましょう。
		//    ⇒【実行結果】28以上37以下の全整数の和は325です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 28;
		int y = 37;
		int sum = 0;

		for(int i = x; i <= y; i++) {
			sum += i;
		}



		System.out.println(x + "以上" + y + "以下の全整数の和は" + sum + "です");

		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①のプログラムと全く同じ動作をするプログラムを
		//    制御構文「while」を使用して作成しましょう。
		//    ⇒【実行結果】28以上37以下の全整数の和は325です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		sum = 0;
		int i = x;
		while(true) {
			if(i > y) {
				break;
			}
			sum += i;
			i++;
		}



		System.out.println(x + "以上" + y + "以下の全整数の和は" + sum + "です");

		// ---------- ②解答 end ----------

	}

}
