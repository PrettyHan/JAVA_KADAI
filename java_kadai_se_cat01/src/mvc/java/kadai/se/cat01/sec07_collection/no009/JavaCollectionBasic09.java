package mvc.java.kadai.se.cat01.sec07_collection.no009;

/*
 * ◆コレクション(JavaAPI)利用
 * UseJavaCollection09Subクラスは
 * Integer型ArrayList「intArrayList」(ArrayList<Integer> intArrayList = new ArrayList<>())と
 * intArrayListフィールドに第1引数で渡されたint型データを格納できるaddIntメソッド、
 * intArrayListフィールドに格納されたint型データを合計するgetAllSumメソッドがあります。
 *
 * 以下実行結果になるように
 * UseJavaCollection09Subクラスの①、②を補い
 * UseJavaCollection09Subクラスを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * [1]を格納しました
 * [2]を格納しました
 * [3]を格納しました
 * [4]を格納しました
 * [5]を格納しました
 * 合計:15
 * [6]を格納しました
 * [7]を格納しました
 * [8]を格納しました
 * [9]を格納しました
 * [10]を格納しました
 * [11]を格納しました
 * [12]を格納しました
 * 合計:78
 * ===============================
 *
 * ※UseJavaCollection09.java、
 * 　UseJavaCollection09Sub.java既存プログラムの編集不可
 *
 */
public class JavaCollectionBasic09 {

	public static void main(String[] args) {

		JavaCollectionBasic09Sub ujcs = new JavaCollectionBasic09Sub();

		ujcs.addInt(1);
		ujcs.addInt(2);
		ujcs.addInt(3);
		ujcs.addInt(4);
		ujcs.addInt(5);

		int sum = ujcs.getAllSum();
		System.out.println("合計:" + sum);

		ujcs.addInt(6);
		ujcs.addInt(7);
		ujcs.addInt(8);
		ujcs.addInt(9);
		ujcs.addInt(10);
		ujcs.addInt(11);
		ujcs.addInt(12);

		sum = ujcs.getAllSum();
		System.out.println("合計:" + sum);

	}

}
