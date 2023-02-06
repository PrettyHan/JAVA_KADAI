package mvc.java.kadai.se.cat01.sec01_variable.no015;

/*
 * ◆変数の利用(真偽の保持)
 *
 * 数値の比較結果を変数flagに代入し、
 * コンソールに出力するプログラムです
 *
 * 以下実行結果になるように①～⑪を補い、
 * プログラムを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * true
 * true
 * false
 * ===============================
 */
public class JavaVariableBasic15 {
	public static void main(String[] args) {


		// 「10 大なり 5 かつ 5 大なり 0」の結果を代入する
		boolean flag = 10 > 5 && 5> 0;
		System.out.println(flag);

		// 「10 小なり 5 または 5 大なり 0」の結果を代入する
		flag = 10 < 5 || 5 > 0;
		System.out.println(flag);

		// 「10 小なり 5 または 5 大なり 0 かつ 5 小なり 0」の結果を代入する
		flag = 10 < 5 && 5 > 0 ||  5 < 0;
		System.out.println(flag);


	}

}
