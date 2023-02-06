package mvc.java.kadai.se.cat01.sec02_controlsyntax.no014;

public class JavaControlSyntaxBasic14 {

	/* 制御文の組み合わせ（穴埋め問題）
	 * 変数countが10以下の場合に下記の処理を繰り返します
	 * ・変数countが3または7の場合、変数totalの値に3をかける
	 * ・変数countが3または7以外の場合、変数totalの値に1を足す
	 * ・変数countをインクリメントする
	 * ①～②にはどのような文を書けばよいでしょうか？
	 * =====コンソール出力結果=====
	 * 39
	 * =====================
	 */
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		while (count <= 10) {
			if(count == 3 || count == 7) {
				total *= 3;
			}
			else {
				total += 1;
			}
			count++;
		}
		System.out.println(total);
	}

}
