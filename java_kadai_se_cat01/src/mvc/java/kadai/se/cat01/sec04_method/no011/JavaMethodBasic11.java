package mvc.java.kadai.se.cat01.sec04_method.no011;

/*
 * ◆メソッドの定義
 * メソッド「cmpLarger」を定義します。
 *
 * メソッド「cmpLarger」は、
 * 第1引数、第2引数で渡された２つの整数を比較し、
 * 【大きい方】を戻り値として返します。
 * もし2つの整数が同値の場合、引数で渡された2つの整数
 * どちらかを戻り値としてください。
 *
 * 以下の実行結果になるように、
 * ①～③までを補い、cmpLargerメソッドを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * 9
 * 59774
 * 10000
 * ======================
 *
 * ※mainメソッドの編集不可
 * ※cmpLargerメソッドの既存部分の編集不可
 *
 */
public class JavaMethodBasic11 {

	public static void main(String[] args) {

		int resultNum = cmpLarger(8, 9);
		System.out.println(resultNum);

		resultNum = cmpLarger(59774, 56452);
		System.out.println(resultNum);

		resultNum = cmpLarger(10000, 10000); // 同値
		System.out.println(resultNum);

	}

	public static int cmpLarger(/* ①コメントを削除して記述 */) {

		if(/* ②コメントを削除して記述 */) {

			return fst; // 第1引数の方が大きい

		} else if(/* ③コメントを削除して記述 */) {

			return scd; // 第2引数の方が大きい

		} else {

			return fst; // 同値の場合

		}

	}

}
