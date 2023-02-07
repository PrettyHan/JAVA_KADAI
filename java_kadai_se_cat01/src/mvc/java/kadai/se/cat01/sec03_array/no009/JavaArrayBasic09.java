package mvc.java.kadai.se.cat01.sec03_array.no009;

/*
 * ◆配列の定義・利用
 *
 * showDivisorメソッドは第1引数でint型の配列を受け取り
 * 格納された整数の中で「3の倍数」のみを表示します。
 *
 * 以下実行結果になるように、
 * showDivisorメソッドをプログラミングしましょう。
 *
 * ===== コンソール 実行結果 =====
 * 3/6/9/12/15/18/21/24/27/30/
 * ===============================
 *
 * ※mainメソッドの編集不可
 *
 */
public class JavaArrayBasic09 {

	public static void main(String[] args) {

		int[] intArray = new int[30];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1; // intArray配列に1~30までの整数を格納
		}

		showDivisor(intArray);

	}

	// ↓↓↓showDivisorメソッド定義 ここから↓↓↓
	public static void showDivisor(int[] test_array) {
		for(int i : test_array) {
			if(i % 3 == 0)
				System.out.printf("%d/", i);
		}
	}



	// ↑↑↑showDivisorメソッド定義 ここまで↑↑↑

}
