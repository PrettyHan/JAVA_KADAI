package mvc.java.kadai.se.cat02.sec01_algorithm.no008;

/**
 * Javaアルゴリズム問題8
 */
public class Algorithm08 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 2つの整数を比べて「大きいほう「小さいほう」の値をそれぞれ表示する、
		//    同値の場合はその旨を表示するプログラムを作成しましょう。
		//    変数xに「83」、yに「45」を代入し挙動を確認しましょう。
		//    ⇒【実行結果】
		//    大きいほうの値は83です。
		//    小さいほうの値は45です。

		// ---------- ①解答 start ----------
		int x = 83;
		int y = 45;

		if(x ==y) {
			System.out.printf("両方とも%dです。", x);
		}
		else if(x < y) {
			System.out.printf("大きいほうの値は%dです。%n", y);
			System.out.printf("小さいほうの値は%dです。%n", x);
		}
		else {
			System.out.printf("大きいほうの値は%dです。%n", x);
			System.out.printf("小さいほうの値は%dです。%n", y);
		}


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=28」「y=53」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//    大きいほうの値は53です。
		//    小さいほうの値は28です。

		// ---------- ②解答 start ----------
		x = 28;
		y = 53;
		if(x ==y) {
			System.out.printf("両方とも%dです。", x);
		}
		else if(x < y) {
			System.out.printf("大きいほうの値は%dです。%n", y);
			System.out.printf("小さいほうの値は%dです。%n", x);
		}
		else {
			System.out.printf("大きいほうの値は%dです。%n", x);
			System.out.printf("小さいほうの値は%dです。%n", y);
		}

		// ---------- ②解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ③ ①で作成したプログラムの変数値を「x=28」「y=28」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】両方とも28です。

		// ---------- ③解答 start ----------
		x = 28;
		y = 28;
		if(x ==y) {
			System.out.printf("両方とも%dです。", x);
		}
		else if(x < y) {
			System.out.printf("大きいほうの値は%dです。%n", y);
			System.out.printf("小さいほうの値は%dです。%n", x);
		}
		else {
			System.out.printf("大きいほうの値は%dです。%n", x);
			System.out.printf("小さいほうの値は%dです。%n", y);
		}


		// ---------- ③解答 end ----------



	}

}
