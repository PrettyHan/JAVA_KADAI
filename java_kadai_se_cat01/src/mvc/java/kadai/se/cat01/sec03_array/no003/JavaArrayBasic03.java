package mvc.java.kadai.se.cat01.sec03_array.no003;

/*
 * ◆配列の定義・利用
 *
 * 配列を使用し
 * 以下実行結果になる想定でプログラムを書きましたが
 * エラーが発生してしまいました。
 *
 * 以下実行結果が問題なく表示されるように
 * プログラムを修正しましょう。
 * ===== コンソール 【想定】実行結果 =====
 * 100
 * 200
 * 300
 * ===============================
 *
 */
public class JavaArrayBasic03 {
	public static void main(String[] args) {

		int[] intArray = new int[3];
		intArray[1] = 100;
		intArray[2] = 200;
		intArray[3] = 300;

		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
}
