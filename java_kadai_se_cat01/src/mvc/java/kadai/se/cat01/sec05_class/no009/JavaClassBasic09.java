package mvc.java.kadai.se.cat01.sec05_class.no009;

/*
 * ◆別クラスのメソッド定義
 * JavaClassBasic09Sub.javaにメソッド「cmpLarger」を定義します。
 *
 * メソッド「cmpLarger」は、
 * 第1引数、第2引数で渡された２つの整数を比較し、
 * 【大きい方】を戻り値として返します。
 * もし2つの整数が同値の場合、引数で渡された2つの整数
 * どちらかを戻り値としてください。
 *
 * 以下の実行結果になるように、JavaClassBasic09Subクラスに
 * cmpLargerメソッドを定義しましょう。
 *
 * ===== コンソール 実行結果 =====
 * 9
 * 59774
 * 10000
 * ===============================
 *
 * ※JavaClassBasic09.javaの編集不可
 *
 */
public class JavaClassBasic09 {

	public static void main(String[] args) {
		JavaClassBasic09Sub ucs = new JavaClassBasic09Sub();

		int resultNum = ucs.cmpLarger(8, 9);
		System.out.println(resultNum);

		resultNum = ucs.cmpLarger(59774, 56452);
		System.out.println(resultNum);

		resultNum = ucs.cmpLarger(10000, 10000); // 同値
		System.out.println(resultNum);

	}

}
