package mvc.java.kadai.se.cat01.sec07_collection.no006;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * showAverageメソッドをmainメソッドで使用し
 * コンソールに以下実行結果を表示させましょう。
 * ===== コンソール 実行結果 =====
 * ◆点数一覧
 * 1人目、Aさん:53点
 * 2人目、Bさん:49点
 * 3人目、Cさん:21点
 * 4人目、Dさん:91点
 * 5人目、Eさん:77点
 * ⇒平均点：58点
 * ===============================
 *
 * ※showAverageメソッドの編集不可
 *
 */
public class JavaCollectionBasic06 {

	public static void main(String[] args) {

	    /* ①コメントを削除して記述 */


	}

	public static void showAverage(LinkedHashMap<String, Integer> pointMap) {

		int total = 0;

		System.out.println("◆点数一覧");

		Set<String> keys = pointMap.keySet();
		int count = 1;

		for (String name : keys) {
			System.out.println(count + "人目、" + name + ":" + pointMap.get(name) + "点");
			total = total + pointMap.get(name);
			count++;
		}

		System.out.println("⇒平均点：" + (total / pointMap.size()) + "点");

	}

}
