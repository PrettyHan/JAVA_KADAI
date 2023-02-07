package mvc.java.kadai.se.cat01.sec03_array.no007;

/*
 * ◆配列の定義・利用
 *
 * showStrArrayメソッドは第１引数でString型の配列を受け取り
 * その配列に格納されたデータを1行ずつ表示します。
 *
 * 以下実行結果になるように①、②を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * おはよう
 * こんにちは
 * こんばんは
 * ===============================
 *
 * ※mainメソッド内既存プログラムとshowStrArrayメソッドの編集不可
 *
 */
public class JavaArrayBasic07 {

	public static void main(String[] args) {

		String[] greetings = new String[3];
		greetings[0] ="おはよう";
		greetings[1] ="こんにちは";
		greetings[2] ="こんばんは";
		showStrArray(greetings);

	}

	public static void showStrArray(String[] strArray) {
		for(String str : strArray) {
			System.out.println(str);
		}
	}

}
