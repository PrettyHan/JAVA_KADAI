package mvc.java.kadai.se.cat01.sec04_method.no005;

/*
 * ◆メソッドの利用
 * メソッド「sumNumbers(int fst, int scd, int trd)」を
 * mainメソッドで使用し、
 * コンソールに以下の実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * UseJavaMethod05#sumNumbers(int fst, int scd, int trd)
 * 50
 * ======================
 *
 * ※sumNumbers(int fst, int scd, int trd)メソッドの編集不可
 *
 */
public class JavaMethodBasic05 {

	public static void main(String[] args) {
		int x = 10; // この変数を利用すること
		int y = 15; // この変数を利用すること
		int z = 25; // この変数を利用すること

		int sum2 = sumNumbers(x, y, z);
		System.out.println(sum2);
	}

	public static int sumNumbers(int fst, int scd, int trd) {
		System.out.println("UseJavaMethod05#sumNumbers(int fst, int scd, int trd)");
		int sum = fst + scd + trd;
		return sum;
	}

}
