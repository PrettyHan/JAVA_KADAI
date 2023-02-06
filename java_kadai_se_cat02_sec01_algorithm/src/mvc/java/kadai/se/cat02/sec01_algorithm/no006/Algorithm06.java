package mvc.java.kadai.se.cat02.sec01_algorithm.no006;

/**
 * Javaアルゴリズム問題6
 */
public class Algorithm06 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 変数x,y,z3つの内最小値を求めるプログラムを作成しましょう。
		//    xに「83」、yに「45」、zに「62」を代入し挙動を確認しましょう。
		//    ⇒【実行結果】最小値は45です

		// ---------- ①解答 start ----------
		int x = 83;
		int y = 45;
		int z = 62;
		int temp = Math.min(x, y);
		int answer = Math.min(temp, z);


		System.out.printf("最小値は%dです",answer);


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=12」「y=34」「z=47」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】最小値は12です

		// ---------- ②解答 start ----------
		x = 12;
		y = 34;
		z = 47;
		temp = Math.min(x, y);
		answer = Math.min(temp, z);


		System.out.printf("最小値は%dです",answer);


		// ---------- ②解答 end ----------

	}

}
