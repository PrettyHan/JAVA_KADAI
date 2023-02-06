package mvc.java.kadai.se.cat02.sec01_algorithm.no003;

/**
 * Javaアルゴリズム問題3
 */
public class Algorithm03 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 1から変数xまでの数を、1行に変数y個つづ表示するプログラムを作成しましょう。
		//    「27」はxに、「5」はyに代入しx,yを用いてプログラムを作成してください。
		//    ⇒【実行結果】
		//    1       2       3       4       5
		//    6       7       8       9       10
		//    11      12      13      14      15
		//    16      17      18      19      20
		//    21      22      23      24      25
		//    26      27

		// ---------- ①解答 start ----------
		int x = 27;
		int y = 5;
		int count = 0;

		for(int i = 1; i <= x; i++) {
			if(count % y == 0) {
				System.out.println();
			}
			System.out.print(i+" ");
			count++;
		}


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = 16」「y = 4」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう
		//    ⇒【実行結果】
		//    1       2       3       4
		//    5       6       7       8
		//    9       10      11      12
		//    13      14      15      16

		// ---------- ②解答 start ----------

		x = 16;
		y = 4;
		count = 0;

		for(int i = 1; i <= x; i++) {
			if(count % y == 0) {
				System.out.println();
			}
			System.out.print(i+" ");
			count++;
		}


		// ---------- ②解答 end ----------

	}

}
