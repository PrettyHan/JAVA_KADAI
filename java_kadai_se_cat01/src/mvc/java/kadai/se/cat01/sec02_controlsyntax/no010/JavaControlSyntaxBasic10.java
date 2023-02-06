package mvc.java.kadai.se.cat01.sec02_controlsyntax.no010;

public class JavaControlSyntaxBasic10 {

    /* 制御文の組み合わせ (穴埋め問題)
     * for文の変数 i が0から9までの間、下記の処理を繰り返します
     * ・変数 i が3未満の場合 変数totalに10を足す
     * ・変数 i が3以上の場合 変数totalに5を足す
     * ①～②にはどのような文をかけばよいでしょうか？
     * =====コンソール出力結果=====
     * 65
     * =====================
     */
    public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i <= 9; i++) {
			if (i < 3) {
				total = total + 10;
			} else {
				total = total + 5;
			}
		}
		System.out.println(total);
	}

}
