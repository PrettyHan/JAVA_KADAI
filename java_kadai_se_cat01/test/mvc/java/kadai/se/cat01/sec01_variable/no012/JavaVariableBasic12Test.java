package mvc.java.kadai.se.cat01.sec01_variable.no012;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaVariableBasic12Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaVariableBasic12.main(new String[0]);

		// Assert
		String expected = "こんにちは" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは";
		assertEquals(expected,print.getActual());
	}
}
