package mvc.java.kadai.se.cat01.sec06_extend.no004;

/*
 * ◆インターフェースの定義
 * 本パッケージ内JavaInterfaceBasic01クラスのmainメソッドを実行すると
 * 以下の実行結果が表示される想定です。
 *
 * ===== コンソール 実行結果 =====
 * JavaInterfaceBasic01ObjAImpl#printメソッドを呼び出しました。
 * JavaInterfaceBasic01ObjAImpl#fugaメソッドを呼び出しました。
 * JavaInterfaceBasic01ObjBImpl#printメソッドを呼び出しました
 * JavaInterfaceBasic01ObjBImpl#hogeメソッドを呼び出しました。
 * ===============================
 *
 * 既存の状態から改修を行い
 * 上記実行結果になるようにプログラム(JavaInterfaceBasic01Obj.java)を修正しましょう。
 *
 * ※JavaInterfaceBasic01.javaとJavaInterfaceBasic01ObjAImpl.java、
 * JavaInterfaceBasic01ObjBImpl.javaの既存プログラムの編集、および新規ファイル追加は不可とする
 */
public class JavaInterfaceBasic01 {

	public static void main(String[] args) {

		JavaInterfaceBasic01ObjAImpl objA = new JavaInterfaceBasic01ObjAImpl();

		// メソッドの実行
		objA.print();
		objA.fuga();

		JavaInterfaceBasic01ObjBImpl objB = new JavaInterfaceBasic01ObjBImpl();

		// メソッドの実行
		objB.print();
		objB.hoge();

	}

}
