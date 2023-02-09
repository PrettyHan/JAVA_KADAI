package mvc.java.kadai.se.cat01.sec05_class.no022;

/*
 * ◆別クラス(オブジェクト)の利用
 * 以下実行結果になるように
 * JavaClassBasic22ObjクラスとJavaClassBasic22Subクラスを利用し、
 * mainメソッドにプログラムを書きましょう。
 *
 * ☆JavaClassBasic22ObjクラスとJavaClassBasic22Subクラスの
 * プログラムを読み、内容を把握しましょう。
 * ===== コンソール 実行結果 =====
 * 〇〇〇
 * ------------------------------
 * △△△△△△
 * ------------------------------
 * □□□□□□□□□□□□
 * ------------------------------
 * ===============================
 *
 * ※JavaClassBasic22Obj.java、JavaClassBasic22Sub.javaの編集不可
 *
 */
public class JavaClassBasic22 {

	public static void main(String[] args) {

		JavaClassBasic22Obj sub = new JavaClassBasic22Obj(3,"〇");
		JavaClassBasic22Sub sub2 = new JavaClassBasic22Sub();
		JavaClassBasic22Obj sub3 = new JavaClassBasic22Obj(6,"△");
		JavaClassBasic22Obj sub4 = new JavaClassBasic22Obj(12,"□");

		sub2.printShape(sub);
		sub2.printShape(sub3);
		sub2.printShape(sub4);




	}

}
