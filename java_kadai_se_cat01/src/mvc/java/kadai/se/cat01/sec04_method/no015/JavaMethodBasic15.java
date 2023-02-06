package mvc.java.kadai.se.cat01.sec04_method.no015;

/*
 * ◆メソッドの定義
 * withdrawMoneyメソッドは
 * 第1引数で貯金(整数)、第2引数で引き出し金額(整数)を受け取り、
 * 貯金から引き出し金額を引いた残高を表示、戻り値として返します。
 * 貯金が引き出し金額よりも少ない場合は、
 * お金が引き出せない旨のメッセージを表示し現在の貯金を
 * そのまま戻り値として返します。
 *
 * 以下実行結果になるように①～③までを補い、
 * withdrawMoneyメソッドを完成させましょう。
 * ★showSavingMoneyメソッドを有効に利用することを考慮してください。
 *
 * ===== コンソール 実行結果 =====
 * 残高：800000
 * ------------------------------
 * 残高：400000
 * ------------------------------
 * 残高：100000
 * ------------------------------
 * お金を引き出せません
 * 残高：100000
 * ------------------------------
 * 残高：0
 * ------------------------------
 * ===============================
 *
 * ※mainメソッド、showSavingMoneyメソッドの編集不可
 *
 */
public class JavaMethodBasic15 {

	public static void main(String[] args) {

		int savingMoney = 1000000; // 貯金

		savingMoney = withdrawMoney(savingMoney, 200000);
		savingMoney = withdrawMoney(savingMoney, 400000);
		savingMoney = withdrawMoney(savingMoney, 300000);
		savingMoney = withdrawMoney(savingMoney, 100001);
		savingMoney = withdrawMoney(savingMoney, 100000);

	}

	public static int withdrawMoney(int sMoney, int useMoney) {

		int savingMoney = sMoney;

		if (/* ①コメントを削除して記述 */) {
			System.out.println("お金を引き出せません");
			/* ②コメントを削除して記述 */
			return savingMoney;
		}

		savingMoney = savingMoney - useMoney;
		/* ③コメントを削除して記述 */
		return savingMoney;

	}

	public static void showSavingMoney(int sMoney) {
		System.out.println("残高：" + sMoney);
		System.out.println("------------------------------");
	}

}
