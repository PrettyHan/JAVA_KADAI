package mvc.java.kadai.se.cat01.sec06_extend.no002;

/*
 * ◆継承を利用した類似したクラスの改修
 * 本パッケージ内JavaExtendsBasic01クラスのmainメソッドを実行すると
 * 以下の実行結果が表示されます。
 *
 * ===== コンソール 実行結果 =====
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
 * ★★★★
 * ------------------------------
 * JavaExtendsBasic01ObjSubEクラスです
 * ☆彡☆彡☆彡☆彡☆彡
 * ===============================
 *
 * 既存の状態から改修を行い
 * 以下の実行結果になるようにプログラムを修正しましょう。
 * 「*＊」←かぎ括弧内をコピーして改修にご使用ください。
 *
 * ===== コンソール 【改修後】実行結果 =====
 * JavaExtendsBasic01ObjSubAクラスです
 * 〇*＊
 * ------------------------------
 * JavaExtendsBasic01ObjSubBクラスです
 * ▲*＊▲*＊
 * ------------------------------
 * JavaExtendsBasic01ObjSubCクラスです
 * ◇*＊◇*＊◇*＊
 * ------------------------------
 * JavaExtendsBasic01ObjSubDクラスです
 * ★*＊★*＊★*＊★*＊
 * ------------------------------
 * JavaExtendsBasic01ObjSubEクラスです
 * ☆彡*＊☆彡*＊☆彡*＊☆彡*＊☆彡*＊
 * ===============================
 *
 * ※JavaExtendsBasic01.javaの編集、および新規ファイル・メソッドの追加は不可とする。
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
