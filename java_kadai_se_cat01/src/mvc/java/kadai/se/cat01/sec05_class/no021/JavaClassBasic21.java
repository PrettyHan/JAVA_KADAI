package mvc.java.kadai.se.cat01.sec05_class.no021;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic21Objクラスは現在の体重(int weight)と
 * 目標体重(final int GOAL_WEIGHT)と1か月減量単位(final int UNIT)
 * の変数/定数フィールドと、
 * 1か月に2kgずつ現体重から70kgになるまで減量するダイエットプランを
 * 表示するshowDietPlanメソッドがあります。
 *
 * 以下の実行結果になるようにJavaClassBasic21Objクラスの
 * showDietPlanメソッドをプログラミングしましょう。
 *
 * ===== コンソール 実行結果 =====
 * 現状あなたに提案するダイエットプランはありません
 * --------------------------------------------------
 * 現在の体重は、【71kg】です
 * 1か月2kgのペースで減量すると、70kgまで1か月です
 * --------------------------------------------------
 * 現在の体重は、【72kg】です
 * 1か月2kgのペースで減量すると、70kgまで1か月です
 * --------------------------------------------------
 * 現在の体重は、【73kg】です
 * 1か月2kgのペースで減量すると、70kgまで2か月です
 * --------------------------------------------------
 * 現在の体重は、【100kg】です
 * 1か月2kgのペースで減量すると、70kgまで15か月です
 * --------------------------------------------------
 * 現在の体重は、【115kg】です
 * 1か月2kgのペースで減量すると、70kgまで23か月です
 * --------------------------------------------------
 * ===============================
 *
 * ※JavaClassBasic21.java、JavaClassBasic21Obj.javaの既存プログラム編集不可
 *
 */
public class JavaClassBasic21 {

	public static void main(String[] args) {

		JavaClassBasic21Obj obj70 = new JavaClassBasic21Obj(70);
		obj70.showDietPlan();
		System.out.println("--------------------------------------------------");

		JavaClassBasic21Obj obj71 = new JavaClassBasic21Obj(71);
		obj71.showDietPlan();
		System.out.println("--------------------------------------------------");
		JavaClassBasic21Obj obj72 = new JavaClassBasic21Obj(72);
		obj72.showDietPlan();
		System.out.println("--------------------------------------------------");
		JavaClassBasic21Obj obj73 = new JavaClassBasic21Obj(73);
		obj73.showDietPlan();
		System.out.println("--------------------------------------------------");

		JavaClassBasic21Obj obj100 = new JavaClassBasic21Obj(100);
		obj100.showDietPlan();
		System.out.println("--------------------------------------------------");

		JavaClassBasic21Obj obj115 = new JavaClassBasic21Obj(115);
		obj115.showDietPlan();
		System.out.println("--------------------------------------------------");

	}

}
