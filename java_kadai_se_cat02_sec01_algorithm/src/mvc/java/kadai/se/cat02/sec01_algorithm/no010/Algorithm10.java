package mvc.java.kadai.se.cat02.sec01_algorithm.no010;

/**
 * Javaアルゴリズム問題10
 */
public class Algorithm10 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。。

		// ① 正の数の場合0までカウントダウンし、負の数の場合0までカウントアップするプログラムを作成しましょう。
		//    変数xに「5」を代入し、xを用いてプログラムを作成しましょう。「5」は正の数なので、カウントダウンします。
		//    ⇒【実行結果】5 4 3 2 1 0

		// ---------- ①解答 start ----------
		int count = 5;
		while(count >= 0 ) {
			System.out.print(count+ " ");
			count -= 1;
		}



		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = -5」に変更した場合、
		//    「-5」は負の数なので、カウントアップします。
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】-5 -4 -3 -2 -1 0

		// ---------- ②解答 start ----------
		count = -5;
		while(count <= 0 ) {
			System.out.print(count+ " ");
			count += 1;
		}


		// ---------- ②解答 end ----------



	}

}
