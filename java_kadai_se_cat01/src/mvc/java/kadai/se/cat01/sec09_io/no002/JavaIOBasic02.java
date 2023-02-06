package mvc.java.kadai.se.cat01.sec09_io.no002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ◆ファイルへのデータ書き込み
 *
 * キーボードから入力された文字列を【useIOwriter.txt】へ書き込みます。
 * プログラムを実行し、以下実行結果パターン通り正常に動作するように
 * 本クラスのmainメソッドにプログラムを書き足して完成させましょう。
 *
 * ===== プログラム 実行結果 =====
 *
 * --------------- コンソール 実行結果 ---------------
 * 予約を承ります。氏名を入力してください：OPST太郎
 * 予約を完了しました(useIOwriter.txtを確認)
 * -----------------------------------------------------
 * +
 * ------------ useIOwriter.txt 実行結果 ------------
 * OPST太郎
 *
 * -----------------------------------------------------
 *
 * --------------- コンソール 実行結果 ---------------
 * 予約を承ります。氏名を入力してください：OPST花子
 * 予約を完了しました(useIOwriter.txtを確認)
 * -----------------------------------------------------
 * +
 * ------------ useIOwriter.txt 実行結果 ------------
 * OPST太郎
 * OPST花子
 *
 * -----------------------------------------------------
 * ☆プログラムを実行して氏名を入力する度にuseIOwriter.txtにデータが蓄積されます。
 * 　プログラムを実行する度にデータが上書きされないように注意！！
 * ===============================
 *
 * ※JavaIOBasic02.java既存プログラムの編集不可
 *
 */
public class JavaIOBasic02 {

	public static void main(String[] args) {
		System.out.print("予約を承ります。氏名を入力してください：");
		BufferedReader br = null;
		PrintWriter filePw = null;
		try {

		    /* ①コメントを削除して記述 */



			System.out.print("予約を完了しました(useIOwriter.txtを確認)");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				filePw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}