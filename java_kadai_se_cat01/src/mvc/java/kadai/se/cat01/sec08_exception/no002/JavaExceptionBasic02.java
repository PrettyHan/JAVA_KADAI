package mvc.java.kadai.se.cat01.sec08_exception.no002;

/*
 * ◆独自例外の使用
 *
 * OverTheLimitExceptionクラスという独自例外クラスをつくりました。
 * このクラスは文字列が上限10(LIMIT_MAX)を超えていた場合を
 * システムの仕様上でエラーとみなし、その時意図的に例外として発生させます。
 *
 * 以下の実行結果【スタックトレース】が表示されるように
 * JavaExceptionBasic02クラスmainメソッドの①～③を補いプログラムを完成させましょう。
 *
 * ☆既存の各クラスのプログラムや実行結果から解答を導きましょう
 * ☆以下「xx」の部分はプログラムの行数がはいります。
 * ===== コンソール 実行結果 =====
 *OverTheLimitExceptionをcatchしました。
 *【システム上エラー】文字数の上限は10です。上限を超える文字列は利用できません。
 *mvc.java.kadai.se.cat01.sec08_exception.no002.OverTheLimitException: 【システム上エラー】文字数の上限は10です。上限を超える文字列は利用できません。
	at mvc.java.kadai.se.cat01.sec08_exception.no002.JavaExceptionBasic02.main(JavaExceptionBasic02.java:XX)
 * ===============================
 *
 * ※OverTheLimitException.java、
 *   JavaExceptionBasic02.java既存プログラムの編集不可
 *
 */
public class JavaExceptionBasic02 {

	public static void main(String[] args) {
		String strA = "ok";
		String strB = "aaaaaaaaaaa";

		try {

			if (strA.length() > OverTheLimitException.LIMIT_MAX) {
				System.out.println(strA);
			}

			if (strB.length() > OverTheLimitException.LIMIT_MAX) {
				/* ①コメントを削除して記述 */
			}

		} catch (/* ②コメントを削除して記述 */) {
			/* ③コメントを削除して記述 */
		}

	}

}
