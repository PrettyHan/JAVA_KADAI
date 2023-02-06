package mvc.java.kadai.se.cat02.sec01_algorithm.no009;

/**
 * Javaアルゴリズム問題9
 */
public class Algorithm09 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 123の桁数を求めるプログラムを作成しましょう。
		//    変数xに「123」代入し、xを用いてプログラムを作成しましょう。
		//    ⇒【実行結果】入力された数値は3桁です

		// ---------- ①解答 start ----------
		int x = 123;
		String answer = String.valueOf(Math.abs(x));
		System.out.printf("入力された数値は%d桁です", answer.length());


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = -12345」に変更した場合、
		// 　 以下実行結果通りに表示されるか確認しましょう。

		//    ⇒【実行結果】入力された数値は5桁です

		// ---------- ②解答 start ----------
		x = -12345;
		answer = String.valueOf(Math.abs(x));
		System.out.printf("入力された数値は%d桁です", answer.length());


		// ---------- ②解答 end ----------



	}

}
