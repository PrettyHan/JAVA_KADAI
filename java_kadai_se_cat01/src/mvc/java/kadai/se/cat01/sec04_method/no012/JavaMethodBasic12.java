package mvc.java.kadai.se.cat01.sec04_method.no012;

/*
 * ◆メソッドの定義
 * メソッド「printCircle」を定義します。
 *
 * メソッド「printCircle」は、
 * 引数で渡された整数を回数とし、
 * その回数「〇」を連続してコンソールに出力します。
 *
 * 以下の実行結果になるように、
 * ①～③までを補い、printCircleメソッドを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * 〇〇〇
 * ------------------------------
 * 〇〇〇〇〇〇
 * ------------------------------
 * 〇〇〇〇〇〇〇〇〇〇〇〇
 * ------------------------------
 * =======================
 *
 * ※mainメソッドの編集不可
 * ※printCircleメソッドの既存部分の編集不可
 *
 */
public class JavaMethodBasic12 {

	public static void main(String[] args) {

		printCircle(3);
		printCircle(6);
		printCircle(12);

	}

	public static void printCircle(int count) {

		String tmp = "";

		for (int i = count ; i > 0; i--) {
			tmp += "〇";

		}
		System.out.println(tmp);
		System.out.println("------------------------------");

	}

}
