package mvc.java.kadai.se.cat01.sec05_class.no020;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic20Objクラスは次のフィールドとメソッドを保有しています。
 * [フィールド]
 * ・savingMoney     (貯金/int型)
 *
 * [メソッド]
 * ・withdrawMoney   (貯金フィールドから第1引数で指定された金額を減算する)
 * ※第1引数で指定された金額が貯金フィールドよりも大きい場合は減算しない
 *
 * ・showSavingMoney (貯金フィールドを表示する)
 *
 * 以下の実行結果になるようにJavaClassBasic20Objクラスの①～⑤までを補い、
 * JavaClassBasic20Objクラスを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * 貯金が1000000円あります
 * ------------------------------
 * お引き出し金額：200000
 * 残高：800000
 * ------------------------------
 * お引き出し金額：400000
 * 残高：400000
 * ------------------------------
 * お引き出し金額：300000
 * 残高：100000
 * ------------------------------
 * お引き出し金額：100001
 * お金を引き出せません
 * 残高：100000
 * ------------------------------
 * お引き出し金額：100000
 * 残高：0
 * ------------------------------
 * ===============================
 *
 * ※JavaClassBasic20.javaの編集不可
 *
 */
public class JavaClassBasic20 {

	public static void main(String[] args) {
		JavaClassBasic20Obj obj = new JavaClassBasic20Obj(1000000);
		System.out.println("------------------------------");

		obj.withdrawMoney(200000);
		obj.showSavingMoney();
		System.out.println("------------------------------");

		obj.withdrawMoney(400000);
		obj.showSavingMoney();
		System.out.println("------------------------------");

		obj.withdrawMoney(300000);
		obj.showSavingMoney();
		System.out.println("------------------------------");

		obj.withdrawMoney(100001);
		obj.showSavingMoney();
		System.out.println("------------------------------");

		obj.withdrawMoney(100000);
		obj.showSavingMoney();
		System.out.println("------------------------------");

	}

}
