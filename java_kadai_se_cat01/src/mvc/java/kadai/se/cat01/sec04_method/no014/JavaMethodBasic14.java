package mvc.java.kadai.se.cat01.sec04_method.no014;

/*
 * ◆メソッドの定義
 * printCountメソッドは第1引数で渡された整数の回数だけ、
 * 1からのカウントアップを表示します。
 *
 * 以下の実行結果になるように、
 * printCountメソッドをプログラミングしましょう。
 *
 * ===== コンソール 実行結果 =====
 * 1　2　3　
 * ------------------------------
 * 1　2　3　4　5　6　
 * ------------------------------
 * 1　2　3　4　5　6　7　8　9　10　11　12　
 * ------------------------------
 * ===============================
 *
 * ※mainメソッドの編集不可
 *
 */
public class JavaMethodBasic14 {

	public static void main(String[] args) {

		printCount(3);
		printCount(6);
		printCount(12);

	}

	// ↓↓↓printCountメソッド定義 ここから↓↓↓
	public static void printCount(int num) {
		for(int i = 1; i <= num; i++) {
			System.out.printf("%d　", i);
		}
		System.out.println();
		System.out.println("------------------------------");
	}



	// ↑↑↑printCountメソッド定義 ここまで↑↑↑

}
