package mvc.java.kadai.se.cat01.sec02_controlsyntax.no013;

public class JavaControlSyntaxBasic13 {

	/* 制御文の組み合わせ（穴埋め問題）
	 * 変数countが0以上の場合に以下の処理を繰り返します
	 * ・変数countが0以外の場合、変数countの値をコンソールに出力する
	 * ・変数countが0の場合、「終了」とコンソールに出力する
	 * ・変数countをデクリメントする
	 * ①～③にはどのような文をかけばよいでしょうか？
	 * =====コンソール出力結果=====
	 * 10
	 * 9
	 * 8
	 * 7
	 * 6
	 * 5
	 * 4
	 * 3
	 * 2
	 * 1
	 * 終了
	 * =====================
	 */
	public static void main(String[] args) {

		int count = 10;
		while (count >= 0) {
			if (count > 0) {
				System.out.println(count);
			} else {
				System.out.println("終了");
			}
			count--;
		}
	}

}
