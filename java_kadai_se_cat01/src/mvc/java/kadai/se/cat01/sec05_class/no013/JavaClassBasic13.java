package mvc.java.kadai.se.cat01.sec05_class.no013;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic13Objクラスは
 * 猫の名前(String catName)と猫の年齢(int catAge)のフィールド、
 * 「猫の〇〇〇がニャーと鳴いた」と表示するmewメソッド、
 * 猫の年齢を1加算し
 * 「猫の〇〇〇は△才でしたが、▲才になりました」と
 * 表示するgrowメソッドがあります。
 *
 * JavaClassBasic13Objクラスの各フィールドにデータを格納し、以下の実行結果になるように
 * JavaClassBasic13Objクラス(JavaClassBasic13Obj.java)をプログラミングしましょう。
 *
 * ===== コンソール 実行結果 =====
 * 猫のタマがニャーと鳴いた
 * 猫のタマは1才でしたが、2才になりました
 * 猫のタマは2才でしたが、3才になりました
 * 猫のタマは3才でしたが、4才になりました
 * ===============================
 *
 * ※JavaClassBasic13.javaの編集不可
 *
 */
public class JavaClassBasic13 {

	public static void main(String[] args) {

		JavaClassBasic13Obj cat = new JavaClassBasic13Obj("タマ", 1);
		cat.mew();
		cat.grow();
		cat.grow();
		cat.grow();

	}

}
