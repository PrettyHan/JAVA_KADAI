package mvc.java.kadai.se.cat01.sec05_class.no023;

/*
 * ◆別クラス(オブジェクト)の利用
 * 以下実行結果になるように
 * JavaClassBasic23Obj1クラス、JavaClassBasic23Obj2クラスを利用し、
 * mainメソッドにプログラムを書きましょう。
 *
 * ☆JavaClassBasic23Obj1クラスとJavaClassBasic23Obj2クラスの
 * プログラムを読み、内容を把握しましょう。
 * ☆mainメソッドにてインスタンス化できるのは
 * JavaClassBasic23Obj1クラス【1回】、JavaClassBasic23Obj2クラス【1回】です。
 * ===== コンソール 実行結果 =====
 * 貯金100000円からはじまります
 * ------------------------------
 * 貯金100000円から20000円を引き出しました
 * 貯金残高は80000円です
 * 財布に20000円追加しました
 * 今財布には20000円はいっています
 * ------------------------------
 * 貯金80000円から45000円を引き出しました
 * 貯金残高は35000円です
 * 財布に45000円追加しました
 * 今財布には65000円はいっています
 * ===============================
 *
 * ※JavaClassBasic23Obj1.java、JavaClassBasic23Obj2.javaの編集不可
 *
 */
public class JavaClassBasic23 {

	public static void main(String[] args) {

		JavaClassBasic23Obj1 sub = new JavaClassBasic23Obj1(100000);
		JavaClassBasic23Obj2 sub2 = new JavaClassBasic23Obj2();
		sub.withdrawMoney(20000);
		sub.showSavingMoney();
		sub2.addMoney(20000);
		sub2.showKeepMoney();

		System.out.println("------------------------------");
		JavaClassBasic23Obj1 sub3 = new JavaClassBasic23Obj1(80000);
		sub3.withdrawMoney(45000);
		sub3.showSavingMoney();
		sub2.addMoney(45000);
		sub2.showKeepMoney();

		System.out.println("------------------------------");

	}

}
