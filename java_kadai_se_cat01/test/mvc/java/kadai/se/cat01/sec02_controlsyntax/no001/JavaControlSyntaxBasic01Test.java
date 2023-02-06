package mvc.java.kadai.se.cat01.sec02_controlsyntax.no001;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic01.main(new String[0]);

		// Assert
		String expected = "10の倍数である" + JUnitPrintStream.LINE_SEPARATOR
				+ "===================================" + JUnitPrintStream.LINE_SEPARATOR
				+ "10の倍数ではない";

		assertEquals(expected, print.getActual());
	}
}
