package mvc.java.kadai.se.cat01.sec01_variable.no023;

/*
 * ◆データ型の変換
 *
 * String型の変数「doubleStr」を正しくデータ型を変換した上で、
 * double型の変数「number」に代入し、
 * コンソールに出力するプログラムです。
 *
 * 以下、コンパイルエラーが発生している箇所をデータ型の変換を行うように
 * プログラムを修正して、実行結果がコンソールに表示されるようにしましょう。
 *※ 変数「number」のデータ型はdouble型から変更しないでください。
 *
 * ===== コンソール 実行結果 =====
 * 10.5
 * ===============================
 */
public class JavaVariableBasic23 {
	public static void main(String[] args) {

		String doubleStr = "10.5";

		// データ型の変換を行う
		double number = Double.valueOf(doubleStr);

		// この行以降の処理は変更しないでください。
		System.out.println(number);

	}

}
