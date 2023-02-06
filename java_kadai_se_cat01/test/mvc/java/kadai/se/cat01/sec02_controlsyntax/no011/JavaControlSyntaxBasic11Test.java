package mvc.java.kadai.se.cat01.sec02_controlsyntax.no011;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic11Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic11.main(new String[0]);

		// Assert
		String expected = "24681012141618" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "2468101214161820";

		assertEquals(expected, print.getActual());

	}
}
