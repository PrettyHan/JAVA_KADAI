package mvc.java.kadai.se.cat01.sec05_class.no015;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic15Objクラスは
 * CDのタイトル(String cdTitle)、CDの価格(int cdPrice)、
 * CDアーティスト(String cdArtist)のフィールドと
 * 各フィールドのgetterがあります。
 *
 * JavaClassBasic15SubクラスはJavaClassBasic15Objクラスに
 * 保持されている情報を表示するshowCdInfo()メソッドがあります。
 *
 * 以下の実行結果になるように
 * JavaClassBasic15Subクラス(JavaClassBasic15Sub.java)をプログラミングしましょう。
 *
 * ☆mainメソッドとJavaClassBasic15Objクラスの
 * プログラムを読み、内容を把握しましょう。
 * ===== コンソール 実行結果 =====
 * ◆CDの情報
 * タイトル：OPSTの歌
 * 価格：300
 * アーティスト：OPSTバンド
 * ===============================
 *
 * ※JavaClassBasic15.java、JavaClassBasic15Obj.javaの編集不可
 *
 */
public class JavaClassBasic15 {

	public static void main(String[] args) {

		JavaClassBasic15Obj cd = new JavaClassBasic15Obj("OPSTの歌", 300, "OPSTバンド");
		JavaClassBasic15Sub ucs = new JavaClassBasic15Sub(cd);
		ucs.showCdInfo();

	}

}
