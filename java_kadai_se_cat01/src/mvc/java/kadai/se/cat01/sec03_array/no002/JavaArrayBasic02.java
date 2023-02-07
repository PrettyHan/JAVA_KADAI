package mvc.java.kadai.se.cat01.sec03_array.no002;

/*
 * ◆配列の利用
 *
 * 配列strArrayから取得した要素を、
 * コンソールに出力するプログラムです。
 *
 * 以下実行結果になるように①～②を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * △
 * 〇
 * ×
 * ===============================
 *
 */
public class JavaArrayBasic02 {
	public static void main(String[] args) {

		String[] strArray = {"〇","△","×"};

		// 配列にある要素 "△"を取得する
		System.out.println(strArray[1]);

		// 配列にある要素 "〇"を取得する
		System.out.println(strArray[0]);

		// 配列にある要素 "×"を取得する
		System.out.println(strArray[2]);
	}
}
