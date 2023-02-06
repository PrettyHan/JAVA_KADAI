package mvc.java.kadai.se.cat01.sec06_extend.no005;

/*
 * ◆インターフェースの実装
 * 本パッケージ内JavaInterfaceBasic02クラスのmainメソッドを実行すると
 * 以下実行結果が表示される想定です。
 *
 * ===== コンソール 実行結果 =====
 * こんにちは！
 * ===============================
 *
 * 既存の状態から改修を行い
 * 上記の実行結果になるようプログラムを修正しましょう。
 *
 *
 * ※JavaInterfaceBasic02.javaとJavaInterfaceBasic02Obj.javaの既存プログラムの編集、および新規ファイル追加は不可とする。
 *
 */
public class JavaInterfaceBasic02 {

	public static void main(String[] args) {

		JavaInterfaceBasic02Obj obj = new JavaInterfaceBasic02ObjImpl();

		// メソッドを実行する
		obj.showMessage("こんにちは！");

	}

}
