package mvc.java.kadai.se.cat01.sec05_class.no024;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic24Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic24.main(new String[0]);

		// Assert
		String expected = "[1]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[2]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[3]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[4]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[5]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "合計:15" + JUnitPrintStream.LINE_SEPARATOR
				+ "[6]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[7]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[8]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[9]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[10]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "これ以上格納できません" + JUnitPrintStream.LINE_SEPARATOR
				+ "これ以上格納できません" + JUnitPrintStream.LINE_SEPARATOR
				+ "合計:55";
		assertEquals(expected, print.getActual());
	}

}
