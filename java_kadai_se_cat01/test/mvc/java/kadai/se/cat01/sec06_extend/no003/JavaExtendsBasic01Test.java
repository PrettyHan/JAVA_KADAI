package mvc.java.kadai.se.cat01.sec06_extend.no003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaExtendsBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaExtendsBasic01.main(new String[0]);

		// Assert
		String expected = "JavaExtendsBasic01ObjSubAクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjSubBクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "▲▲" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjSubCクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "◇◇◇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjSubDクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "★+★+★+★+" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjSubEクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "☆彡☆彡☆彡☆彡☆彡";

		assertEquals(expected, print.getActual());
	}
}
