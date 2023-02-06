package mvc.java.kadai.se.cat01.sec02_controlsyntax.no006;

import java.util.HashMap;

/*
 * ◆制御構文「条件分岐」の使用
 *
 * 〇対応表
 * 春：3月、4月、5月
 * 夏：6月、7月、8月
 * 秋：9月、10月、11月
 * 冬：12月、1月、2月
 */
public class JavaControlSyntaxBasic06 {

	public static void main(String[] args) {

		// ■ ①～③の要求をみたすプログラムを作成しましょう。

		// ①8月(x = 8)は対応表の春夏秋冬の中でどの季節に該当するか判断するプログラムを作成しましょう。
		//    ⇒【実行結果】夏です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 8;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "春");
		map.put(4, "春");
		map.put(5, "春");
		map.put(6, "夏");
		map.put(7, "夏");
		map.put(8, "夏");
		map.put(9, "秋");
		map.put(10, "秋");
		map.put(11, "秋");
		map.put(12, "冬");
		map.put(1, "冬");
		map.put(2, "冬");
		String answer = map.get(x);
		System.out.printf("%sです",answer);

		// ---------- ①解答 end ----------
		System.out.println();
		System.out.println("===================================");

		// ② ①のプログラムの8月(x=8)を12月(x=12)に変更したプログラムを作成しましょう。
		//    また、変更後の実行結果が「冬」と判断されるか確認しましょう。
		//    ⇒【実行結果】冬です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 12;

		answer = map.get(x);
		System.out.printf("%sです",answer);



		// ---------- ②解答 end ----------
		System.out.println();
		System.out.println("===================================");

		// ③ ①のプログラムと全く同じ動作をするプログラムを
		//    制御構文「switch」を使用して作成しましょう。
		//    ⇒【実行結果】夏です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ③解答 start ----------

		x = 8;
		switch(map.get(x)){
		case("夏"):
			answer = map.get(x);
			System.out.printf("%sです",answer);
			break;
		}






		// ---------- ③解答 end ----------

	}

}
