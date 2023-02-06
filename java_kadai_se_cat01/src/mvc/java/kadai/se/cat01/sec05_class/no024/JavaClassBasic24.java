package mvc.java.kadai.se.cat01.sec05_class.no024;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic24Subクラスは
 * int型配列「intArray」(int[] intArray = new int[10])と
 * int型の「count」フィールド、
 * intArrayフィールドに第1引数で渡されたint型データを
 * 格納できるaddIntメソッド、
 * intArrayフィールドに格納されたint型データを
 * 合計するgetAllSumメソッドがあります。
 *
 * 以下の実行結果になるように
 * JavaClassBasic24Subクラスの①～③までを補い
 * JavaClassBasic24Subクラスを完成させましょう。
 *
 * ☆JavaClassBasic24Subクラスの
 * 「intArray」「count」フィールドを有効に活用しましょう
 * ===== コンソール 実行結果 =====
 * [1]を格納しました
 * [2]を格納しました
 * [3]を格納しました
 * [4]を格納しました
 * [5]を格納しました
 * 合計:15
 * [6]を格納しました
 * [7]を格納しました
 * [8]を格納しました
 * [9]を格納しました
 * [10]を格納しました
 * これ以上格納できません
 * これ以上格納できません
 * 合計:55
 * ===============================
 *
 * ※JavaClassBasic24.java、
 * JavaClassBasic24Sub.java既存プログラムの編集不可
 *
 */
public class JavaClassBasic24 {

	public static void main(String[] args) {

		JavaClassBasic24Sub ucs = new JavaClassBasic24Sub();

		ucs.addInt(1);
		ucs.addInt(2);
		ucs.addInt(3);
		ucs.addInt(4);
		ucs.addInt(5);

		int sum = ucs.getAllSum();
		System.out.println("合計:" + sum);

		ucs.addInt(6);
		ucs.addInt(7);
		ucs.addInt(8);
		ucs.addInt(9);
		ucs.addInt(10);
		ucs.addInt(11);
		ucs.addInt(12);

		sum = ucs.getAllSum();
		System.out.println("合計:" + sum);

	}

}
