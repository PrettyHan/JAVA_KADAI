package mvc.java.kadai.se.cat01.sec07_collection.no002;

import java.util.HashMap;
import java.util.Map;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * 以下実行結果になるように①、②を補い、
 * プログラムを完成させましょう。
 *
 * ※HashMapはデータの登録順を保証しない為、コンソールに
 * 「Circle:〇」「Triangle:△」「Square:□」行が出力されていれば
 * 表示順はコンソール実行結果通りでなくて構いません。
 * ===== コンソール 実行結果 =====
 * Circle:〇
 * Triangle:△
 * Square:□
 * ------------------------------
 * Circle:〇
 * Triangle:△
 * Square:□
 * ===============================
 *
 * ※mainメソッド内既存プログラム編集不可
 *
 */
public class JavaCollectionBasic02 {
	public static void main(String[] args) {

		HashMap<String, String> strHashMap = /* ①コメントを削除して記述 */;
		/*
		 * ②コメントを削除して記述
		 */

		// Map処理パターン①
		for (Map.Entry<String, String> entry : strHashMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("------------------------------");

		// Map処理パターン②
		for (String key : strHashMap.keySet()) {
			System.out.println(key + ":" + strHashMap.get(key));
		}

	}
}
