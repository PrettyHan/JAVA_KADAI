package mvc.java.kadai.se.cat01.sec05_class.no016;

/*
 * ◆別クラスのメソッド定義
 * JavaClassBasic16Sub.javaに
 * メソッド「printCircle」を定義します。
 *
 * メソッド「printCircle」は、
 * 引数で渡された整数を回数とし、
 * その回数「〇」を連続してコンソールに出力します。
 *
 * 以下の実行結果になるように、JavaClassBasic16Subクラスに
 * printCircleメソッドを定義しましょう。
 *
 * ===== コンソール 実行結果 =====
 * 〇〇〇
 * ------------------------------
 * 〇〇〇〇〇〇
 * ------------------------------
 * 〇〇〇〇〇〇〇〇〇〇〇〇
 * ------------------------------
 * ===============================
 *
 * ※JavaClassBasic16.javaの編集不可
 *
 */
public class JavaClassBasic16 {

	public static void main(String[] args) {
		JavaClassBasic16Sub ucs = new JavaClassBasic16Sub();

		ucs.printCircle(3);
		ucs.printCircle(6);
		ucs.printCircle(12);

	}

}
