package mvc.java.kadai.se.cat02.sec01_algorithm.no019;

/**
 * Javaアルゴリズム問題19
 */
public class Algorithm19 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 5人分の身長を要素数5で要素型intの配列に格納し、その配列を使用して平均身長を求めるプログラムを作成しましょう。
		//    以下配列tallArrayを用いてプログラムを作成してください。
		//    ⇒【実行結果】平均身長：173

		// ---------- ①解答 start ----------
		int[] tallArray = new int[5];
		tallArray[0] = 158;
		tallArray[1] = 180;
		tallArray[2] = 180;
		tallArray[3] = 190;
		tallArray[4] = 160;

		int answer = solve(tallArray);

		System.out.println("平均身長："+answer);


		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの配列を以下に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】平均身長：183

		// ---------- ②解答 start ----------

		tallArray[0] = 175;
		tallArray[1] = 185;
		tallArray[2] = 180;
		tallArray[3] = 190;
		tallArray[4] = 185;

		answer = solve(tallArray);

		System.out.println("平均身長："+answer);


		// ---------- ②解答 end ----------

		// ※①と②は変数値を変更する以外のプログラムの差異は認めません。

	}

	public static int solve(int[] arr) {
		int sum = 0;
		for(int height : arr) {
			sum += height;
		}
		return Math.round((sum / arr.length));
	}

}
