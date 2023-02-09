package mvc.java.kadai.se.cat01.sec05_class.no003;

/*
 * ◆別クラスのメソッドの利用
 * JavaClassBasic03Sub.javaの
 * メソッド「showMessage(String msg, int num)」をmainメソッドで使用し、
 * コンソールに以下実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * JavaClassBasic03Sub#showMessage(String msg, int num)
 * こんにちは！
 * 300
 * ===============================
 *
 * ※JavaClassBasic03Subの編集不可
 *
 */
public class JavaClassBasic03 {

	public static void main(String[] args) {
		JavaClassBasic03Sub sub = new JavaClassBasic03Sub();
		sub.showMessage("こんにちは！", 30);

	}

}
