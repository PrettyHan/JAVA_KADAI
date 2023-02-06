package mvc.java.kadai.se.cat01.sec04_method.no009;

/*
 * ◆メソッドの利用
 * birthdayメソッドは、
 * 第1引数で渡された整数に1を加算した整数を戻り値として返します。
 * tellOlderメソッドは、第1引数で渡された整数を表示します。
 *
 * birthdayメソッドとtellOlderメソッドをmainメソッドで使用し、
 * コンソールに以下の実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * 11
 * ------------------------------
 * 12
 * ------------------------------
 * 13
 * ------------------------------
 * =======================
 *
 * ※birthdayメソッドとtellOlderメソッドの編集不可
 *
 */
public class JavaMethodBasic09 {

	public static void main(String[] args) {

		int nowAge = 10; // この変数を利用すること




	}

	public static int birthday(int age) {
		int nowAge = age;
		nowAge = nowAge + 1;
		return nowAge;
	}

	public static void tellOlder(int age) {
		System.out.println(age);
		System.out.println("------------------------------");
	}

}
