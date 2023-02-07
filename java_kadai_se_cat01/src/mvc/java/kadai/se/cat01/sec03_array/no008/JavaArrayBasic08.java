package mvc.java.kadai.se.cat01.sec03_array.no008;

/*
 * ◆配列の定義・利用
 *
 * showAverageメソッドは第1引数でint型の配列を受け取り
 * その配列に格納された「点数」を1行ずつ表示し、
 * 平均点を算出・表示します
 *
 * showAverageメソッドをmainメソッドで使用し
 * コンソールに以下実行結果を表示させましょう。
 * ===== コンソール 実行結果 =====
 * ◆点数一覧
 * 1人目:53点
 * 2人目:49点
 * 3人目:21点
 * 4人目:91点
 * 5人目:77点
 * ⇒平均点：58点
 * ===============================
 *
 * ※showAverageメソッドの編集不可
 *
 */
public class JavaArrayBasic08 {

	public static void main(String[] args) {

        int[] scores = {53, 49, 21, 91, 77};

        showAverage(scores);

	}

	public static void showAverage(int[] intArray) {

		int total = 0;

		System.out.println("◆点数一覧");

		for(int i = 0; i < intArray.length; i++) {
			System.out.println( ( i + 1 ) + "人目:" + intArray[i] + "点");
			total = total +intArray[i];
		}

		System.out.println("⇒平均点：" + (total / intArray.length) + "点");

	}

}
