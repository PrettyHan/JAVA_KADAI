package mvc.java.kadai.se.cat01.sec04_method.no010;

/*
 * ◆メソッドの定義
 *
 * runningメソッドは、第1引数で体重(整数)を受け取り
 * 「ランニングをしました」とメッセージを表示し、
 * 体重から-5kgした結果を戻り値として返します。
 *
 * walkingメソッドは、第1引数で体重(整数)を受け取り
 * 「ウォーキングをしました」とメッセージを表示し、
 * 体重から-3kgした結果を戻り値として返します。
 *
 * 以下実行結果になるように、
 * runningメソッド、walkingメソッドをプログラミングしましょう。
 *
 * ===== コンソール 【想定】実行結果 =====
 * ランニングをしました
 * 現在体重、95kg
 * ------------------------------
 * ウォーキングをしました
 * 現在体重、92kg
 * ------------------------------
 * ランニングをしました
 * 現在体重、87kg
 * ------------------------------
 * ウォーキングをしました
 * 現在体重、84kg
 * ------------------------------
 * ランニングをしました
 * 現在体重、79kg
 * ------------------------------
 * ===============================
 *
 * ※mainメソッド、showWeightメソッドの編集不可
 *
 */
public class JavaMethodBasic10 {

	public static void main(String[] args) {

		int weight = 100;

		weight = running(weight);
		showWeight(weight);

		weight = walking(weight);
		showWeight(weight);

		weight = running(weight);
		showWeight(weight);

		weight = walking(weight);
		showWeight(weight);

		weight = running(weight);
		showWeight(weight);

	}

	// ↓↓↓runningメソッド定義 ここから↓↓↓
	public static int running(int weight) {
		System.out.println("ランニングをしました");
		return weight - 5;
	}




	// ↑↑↑runningメソッド定義 ここまで↑↑↑

	// ↓↓↓walkingメソッド定義 ここから↓↓↓
	public static int walking(int weight) {
		System.out.println("ウォーキングをしました");
		return weight - 3;
	}




	// ↑↑↑walkingメソッド定義 ここまで↑↑↑

	public static void showWeight(int weight) {
		System.out.println("現在体重、" + weight + "kg");
		System.out.println("------------------------------");
	}

}
