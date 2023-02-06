package mvc.java.kadai.se.cat01.sec05_class.no027;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic27Subクラスは
 * int型配列「intArray」(int[] intArray = new int[30])フィールド、
 * intArrayフィールドから第1引数で渡された整数の
 * 【倍数だけを格納したint型配列】を戻り値として返す
 * getDivisorIntArrayメソッドがあります。
 *
 * 以下の実行結果になるように
 * JavaClassBasic27Subクラスの①～⑤までを補い
 * JavaClassBasic27Subクラスを完成させましょう。
 *
 * ☆intArrayフィールドにはコンストラクタで1～30までの
 * 整数を格納しています。例えば1～30までの整数の内「3」の倍数は
 * 3,6,9,12,15,18,21,24,27,30となります
 * ===== コンソール 実行結果 =====
 * 3/6/9/12/15/18/21/24/27/30/
 * ------------------------------
 * 5/10/15/20/25/30/
 * ===============================
 *
 * ※JavaClassBasic27.java、
 * JavaClassBasic27Sub.java既存プログラムの編集不可
 *
 */
public class JavaClassBasic27 {

	public static void main(String[] args) {

		JavaClassBasic27Sub ucs = new JavaClassBasic27Sub();

		int[] result = ucs.getDivisorIntArray(3); // 3の倍数
		for(int i : result) {
			System.out.print(i + "/");
		}

		System.out.println();
		System.out.println("------------------------------");

		result = ucs.getDivisorIntArray(5); // 5の倍数
		for(int i : result) {
			System.out.print(i + "/");
		}

	}

}
