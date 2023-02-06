package mvc.java.kadai.se.cat02.sec01_algorithm.no001;

/**
 * Javaアルゴリズム問題1
 */
public class Algorithm01 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 19以下で2のべき乗を昇順で表示するプログラムを作成しましょう。
		//    ⇒【実行結果】1　2　4　8　16

		// ---------- ①解答 start ----------
		int x = 19;
		solve(x);






		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 19」を「x = 50」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう
		//    ⇒【実行結果】1　2　4　8　16　32

		// ---------- ②解答 start ----------
		x = 50;
		solve(x);


		// ---------- ②解答 end -----	-----



	}

	public static void solve(int x) {
		for(int i = 1; i < x ; i = i*2) {
			System.out.println(i);
			if(i>=19) {
				break;
			}
		}
	}

}
