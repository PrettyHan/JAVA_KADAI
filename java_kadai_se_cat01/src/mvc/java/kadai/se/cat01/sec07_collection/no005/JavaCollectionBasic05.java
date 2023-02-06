package mvc.java.kadai.se.cat01.sec07_collection.no005;

import java.util.HashMap;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * showStrHashMapメソッドは第１引数で
 * キー(key)がInteger型、値(value)がString型HashMapを受け取り
 * その配列に格納されたデータを1行ずつ表示します。
 *
 * 以下実行結果になるように①～④を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * おはよう
 * こんにちは
 * こんばんは
 * ===============================
 *
 * ※mainメソッド内既存プログラムとshowStrHashMapメソッドの編集不可
 *
 */
public class JavaCollectionBasic05 {

	public static void main(String[] args) {

		HashMap<Integer, String> greetings = /* ①コメントを削除して記述 */;
		/*
		 * ②コメントを削除して記述
		 */
		showStrHashMap(greetings);

	}

	public static void showStrHashMap(HashMap<Integer, String> greetings) {
		for (/* ③コメントを削除して記述 */) {
			System.out.println(/* ④コメントを削除して記述 */);
		}
	}

}
