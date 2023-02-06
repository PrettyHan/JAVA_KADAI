package mvc.java.kadai.se.cat01.sec07_collection.no013;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaCollectionBasic13Subクラスは
 * JavaCollectionBasic13Obj型ArrayList「bookList」
 * (ArrayList<JavaCollectionBasic13Obj> bookList = new ArrayList<>())と
 * bookListフィールドに第1引数で渡されたJavaCollectionBasic13Obj型データを
 * 格納できるaddBookメソッド、
 * bookListフィールドに格納されたデータから
 * 第1引数で渡された本のタイトルを探すsearchBookメソッドがあります。
 *
 * 以下実行結果になるように
 * JavaCollectionBasic13Subクラスの①、②を補い
 * JavaCollectionBasic13Subクラスを完成させましょう。
 *
 * ☆JavaCollectionBasic13Objクラスに
 * 「◆本の情報」を表示するshowBookInfo()メソッドがあります。
 * 実行結果をみると「◆本の情報」が出力されていますので使用することになります。
 * ===== コンソール 実行結果 =====
 * [シンデレラ]を入荷しました
 * [桃太郎]を入荷しました
 * [ジャックと豆の木]を入荷しました
 * [うさぎと亀]を入荷しました
 * [アラジンと魔法のランプ]を入荷しました
 * [浦島太郎]を入荷しました
 * ------------------------------
 * お客さん「すみません、[桃太郎]はありますか？」
 * 本屋さん「少々お待ちください…」
 * 本屋さん「お待たせいたしました。お求めの商品ございました。」
 * ◆本の情報
 * タイトル：桃太郎
 * 価格：500
 * 著者：OPST花子
 * ------------------------------
 * お客さん「すみません、[ジャックと豆の日]はありますか？」
 * 本屋さん「少々お待ちください…」
 * 本屋さん「申し訳ございません。在庫切れです。」
 * ===============================
 *
 * ※JavaCollectionBasic13.java、JavaCollectionBasic13Obj.java
 *  JavaCollectionBasic13Sub.java既存プログラムの編集不可
 *
 */
public class JavaCollectionBasic13 {

	public static void main(String[] args) {

		JavaCollectionBasic13Sub ujcs = new JavaCollectionBasic13Sub();

		ujcs.addBook(new JavaCollectionBasic13Obj("シンデレラ", 900, "OPST太郎"));
		ujcs.addBook(new JavaCollectionBasic13Obj("桃太郎", 500, "OPST花子"));
		ujcs.addBook(new JavaCollectionBasic13Obj("ジャックと豆の木", 800, "OPST一郎"));
		ujcs.addBook(new JavaCollectionBasic13Obj("うさぎと亀", 600, "OPST次郎"));
		ujcs.addBook(new JavaCollectionBasic13Obj("アラジンと魔法のランプ", 700, "OPST愛子"));
		ujcs.addBook(new JavaCollectionBasic13Obj("浦島太郎", 400, "OPST友子"));

		System.out.println("------------------------------");

		ujcs.searchBook("桃太郎");

		System.out.println("------------------------------");

		ujcs.searchBook("ジャックと豆の日");  // 正しくは「豆の木」

	}

}
