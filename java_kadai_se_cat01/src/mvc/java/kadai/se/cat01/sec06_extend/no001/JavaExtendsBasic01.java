package mvc.java.kadai.se.cat01.sec06_extend.no001;

/*
 * ◆類似したクラスの改修
 * 本パッケージ内JavaExtendsBasic01クラスのmainメソッドを実行すると
 * 以下の実行結果が表示されます。
 *
 * ===== コンソール 実行結果 =====
 * JavaExtendsBasic01ObjAクラスです
 * 〇
 * ------------------------------
 * JavaExtendsBasic01ObjBクラスです
 * ▲▲
 * ------------------------------
 * JavaExtendsBasic01ObjCクラスです
 * ◇◇◇
 * ------------------------------
 * JavaExtendsBasic01ObjDクラスです
 * ★★★★
 * ------------------------------
 * JavaExtendsBasic01ObjEクラスです
 * ☆彡☆彡☆彡☆彡☆彡
 * ===============================
 *
 * 既存の状態から改修を行い
 * 以下の実行結果になるようにプログラムを修正しましょう。
 * 「*＊」←かぎ括弧内をコピーして改修にご使用ください。
 *
 * ===== コンソール 【改修後】実行結果 =====
 * JavaExtendsBasic01ObjAクラスです
 * 〇*＊
 * ------------------------------
 * JavaExtendsBasic01ObjBクラスです
 * ▲*＊▲*＊
 * ------------------------------
 * JavaExtendsBasic01ObjCクラスです
 * ◇*＊◇*＊◇*＊
 * ------------------------------
 * JavaExtendsBasic01ObjDクラスです
 * ★*＊★*＊★*＊★*＊
 * ------------------------------
 * JavaExtendsBasic01ObjEクラスです
 * ☆彡*＊☆彡*＊☆彡*＊☆彡*＊☆彡*＊
 * ===============================
 *
 * ※JavaExtendsBasic01.javaの編集、および新規ファイル・メソッドの追加は不可とする。
 *
 */
public class JavaExtendsBasic01 {

	public static void main(String[] args) {

		JavaExtendsBasic01ObjA objA = new JavaExtendsBasic01ObjA("JavaExtendsBasic01ObjA");
		objA.showClassName();
		objA.printShape("〇", 1);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjB objB = new JavaExtendsBasic01ObjB("JavaExtendsBasic01ObjB");
		objB.showClassName();
		objB.printShape("▲", 2);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjC objC = new JavaExtendsBasic01ObjC("JavaExtendsBasic01ObjC");
		objC.showClassName();
		objC.printShape("◇", 3);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjD objD = new JavaExtendsBasic01ObjD("JavaExtendsBasic01ObjD");
		objD.showClassName();
		objD.printShape("★", 4);

		System.out.println("------------------------------");

		JavaExtendsBasic01ObjE objE = new JavaExtendsBasic01ObjE("JavaExtendsBasic01ObjE");
		objE.showClassName();
		objE.printShape("☆彡", 5);

	}

}
