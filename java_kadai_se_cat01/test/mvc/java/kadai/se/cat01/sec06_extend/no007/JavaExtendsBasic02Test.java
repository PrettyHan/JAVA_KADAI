package mvc.java.kadai.se.cat01.sec06_extend.no007;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaExtendsBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaExtendsBasic02.main(new String[0]);

		// Assert
		String expected =  "ピーちゃん1の鳴き声がする" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん1が入院しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "+++" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ1の鳴き声がする" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ1が入院しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "+++" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん2の鳴き声がする" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん2が入院しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "+++" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ2の鳴き声がする" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ2が入院しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "+++" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん3の鳴き声がする" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん3が入院しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "+++" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ3の鳴き声がする" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ3が入院しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "◆患者さんリスト" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん1(1才)" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ1(1才)" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん2(2才)" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ2(2才)" + JUnitPrintStream.LINE_SEPARATOR
				+ "ピーちゃん3(3才)" + JUnitPrintStream.LINE_SEPARATOR
				+ "ポチ3(3才)";

		assertEquals(expected, print.getActual());
	}

}
