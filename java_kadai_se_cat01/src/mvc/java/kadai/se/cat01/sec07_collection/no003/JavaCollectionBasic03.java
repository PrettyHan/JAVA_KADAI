package mvc.java.kadai.se.cat01.sec07_collection.no003;

import java.util.ArrayList;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * 以下実行結果になるように①～③を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * 1/2/3/4/5/6/7/8/9/10
 * 11/12/13/14/15/16/17/18/19/20
 * 21/22/23/24/25/26/27/28/29/30
 * ===============================
 *
 * ※mainメソッド内既存プログラム編集不可
 *
 */
public class JavaCollectionBasic03 {
	public static void main(String[] args) {

		ArrayList<Integer> intArrayList = new ArrayList<>();

		for (/* ①コメントを削除して記述 */) {
			/* ②コメントを削除して記述 */
		}

		for (int i : intArrayList) {
			System.out.print(i);
			if (/* ③コメントを削除して記述 */) {
				System.out.println();
			} else {
				System.out.print("/");
			}
		}

	}
}
