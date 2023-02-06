package mvc.java.kadai.se.cat01.sec02_controlsyntax.no016;

public class JavaControlSyntaxBasic16 {

	/* 制御文の組み合わせ（記述問題）
	 * 20回、下記の処理を繰り返します
	 * ・回数が奇数の場合、合計値(total)に3を足す
	 * ・回数が偶数の場合、合計値(total)に回数値(count)を足す
	 * 繰り返しが終わったら、コンソールに合計値(total)を出力する
	 * =====コンソール出力結果=====
	 * 120
	 * =====================
	 *
	 * ※既存の変数を利用してプログラムを考えてください
	 * ※ 奇数、偶数の求め方：
	 *   2で割った余りが0の場合は偶数、1の場合は奇数になります
	 *   余りを求めるには % を利用してください
	 *
	 * 上記を実現するにはどのような処理を書けばよいでしょうか？
	 */
	public static void main(String[] args) {

		int total = 0;
		int count = 0;

		while(count < 20) {
			if(count % 2 == 0) {
				total += count;
			}
			else {
				total += 3;
			}
			count++;
		}
		System.out.println(total);

	}

}
