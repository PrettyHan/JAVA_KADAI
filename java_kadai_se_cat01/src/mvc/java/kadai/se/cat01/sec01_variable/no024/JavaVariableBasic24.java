package mvc.java.kadai.se.cat01.sec01_variable.no024;

/*
 * ◆変数の利用(演算結果の代入)
 *
 * 以下のプログラムの実行結果として、
 * コンソールに出力されるように①～③を補い、
 * プログラムを完成させましょう。
 * ※ ①～③のコメント部分以外は変更しないでください。
 *
 * ===== コンソール 実行結果 =====
 * 2
 * 2.0
 * 2.5
 * ===============================
 */
public class JavaVariableBasic24 {
	public static void main(String[] args) {

		/* ①コメントを削除して記述 */ int numA = (int) 5 / 2;
		System.out.println(numA);

		/* ②コメントを削除して記述 */ float numB = (int) 5 / 2;
		System.out.println(numB);

		/* ③コメントを削除して記述 */ double numC = (float) 5.0 / 2.0;
		System.out.println(numC);

	}

}
