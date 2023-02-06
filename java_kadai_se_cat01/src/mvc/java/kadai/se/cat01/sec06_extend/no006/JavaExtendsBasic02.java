package mvc.java.kadai.se.cat01.sec06_extend.no006;

/*
 * ◆類似したクラスの利用
 * mainメソッドでAnimalHospitalクラスをインスタンス化し、
 * メソッドを使用した結果、以下の実行結果が表示されるように
 * AnimalHospitalクラスの①②を補い、
 * プログラムを完成させましょう。
 *
 * ☆解き方のアドバイス
 * 既存の各クラスのプログラムや実行結果から解答を導きましょう。
 * 実行結果から各動物に対して実施されている共通処理が存在する
 * ことが分かりますが、その処理とはなんでしょうか。
 *
 * ===== コンソール 実行結果 =====
 * ピーちゃん1の鳴き声がする
 * ピーちゃん1が入院しました
 * +++
 * ポチ1の鳴き声がする
 * ポチ1が入院しました
 * +++
 * ピーちゃん2の鳴き声がする
 * ピーちゃん2が入院しました
 * +++
 * ポチ2の鳴き声がする
 * ポチ2が入院しました
 * +++
 * ピーちゃん3の鳴き声がする
 * ピーちゃん3が入院しました
 * +++
 * ポチ3の鳴き声がする
 * ポチ3が入院しました
 * ------------------------------
 * ◆患者さんリスト
 * ピーちゃん1(1才)
 * ピーちゃん2(2才)
 * ピーちゃん3(3才)
 * ポチ1(1才)
 * ポチ2(2才)
 * ポチ3(3才)
 * ===============================
 *
 * ※ 既存プログラム(JavaExtendsBasic02.java、Bird.java、Dog.java) は編集不可
 */
public class JavaExtendsBasic02 {

	public static void main(String[] args) {

		AnimalHospital aniHspt = new AnimalHospital();

		aniHspt.enterHospital(new Bird("ピーちゃん1", 1));
		System.out.println("+++");

		aniHspt.enterHospital(new Dog("ポチ1", 1));
		System.out.println("+++");

		aniHspt.enterHospital(new Bird("ピーちゃん2", 2));
		System.out.println("+++");

		aniHspt.enterHospital(new Dog("ポチ2", 2));
		System.out.println("+++");

		aniHspt.enterHospital(new Bird("ピーちゃん3", 3));
		System.out.println("+++");

		aniHspt.enterHospital(new Dog("ポチ3", 3));
		System.out.println("------------------------------");

		aniHspt.showAllPatientList();

	}

}
