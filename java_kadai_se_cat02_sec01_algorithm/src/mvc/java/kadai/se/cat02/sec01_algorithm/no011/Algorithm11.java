package mvc.java.kadai.se.cat02.sec01_algorithm.no011;

/**
 * Javaアルゴリズム問題11
 */
public class Algorithm11 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 整数値を逆順に表示するプログラムを作成しましょう。
		//    変数xに「1963」を代入し、xを用いてプログラムを作成しましょう。
		//    ⇒【実行結果】1963を逆から読むと3691です

		// ---------- ①解答 start ----------
		int x = 1963;
		int tmp = x;
		int reverse = 0;

		while (x != 0) {
			int digit = x % 10;
			reverse = reverse * 10 + digit;
			x /= 10;
		}
		System.out.printf("%dを逆から読むと%dです", tmp, reverse);

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = 32475」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】32475を逆から読むと57423です

		// ---------- ②解答 start ----------
		x = 32475;
		tmp = x;
		reverse = 0;
		while (x != 0) {
			int digit = x % 10;
			reverse = reverse * 10 + digit;
			x /= 10;
		}
		System.out.printf("%dを逆から読むと%dです", tmp, reverse);


		// ---------- ②解答 end ----------



	}

}
