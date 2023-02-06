package mvc.java.kadai.se.cat02.sec01_algorithm.no007;

/**
 * Javaアルゴリズム問題7
 */
public class Algorithm07 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 変数x,y,z3つの内最大値を求めるプログラムを作成しましょう。
		//    xに「83」、yに「45」、zに「62」を代入し挙動を確認しましょう。
		//    ⇒【実行結果】最大値は83です

		// ---------- ①解答 start ----------
		int x = 83;
		int y = 45;
		int z = 62;
		int temp = Math.max(x, y);
		int answer = Math.max(temp, z);


		System.out.printf("最大値は%dです",answer);


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=12」「y=34」「z=47」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】最大値は47です

		// ---------- ②解答 start ----------
		x = 12;
		y = 34;
		z = 47;
		temp = Math.max(x, y);
		answer = Math.max(temp, z);


		System.out.printf("最大値は%dです",answer);


		// ---------- ②解答 end ----------

	}

}
