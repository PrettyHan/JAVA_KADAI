package mvc.java.kadai.se.cat01.sec01_variable.no005;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaVariableBasic05Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaVariableBasic05.main(new String[0]);

		// Assert
		String expected = "Hello World!";
		assertEquals(expected, print.getActualNotChange());
	}

}
