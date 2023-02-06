package mvc.java.kadai.se.cat01.sec02_controlsyntax.no004;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic04Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic04.main(new String[0]);

		// Assert
		String expected = "差は10以下ではない" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "差は10以下です";
		assertEquals(expected, print.getActual());

	}

}
