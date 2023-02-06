package mvc.java.kadai.se.cat01.sec07_collection.no007;

import java.util.ArrayList;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * showDivisorメソッドは第1引数でInteger型ArrayListを受け取り
 * 格納された整数の中で「3の倍数」のみを表示します。
 *
 * 以下実行結果になるように、
 * showDivisorメソッドをプログラミングしましょう。
 *
 * ===== コンソール 実行結果 =====
 * 3/6/9/12/15/18/21/24/27/30/
 * ===============================
 *
 * ※mainメソッドの編集不可
 *
 */
public class JavaCollectionBasic07 {

	public static void main(String[] args) {

		ArrayList<Integer> intArrayList = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			intArrayList.add(i + 1); // intArrayListコレクションに1~30までの整数を格納
		}

		showDivisor(intArrayList);

	}

	// ↓↓↓showDivisorメソッド定義 ここから↓↓↓




	// ↑↑↑showDivisorメソッド定義 ここまで↑↑↑

}
