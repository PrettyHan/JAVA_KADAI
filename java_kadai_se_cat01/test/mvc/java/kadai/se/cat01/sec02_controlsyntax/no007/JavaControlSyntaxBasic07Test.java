package mvc.java.kadai.se.cat01.sec02_controlsyntax.no007;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic07Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic07.main(new String[0]);

		// Assert
		String expected = "評価は不可です" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "評価は可です" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "評価は良です" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "評価は優です";

		assertEquals(expected, print.getActual());

	}

}
