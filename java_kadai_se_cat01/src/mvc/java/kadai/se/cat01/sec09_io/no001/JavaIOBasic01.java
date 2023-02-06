package mvc.java.kadai.se.cat01.sec09_io.no001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ◆入力値の確認(バリデーションチェック)
 *
 * キーボードから入力された文字列を【バリデーションチェック】します。
 * 以下2点を確認し、どちらの条件も満たしていれば正常値です。
 * ①空文字でないこと
 * ②20文字以内であること(20文字〇、21文字×)
 *
 * 以下実行結果パターンすべてが表示されるように、
 * 本クラスのmainメソッドにプログラムを書き足して完成させましょう。
 *
 * ===== コンソール 実行結果 パターン1(空文字入力) =====
 * 氏名を入力してください：
 * 氏名は必ず入力してください
 * ===============================
 *
 * ===== コンソール 実行結果 パターン2(20文字を超えた氏名) =====
 * 氏名を入力してください：OPST太郎あああああああああああああああ
 * 氏名は20文字以内で入力してください
 * ===============================
 *
 * ===== コンソール 実行結果 パターン3(正常値) =====
 * 氏名を入力してください：OPST太郎
 * 氏名->OPST太郎
 * ===============================
 *
 * ※JavaIOBasic01.java既存プログラムの編集不可
 *
 */
public class JavaIOBasic01 {

	public static void main(String[] args) {
		System.out.print("氏名を入力してください：");

		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();

			/* ①コメントを削除して記述 */



		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}