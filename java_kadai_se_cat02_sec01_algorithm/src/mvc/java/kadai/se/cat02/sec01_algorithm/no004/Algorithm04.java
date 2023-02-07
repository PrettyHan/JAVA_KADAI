package mvc.java.kadai.se.cat02.sec01_algorithm.no004;

/**
 * Javaアルゴリズム問題4
 */
public class Algorithm04 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 縦「*」5個、横「*」9個の4角形を表示するプログラムを作成しましょう。
		//    ⇒【実行結果】
		//    *********
		//    *********
		//    *********
		//    *********
		//    *********

		// ---------- ①解答 start ----------
		int x = 5;
		int y = 9;
		for(int i=1 ; i<=x; i++) {
			System.out.println();
			for(int j =1 ; j<=y; j++) {
				System.out.printf("*");
			}
		}


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = 3」「y = 10」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//    **********
		//    **********
		//    **********

		// ---------- ②解答 start ----------
		x = 3;
		y = 10;


		for(int i=1 ; i<=x; i++) {
			System.out.println();
			for(int j =1 ; j<=y; j++) {
				System.out.printf("*");
			}
		}

		// ---------- ②解答 end ----------

	}

}
