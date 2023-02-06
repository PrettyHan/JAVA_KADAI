package mvc.java.kadai.se.cat01.sec02_controlsyntax.no007;

/*
 * ◆制御構文「条件分岐」の使用
 *
 * 〇対応表
 * 不可：0～60点未満
 * 　可：60～69点
 * 　良：70～79点
 * 　優：80～100点
 */
public class JavaControlSyntaxBasic07 {

	public static void main(String[] args) {

		// ■ ①～④の要求をみたすプログラムを作成しましょう。

		// ①59点(x = 59)は対応表の成績「不可」「可」「良」「優」の
		// 　どこに該当するか判断するプログラムを作成しましょう。
		//    ⇒【実行結果】評価は不可です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------
		int x = 59;
		String result;

		if(x < 60) {
			result = "不可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 70) {
			result = "可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 80) {
			result = "良";
			System.out.printf("評価は%sです%n",result);
		}
		else {
			result = "優";
			System.out.printf("評価は%sです%n",result);
		}



		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①で作成したプログラムの「x=59」を「x=60」に変更した場合、
		//    実行結果が「可」と判断されるか確認しましょう。
		//    ⇒【実行結果】評価は可です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 60;
		if(x < 60) {
			result = "不可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 70) {
			result = "可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 80) {
			result = "良";
			System.out.printf("評価は%sです%n",result);
		}
		else {
			result = "優";
			System.out.printf("評価は%sです%n",result);
		}




		// ---------- ②解答 end ----------

		System.out.println("===================================");

		// ③ ①で作成したプログラムの「x=59」を「x=70」に変更した場合、
		//    実行結果が「良」と判断されるか確認しましょう。
		//    ⇒【実行結果】評価は良です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ③解答 start ----------

		x = 70;
		if(x < 60) {
			result = "不可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 70) {
			result = "可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 80) {
			result = "良";
			System.out.printf("評価は%sです%n",result);
		}
		else {
			result = "優";
			System.out.printf("評価は%sです%n",result);
		}




		// ---------- ③解答 end ----------

		System.out.println("===================================");

		// ④ ①で作成したプログラムの「x=59」を「x=80」に変更した場合、
		//    実行結果が「優」と判断されるか確認しましょう。
		//    ⇒【実行結果】評価は優です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ④解答 start ----------

		x = 80;
		if(x < 60) {
			result = "不可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 70) {
			result = "可";
			System.out.printf("評価は%sです%n",result);
		}
		else if(x < 80) {
			result = "良";
			System.out.printf("評価は%sです%n",result);
		}
		else {
			result = "優";
			System.out.printf("評価は%sです%n",result);
		}




		// ---------- ④解答 end ----------

	}

}
