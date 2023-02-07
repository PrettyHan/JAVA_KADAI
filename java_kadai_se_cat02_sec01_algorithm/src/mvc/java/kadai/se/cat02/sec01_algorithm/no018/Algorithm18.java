package mvc.java.kadai.se.cat02.sec01_algorithm.no018;

/**
 * Javaアルゴリズム問題18
 */
public class Algorithm18 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 11段の1234567890の数字を繰り返すピラミッドを作成してください。
		//    変数xに「11」を代入し、xを用いてプログラムを作成しましょう。
		//    ⇒【実行結果】
		//              1
		//             222
		//            33333
		//           4444444
		//          555555555
		//         66666666666
		//        7777777777777
		//       888888888888888
		//      99999999999999999
		//     0000000000000000000
		//    111111111111111111111

		// ---------- ①解答 start ----------
		int x = 11;
		int count = 1;
		for (int i = 0; i < x; i++) {
			if(count >= 10) {
				count = 0;
			}
			for (int j = 1; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
					System.out.print(count);

			}
			System.out.println();
			count++;
		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=20」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//                       1
		//                      222
		//                     33333
		//                    4444444
		//                   555555555
		//                  66666666666
		//                 7777777777777
		//                888888888888888
		//               99999999999999999
		//              0000000000000000000
		//             111111111111111111111
		//            22222222222222222222222
		//           3333333333333333333333333
		//          444444444444444444444444444
		//         55555555555555555555555555555
		//        6666666666666666666666666666666
		//       777777777777777777777777777777777
		//      88888888888888888888888888888888888
		//     9999999999999999999999999999999999999
		//    000000000000000000000000000000000000000

		// ---------- ②解答 start ----------
		x = 20;
		count = 1;
		for (int i = 0; i < x; i++) {
			if(count >= 10) {
				count = 0;
			}
			for (int j = 1; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
					System.out.print(count);

			}
			System.out.println();
			count++;
		}


		// ---------- ②解答 end ----------



	}

}
