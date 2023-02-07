package mvc.java.kadai.se.cat02.sec01_algorithm.no013;

/**
 * Javaアルゴリズム問題13
 */
public class Algorithm13 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 実行例のように、身長と標準体重(ブローカ式桂変法)【（身長－100）×0.9】の対応表を表示するプログラムを作成しましょう。
		//    xに「150」cm(開始値)、yに「170」cm(終了値)、zに「5」cm(増分)を代入しx,y,zを用いてプログラムを作成してください。
		//    ⇒【実行結果】
		//    150cm   45.0kg
		//    155cm   49.5kg
		//    160cm   54.0kg
		//    165cm   58.5kg
		//    170cm   63.0kg

		// ---------- ①解答 start ----------
		int x = 150;
		int y = 170;
		int z = 5;
		double weight = 0;
		for(int i = x; i <= y; i += z) {
			weight = (i - 100) * 0.9;
			System.out.printf("%dcm   %.1fkg%n",i,weight);

		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=140」「y=180」「x=10」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//    140cm   36.0kg
		//    150cm   45.0kg
		//    160cm   54.0kg
		//    170cm   63.0kg
		//    180cm   72.0kg

		// ---------- ②解答 start ----------
		x = 140;
		y = 180;
		z = 10;
		weight = 0;
		for(int i = x; i <= y; i += z) {
			weight = (i - 100) * 0.9;
			System.out.printf("%dcm   %.1fkg%n",i,weight);

		}


		// ---------- ②解答 end ----------



	}

}
