package mvc.java.kadai.se.cat01.sec03_array.no001;

/*
 * ◆配列の定義
 *
 * int型の配列(要素数 3)を定義し、
 * 配列に12,34,56を格納するプログラムです。
 *
 * 以下実行結果になるように①～③を補い、
 * プログラムを完成させましょう。
 * ※②で配列の作成と要素の格納まとめて行っても良いです。
 *
 * ===== コンソール 実行結果 =====
 * 12
 * 34
 * 56
 * ===============================
 *
 */
public class JavaArrayBasic01 {
	public static void main(String[] args) {

		// 配列の定義
		int[] array = {12, 34, 56};

		// 配列に要素を格納する
		/* ③コメントを削除して記述 */


		// 配列にある要素 "12"を取得する
		int num = array[0];
		System.out.println(num);

		// 配列にある要素 "34"を取得する
		num = array[1];
		System.out.println(num);

		// 配列にある要素 "56"を取得する
		num = array[2];
		System.out.println(num);
	}
}
