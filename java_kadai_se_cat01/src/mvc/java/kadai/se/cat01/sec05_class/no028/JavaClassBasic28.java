package mvc.java.kadai.se.cat01.sec05_class.no028;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic28Subクラスを
 * mainメソッドで利用してプログラムを書きました。
 * 以下の実行結果になると想定していましたが…
 *
 * ===== コンソール 【想定】実行結果 =====
 * 1/2/3/4/5/
 * ↓doTenTimesメソッドを使用すると各要素が10倍になります
 * 10/20/30/40/50/
 * ===============================
 *
 * 現状、実行すると以下の結果になります。【想定】実行結果になるように
 * JavaClassBasic28SubクラスのdoTenTimesメソッドを修正しましょう。
 *
 * ===== コンソール 【現状】実行結果 =====
 * 10/20/30/40/50/
 * ↓doTenTimesメソッドを使用すると各要素が10倍になります
 * 10/20/30/40/50/
 * ===============================
 *
 * ※JavaClassBasic28.javaの編集不可
 *
 */
public class JavaClassBasic28 {

	public static void main(String[] args) {

		int[] intArray = new int[] {1,2,3,4,5};

		JavaClassBasic28Sub ucs = new JavaClassBasic28Sub();
		int[] result = ucs.doTenTimes(intArray);

		for(int i : intArray) {
			System.out.print(i + "/");
		}

		System.out.println();
		System.out.println("↓doTenTimesメソッドを使用すると各要素が10倍になります");

		for(int i : result) {
			System.out.print(i + "/");
		}

	}

}
