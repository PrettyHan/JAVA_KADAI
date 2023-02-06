package mvc.java.kadai.se.cat01.sec02_controlsyntax.no013;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic13Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic13.main(new String[0]);

		// Assert
		String expected = "10" + JUnitPrintStream.LINE_SEPARATOR
				+ "9" + JUnitPrintStream.LINE_SEPARATOR
				+ "8" + JUnitPrintStream.LINE_SEPARATOR
				+ "7" + JUnitPrintStream.LINE_SEPARATOR
				+ "6" + JUnitPrintStream.LINE_SEPARATOR
				+ "5" + JUnitPrintStream.LINE_SEPARATOR
				+ "4" + JUnitPrintStream.LINE_SEPARATOR
				+ "3" + JUnitPrintStream.LINE_SEPARATOR
				+ "2" + JUnitPrintStream.LINE_SEPARATOR
				+ "1" + JUnitPrintStream.LINE_SEPARATOR
				+ "終了";
		assertEquals(expected, print.getActual());
	}

}
