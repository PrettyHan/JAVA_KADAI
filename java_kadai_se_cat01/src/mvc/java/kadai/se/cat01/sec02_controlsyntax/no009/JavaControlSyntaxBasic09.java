package mvc.java.kadai.se.cat01.sec02_controlsyntax.no009;

public class JavaControlSyntaxBasic09 {

	/* 制御文の組み合わせ（穴埋め問題）
	 * for文の変数 i が 2と8の時だけコンソールに出力を行いたいとき
	 * ①にはどのような条件を書けばよいでしょう？
	 * =====コンソール出力結果=====
	 * 2になりました
	 * 8になりました
	 * =====================
	 */
	public static void main(String[] args) {
		// 変数 i が 0 ～ 10まで繰り返す
		for (int i = 0; i <= 10; i++) {
			if(i == 2 || i == 8) {
				System.out.println(i + "になりました");
			}
		}

	}
}
