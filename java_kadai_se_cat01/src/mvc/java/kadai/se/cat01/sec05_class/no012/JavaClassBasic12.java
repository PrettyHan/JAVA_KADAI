package mvc.java.kadai.se.cat01.sec05_class.no012;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic12Objクラスを
 * mainメソッドで利用してプログラムを書きました。
 * 以下の実行結果になると想定していましたが…
 *
 * ===== コンソール 【想定】実行結果 =====
 * 現在の体重：100kg
 * ランニングをしました
 * 現在体重、95kg
 * ------------------------------
 * 現在の体重：95kg
 * ウォーキングをしました
 * 現在体重、92kg
 * ------------------------------
 * 現在の体重：92kg
 * ランニングをしました
 * 現在体重、87kg
 * ------------------------------
 * 現在の体重：87kg
 * ウォーキングをしました
 * 現在体重、84kg
 * ------------------------------
 * 現在の体重：84kg
 * ランニングをしました
 * 現在体重、79kg
 * ------------------------------
 * ===============================
 *
 * 現状、実行すると以下の結果になります。
 * 【想定】実行結果になるようにJavaClassBasic12Objクラスを修正しましょう。
 *
 * ===== コンソール 【現状】実行結果 =====
 * 現在の体重：100kg
 * ランニングをしました
 * 現在体重、95kg
 * ------------------------------
 * 現在の体重：100kg
 * ウォーキングをしました
 * 現在体重、97kg
 * ------------------------------
 * 現在の体重：100kg
 * ランニングをしました
 * 現在体重、95kg
 * ------------------------------
 * 現在の体重：100kg
 * ウォーキングをしました
 * 現在体重、97kg
 * ------------------------------
 * 現在の体重：100kg
 * ランニングをしました
 * 現在体重、95kg
 * ------------------------------
 * ===============================
 *
 * ※JavaClassBasic12.javaの編集不可
 *
 */
public class JavaClassBasic12 {

	public static void main(String[] args) {
		JavaClassBasic12Obj obj = new JavaClassBasic12Obj();

		int result = 0;
		result = obj.running();
		System.out.println("現在体重、" + result + "kg");
		System.out.println("------------------------------");

		result = obj.working();
		System.out.println("現在体重、" + result + "kg");
		System.out.println("------------------------------");

		result = obj.running();
		System.out.println("現在体重、" + result + "kg");
		System.out.println("------------------------------");

		result = obj.working();
		System.out.println("現在体重、" + result + "kg");
		System.out.println("------------------------------");

		result = obj.running();
		System.out.println("現在体重、" + result + "kg");
		System.out.println("------------------------------");
	}

}
