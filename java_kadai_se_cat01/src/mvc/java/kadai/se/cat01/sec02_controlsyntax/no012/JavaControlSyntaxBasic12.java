package mvc.java.kadai.se.cat01.sec02_controlsyntax.no012;

public class JavaControlSyntaxBasic12 {

	/* 制御文の組み合わせ (穴埋め問題)
	 * for文の変数iが0から10までの間、下記の処理を繰り返します
	 * ・変数iが5以下の値の時は、変数iの値をコンソールに出力する
	 * ・それ以外の場合は「待機中…」とコンソールに出力する
	 * ①と②にはどのような文をかけばよいでしょうか？
	 * =====コンソール出力結果=====
	 * 0
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 * 待機中…
	 * 待機中…
	 * 待機中…
	 * 待機中…
	 * 待機中…
	 * =====================
	 */
	public static void main(String[] args) {

		for (int i = 0; i <=10 ; i++) {
			if(i <= 5) {
				System.out.println(i);
			} else {
				System.out.println("待機中…");
			}
		}

	}

}
