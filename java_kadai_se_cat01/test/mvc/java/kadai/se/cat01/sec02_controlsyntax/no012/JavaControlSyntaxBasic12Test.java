package mvc.java.kadai.se.cat01.sec02_controlsyntax.no012;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic12Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic12.main(new String[0]);

		// Assert
		String expected = "0" + JUnitPrintStream.LINE_SEPARATOR
				+ "1" + JUnitPrintStream.LINE_SEPARATOR
				+ "2" + JUnitPrintStream.LINE_SEPARATOR
				+ "3" + JUnitPrintStream.LINE_SEPARATOR
				+ "4" + JUnitPrintStream.LINE_SEPARATOR
				+ "5" + JUnitPrintStream.LINE_SEPARATOR
				+ "待機中…" + JUnitPrintStream.LINE_SEPARATOR
				+ "待機中…" + JUnitPrintStream.LINE_SEPARATOR
				+ "待機中…" + JUnitPrintStream.LINE_SEPARATOR
				+ "待機中…" + JUnitPrintStream.LINE_SEPARATOR
				+ "待機中…";
		assertEquals(expected, print.getActual());
	}

}
