package mvc.java.kadai.se.cat01.sec02_controlsyntax.no015;

public class JavaControlSyntaxBasic15 {

	/* 制御文の組み合わせ (記述問題)
	 * for文の変数iが1から10までの間、下記の処理を繰り返します
	 * ・変数iが2の場合、変数totalに6を足す
	 * ・変数iが4の場合、変数totalに10を足す
	 * ・変数iが2でも4でもない場合、変数totalに変数iの値を足す
	 * ①～②にはどのような文をかけばよいでしょうか？
	 * =====コンソール出力結果=====
	 * 65
	 * =====================
	 */
	public static void main(String[] args) {
		int total = 0;

		for (int i = 1; i <= 10 ; i++) {
			if(i == 2) {
				total += 6;
			}
			else if(i == 4) {
				total += 10;
			}
			else {
				total += i;
			}
		}

		System.out.println(total);
	}

}
