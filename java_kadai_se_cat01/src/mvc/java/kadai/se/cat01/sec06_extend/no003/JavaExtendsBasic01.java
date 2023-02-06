package mvc.java.kadai.se.cat01.sec06_extend.no003;

/*
 * ◆継承を利用した類似したクラスの改修
 * *
 * JavaExtendsBasic01ObjSubDクラスの
 * printShapeメソッドのみを仕様を変更することになりました。
 * マークの後ろに「+」がはいります。以下の実行結果になるように
 * プログラムを修正しましょう。
 *
 * ===== コンソール 【改修後】実行結果 =====
 * JavaExtendsBasic01ObjSubAクラスです
 * 〇
 * ------------------------------
 * JavaExtendsBasic01ObjSubBクラスです
 * ▲▲
 * ------------------------------
 * JavaExtendsBasic01ObjSubCクラスです
 * ◇◇◇
 * ------------------------------
 * JavaExtendsBasic01ObjSubDクラスです
 * ★+★+★+★+
 * ------------------------------
 * JavaExtendsBasic01ObjSubEクラスです
 * ☆彡☆彡☆彡☆彡☆彡
 * ===============================
 *
 * ※JavaExtendsBasic01.javaの編集不可
 *
 */
public class JavaExtendsBasic01 {

	public static void main(String[] args) {

		JavaExtendsBasic01ObjSubA objA = new JavaExtendsBasic01ObjSubA("JavaExtendsBasic01ObjSubA");
		objA.showClassName();
		objA.printShape("〇", 1);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjSubB objB = new JavaExtendsBasic01ObjSubB("JavaExtendsBasic01ObjSubB");
		objB.showClassName();
		objB.printShape("▲", 2);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjSubC objC = new JavaExtendsBasic01ObjSubC("JavaExtendsBasic01ObjSubC");
		objC.showClassName();
		objC.printShape("◇", 3);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjSubD objD = new JavaExtendsBasic01ObjSubD("JavaExtendsBasic01ObjSubD");
		objD.showClassName();
		objD.printShape("★", 4);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjSubE objE = new JavaExtendsBasic01ObjSubE("JavaExtendsBasic01ObjSubE");
		objE.showClassName();
		objE.printShape("☆彡", 5);

	}

}
