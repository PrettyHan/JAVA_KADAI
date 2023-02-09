package mvc.java.kadai.se.cat01.sec05_class.no007;

/*
 * ◆別クラスのメソッド定義
 * JavaClassBasic07Sub.javaの makeMessageメソッドを使用すると、
 *「おはようございます！」という文字列を
 * 戻り値として返すものとします。
 *
 * 以下の実行結果になるように、JavaClassBasic07Subクラスに
 * makeMessageメソッドを定義しましょう。
 *
 * ===== コンソール 実行結果 =====
 * おはようございます！
 * ===============================
 *
 * ※JavaClassBasic07.javaの編集不可
 *
 */
public class JavaClassBasic07 {

	public static void main(String[] args) {
		JavaClassBasic07Sub ucs = new JavaClassBasic07Sub("おはようございます！");
		String str = ucs.makeMessage();
		System.out.println(str);

	}

}
