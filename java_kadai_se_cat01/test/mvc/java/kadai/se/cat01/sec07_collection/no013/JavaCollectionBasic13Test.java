package mvc.java.kadai.se.cat01.sec07_collection.no013;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic13Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic13.main(new String[0]);

		// Assert };
		String expected = "[シンデレラ]を入荷しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[桃太郎]を入荷しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[ジャックと豆の木]を入荷しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[うさぎと亀]を入荷しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[アラジンと魔法のランプ]を入荷しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[浦島太郎]を入荷しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お客さん「すみません、[桃太郎]はありますか？」" + JUnitPrintStream.LINE_SEPARATOR
				+ "本屋さん「少々お待ちください…」" + JUnitPrintStream.LINE_SEPARATOR
				+ "本屋さん「お待たせいたしました。お求めの商品ございました。」" + JUnitPrintStream.LINE_SEPARATOR
				+ "◆本の情報" + JUnitPrintStream.LINE_SEPARATOR
				+ "タイトル：桃太郎" + JUnitPrintStream.LINE_SEPARATOR
				+ "価格：500" + JUnitPrintStream.LINE_SEPARATOR
				+ "著者：OPST花子" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お客さん「すみません、[ジャックと豆の日]はありますか？」" + JUnitPrintStream.LINE_SEPARATOR
				+ "本屋さん「少々お待ちください…」" + JUnitPrintStream.LINE_SEPARATOR
				+ "本屋さん「申し訳ございません。在庫切れです。」";

		assertEquals(expected, print.getActual());
	}

}
