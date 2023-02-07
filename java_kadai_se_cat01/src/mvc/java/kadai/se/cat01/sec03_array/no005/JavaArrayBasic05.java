package mvc.java.kadai.se.cat01.sec03_array.no005;

/*
 * ◆配列の定義・利用
 *
 * 以下実行結果になるように①～③を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * 1/2/3/4/5/6/7/8/9/10
 * 11/12/13/14/15/16/17/18/19/20
 * 21/22/23/24/25/26/27/28/29/30
 * ===============================
 *
 * ※mainメソッド内既存プログラム編集不可
 *
 */
public class JavaArrayBasic05 {
	public static void main(String[] args) {

		int[] intArray = new int[30];

		for (int i = 0 ; i < intArray.length ; i++) {
			intArray[i] = i+1;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			if (intArray[i] % 10 == 0) {
				System.out.println();
			} else {
				System.out.print("/");
			}
		}

	}
}
