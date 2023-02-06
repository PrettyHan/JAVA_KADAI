package mvc.java.kadai.se.cat01.sec06_extend.no007;

/*
 * ◆継承を利用した類似したクラスの利用
 * mainメソッドでAnimalHospitalクラスをインスタンス化し、
 * メソッドを使用した結果、以下の実行結果が表示されるように
 * Birdクラスの①、Dogクラスの②、
 * AnimalHospitalクラスの③、④を補い、
 * プログラムを完成させましょう。
 *
 * ☆解き方のアドバイス
 * 既存の各クラスのプログラムや実行結果から解答を導きましょう。
 * 前問では、 Birdクラス・Dogクラスは個別でメソッドを実装していましたが、
 * 今回はAnimalクラスを継承しています。そこでAnimalクラスを継承することの
 * 利点とその利点を生かすためにはどうすればよいか考えてみましょう。
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
 * ポチ1(1才)
 * ピーちゃん2(2才)
 * ポチ2(2才)
 * ピーちゃん3(3才)
 * ポチ3(3才)
 * ===============================
 *
 * ※ 既存プログラムは編集不可
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
