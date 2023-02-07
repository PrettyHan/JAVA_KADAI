package mvc.java.kadai.se.cat02.sec01_algorithm.no012;

/**
 * Javaアルゴリズム問題12
 */
public class Algorithm12 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 変数x,y,z3つの内、等しい数がいくつあるか判断するプログラムを作成しましょう。
		//    xに「83」、yに「45」、zに「62」を代入しx,y,zを用いてプログラムを作成してください。
		//    ⇒【実行結果】3つの値は異なります

		// ---------- ①解答 start ----------
		int x = 83;
		int y = 45;
		int z = 62;
		int count = 0;

		if(x == y) {
			count++;
		}
		else if(x == z) {
			count++;
		}
		else if(y == z) {
			count++;
		}

		switch(count) {
		case(0):
			System.out.println("3つの値は異なります");
			break;
		case(1):
			System.out.println("2つの値が等しいです");
			break;
		case(2):
			System.out.println("3つの値は等しいです");
			break;
		case(3):
			System.out.println("3つの値は等しいです");
			break;
		}
		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「y = 83」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】2つの値は等しいです

		// ---------- ②解答 start ----------
		x = 83;
		y = 83;
		z = 62;
		count = 0;

		if(x == y) {
			count++;
		}
		else if(x == z) {
			count++;
		}
		else if(y == z) {
			count++;
		}

		switch(count) {
		case(0):
			System.out.println("3つの値は異なります");
			break;
		case(1):
			System.out.println("2つの値が等しいです");
			break;
		case(2):
			System.out.println("3つの値は等しいです");
			break;
		case(3):
			System.out.println("3つの値は等しいです");
			break;
		}


		// ---------- ②解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ③ ①で作成したプログラムの変数値を「y = 83」「z = 83」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】3つの値は等しいです

		// ---------- ③解答 start ----------
		x = 83;
		y = 83;
		z = 83;
		count = 0;

		if(x == y) {
			count++;
		}
		if(x == z) {
			count++;
		}
		if(y == z) {
			count++;
		}

		switch(count) {
		case(0):
			System.out.println("3つの値は異なります");
			break;
		case(1):
			System.out.println("2つの値は等しいです");
			break;
		case(2):
			System.out.println("3つの値は等しいです");
			break;
		case(3):
			System.out.println("3つの値は等しいです");
			break;
		}

		// ---------- ③解答 end ----------



	}

}
