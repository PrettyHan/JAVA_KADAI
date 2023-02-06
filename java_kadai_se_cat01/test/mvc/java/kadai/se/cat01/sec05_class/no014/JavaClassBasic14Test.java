package mvc.java.kadai.se.cat01.sec05_class.no014;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic14Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic14.main(new String[0]);

		// Assert
		String expected = "ペットを撫でます" + JUnitPrintStream.LINE_SEPARATOR
				+ "⇒鳥のぴーちゃんがピッピーと鳴いた"  + JUnitPrintStream.LINE_SEPARATOR
				+ "ペットと過ごして1年…"  + JUnitPrintStream.LINE_SEPARATOR
				+ "⇒0才だった鳥のぴーちゃんは今日の誕生日で1才になりました"  + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------"  + JUnitPrintStream.LINE_SEPARATOR
				+ "ペットを撫でます"  + JUnitPrintStream.LINE_SEPARATOR
				+ "⇒鳥のフェニックスがピッピーと鳴いた"  + JUnitPrintStream.LINE_SEPARATOR
				+ "ペットと過ごして1年…"  + JUnitPrintStream.LINE_SEPARATOR
				+ "⇒10000才だった鳥のフェニックスは今日の誕生日で10001才になりました";
		assertEquals(expected, print.getActual());
	}

}
