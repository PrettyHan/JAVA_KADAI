package mvc.java.kadai.se.cat01.sec02_controlsyntax.no010;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic10Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic10.main(new String[0]);

		// Assert
		String expected = "65";
		assertEquals(expected, print.getActual());
	}

}
