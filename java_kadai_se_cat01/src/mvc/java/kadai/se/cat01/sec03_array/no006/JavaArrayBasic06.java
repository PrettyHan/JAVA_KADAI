package mvc.java.kadai.se.cat01.sec03_array.no006;

/*
 * ◆配列の定義・利用
 *
 * 以下実行結果になるように①、②を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * おえういあ
 * ===============================
 *
 * ※mainメソッド内既存プログラム編集不可
 *
 */
public class JavaArrayBasic06 {
	public static void main(String[] args) {

		String[] strArray = new String[5];
		strArray[0] = "あ";
		strArray[1] = "い";
		strArray[2] = "う";
		strArray[3] = "え";
		strArray[4] = "お"; // 表示するときは末尾から順番になりますね

		for (int i = strArray.length - 1; i>=0 ; i--) {
			System.out.print(strArray[i]);
		}

	}
}
