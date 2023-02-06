package mvc.java.kadai.se.cat01.sec01_variable.no025;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaVariableBasic25Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaVariableBasic25.main(new String[0]);

		// Assert
		String expected = "10";
		assertEquals(expected, print.getActual());
	}

}
