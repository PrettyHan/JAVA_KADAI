package mvc.java.kadai.se.cat01.sec02_controlsyntax.no008;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic08Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic08.main(new String[0]);

		// Assert
		String expected = "28以上37以下の全整数の和は325です" + JUnitPrintStream.LINE_SEPARATOR
				+  "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "28以上37以下の全整数の和は325です";
		assertEquals(expected, print.getActual());
	}

}
