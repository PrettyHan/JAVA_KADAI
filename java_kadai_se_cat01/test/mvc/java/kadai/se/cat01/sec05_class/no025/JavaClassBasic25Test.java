package mvc.java.kadai.se.cat01.sec05_class.no025;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic25Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic25.main(new String[0]);

		// Assert
		String expected = "[あいうえお]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[かきくけこ]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[さしすせそ]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[たちつてと]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[なにぬねの]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "これ以上格納できません" + JUnitPrintStream.LINE_SEPARATOR
				+ "◆strArray文字列一覧(新しく格納された順)" + JUnitPrintStream.LINE_SEPARATOR
				+ "なにぬねの" + JUnitPrintStream.LINE_SEPARATOR
				+ "たちつてと" + JUnitPrintStream.LINE_SEPARATOR
				+ "さしすせそ" + JUnitPrintStream.LINE_SEPARATOR
				+ "かきくけこ" + JUnitPrintStream.LINE_SEPARATOR
				+ "あいうえお";
		assertEquals(expected, print.getActual());
	}

}
