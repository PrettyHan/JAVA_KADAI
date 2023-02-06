package mvc.java.kadai.se.cat01.sec01_variable.no012;

/*
 * ◆変数の利用
 *
 * 変数「messageMain」に変数「messageSub」の値を代入し、
 * それぞれコンソールに出力するプログラムです。
 *
 * 以下、実行結果になるように①を補い、
 * プログラムを完成させましょう。
 * ※変数「messageMain」には直接文字列を代入しないようにしてください。
 * messageMain = "こんにちは";
 *
 * ===== コンソール 実行結果 =====
 * こんにちは
 * こんにちは
 * ===============================
 */
public class JavaVariableBasic12 {
	public static void main(String[] args) {

		String messageMain = "Hello World!";

		String messageSub = "こんにちは";


		messageMain = messageSub ;


		System.out.println(messageMain);
		System.out.println(messageSub);

	}
}