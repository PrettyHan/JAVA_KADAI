package mvc.java.kadai.se.cat01.sec05_class.no006;

/*
 * ◆別クラスのメソッド定義
 * JavaClassBasic06Sub.javaの showMessageメソッドを使用すると、
 *「おはようございます！」という文字列が
 * コンソール上に表示されるものとします。
 * *
 * 以下の実行結果になるように、JavaClassBasic06Subクラスに
 * showMessageメソッドを定義しましょう。
 *
 * ===== コンソール 実行結果 =====
 * おはようございます！
 * ===============================
 *
 * ※JavaClassBasic06.javaの編集不可
 *
 */
public class JavaClassBasic06 {

	public static void main(String[] args) {
		String str = "おはようございます！";
		JavaClassBasic06Sub ucs = new JavaClassBasic06Sub(str);
		ucs.showMessage();

	}

}
