package mvc.java.kadai.se.cat01.sec05_class.no018;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic18Objクラスは次のフィールドを保有しています。
 * ・fName      (苗字/String型)
 * ・lName      (名前/String型)
 * ・age        (年齢/int型)
 * ・gender     (性別/char型)
 * ・postalCode (郵便番号/String型)
 * ・address    (住所/String型)
 * ・tel        (電話番号/String型)
 *
 * JavaClassBasic18Objクラスの各フィールドにデータを格納し、
 * 以下の実行結果になるようにshowUserInfoメソッドをmainメソッドで使用しましょう。
 *
 * ===== コンソール 実行結果 =====
 * ◆JavaClassBasic18
 * 氏名：OPST太郎
 * 年齢：30
 * 性別：男
 * 住所：〒123-4567 東京都新宿区
 * 電話：03-1234-5678
 * ===============================
 *
 * ※showUserInfoメソッド、JavaClassBasic18Obj.javaの編集不可
 *
 */
public class JavaClassBasic18{

	public static void main(String[] args) {

		String fName = "OPST"; // この変数を利用すること
		String lName = "太郎"; // この変数を利用すること
		int age = 30; // この変数を利用すること
		char gender = 'm'; // この変数を利用すること
		String postalCode = "123-4567"; // この変数を利用すること
		String address = "東京都新宿区"; // この変数を利用すること
		String tel = "03-1234-5678"; // この変数を利用すること



	}

	public static void showUserInfo(JavaClassBasic18Obj uco) {

		System.out.println("◆JavaClassBasic18");

		String name = uco.getfName() + uco.getlName();
		System.out.println("氏名：" + name);

		System.out.println("年齢：" + uco.getAge());

		char gender = uco.getGender();
		if (gender == 'm') {
			System.out.println("性別：男");
		} else if (gender == 'f') {
			System.out.println("性別：女");
		} else {
			System.out.println("性別：非公開");
		}

		System.out.println("住所：〒" + uco.getPostalCode() + " " + uco.getAddress());

		System.out.println("電話：" + uco.getTel());

	}

}
