package mvc.java.kadai.se.cat01.sec04_method.no013;

/*
 * ◆メソッドの利用
 * printShapeメソッドは、
 * 第1引数で渡された整数の回数だけ、
 * 第2引数で渡されたマークを連続してコンソールに出力します。
 *
 * printShapeメソッドをmainメソッドで使用し、
 * コンソールに以下の実行結果を表示させましょう。
 *
 * ===== コンソール 実行結果 =====
 * 〇〇〇
 * ------------------------------
 * △△△△△△
 * ------------------------------
 * □□□□□□□□□□□□
 * ------------------------------
 * ======================
 *
 * ※printShapeメソッド、showMarkメソッドの編集不可
 *
 */
public class JavaMethodBasic13 {

	public static void main(String[] args) {




	}

	public static void printShape(int count, String mark) {
		for (int i = 0; i < count; i++) {
			showMark(mark);
		}
		System.out.println();
		System.out.println("------------------------------");
	}

	public static void showMark(String mark) {
		System.out.print(mark);
	}

}
