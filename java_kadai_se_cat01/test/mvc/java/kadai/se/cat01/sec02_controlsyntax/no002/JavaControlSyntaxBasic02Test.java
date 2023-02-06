package mvc.java.kadai.se.cat01.sec02_controlsyntax.no002;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic02.main(new String[0]);

		// Assert
		String expected = "3は約数である" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "3は約数ではない";
		assertEquals(expected, print.getActual());

	}

}
