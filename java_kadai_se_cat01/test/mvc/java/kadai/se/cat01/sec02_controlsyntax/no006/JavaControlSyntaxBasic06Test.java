package mvc.java.kadai.se.cat01.sec02_controlsyntax.no006;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic06Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic06.main(new String[0]);

		// Assert
		String expected = "夏です" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "冬です" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "夏です";
		assertEquals(expected, print.getActual());

	}

}
