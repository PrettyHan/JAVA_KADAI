package mvc.java.kadai.se.cat01.sec01_variable.no025;

/*
 * ◆データ型の変換
 *
 * int型の変数「number」を正しくデータ型を変換した上で、
 * String型の変数「str」に代入し、
 * コンソールに出力するプログラムです。
 *
 * 以下、コンパイルエラーが発生している箇所をデータ型の変換を行うように
 * プログラムを修正して、実行結果がコンソールに表示されるようにしましょう。
 * ※変数「str」のデータ型をString型から変更しないでください。
 *
 * ===== コンソール 実行結果 =====
 * 10
 * ===============================
 */
public class JavaVariableBasic25 {
	public static void main(String[] args) {

		int number = 10;

		// データ型の変換を行う
		String str = String.valueOf(number);

		// この行以降の処理は変更しないでください。
		System.out.println(str);

	}
}
