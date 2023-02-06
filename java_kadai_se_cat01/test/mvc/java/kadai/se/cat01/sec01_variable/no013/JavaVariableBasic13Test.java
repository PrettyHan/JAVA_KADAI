package mvc.java.kadai.se.cat01.sec01_variable.no013;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaVariableBasic13Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaVariableBasic13.main(new String[0]);

		// Assert
		String expected = "合計値は35";
		assertEquals(expected, print.getActual());
	}

}
