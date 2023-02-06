package mvc.java.kadai.se.cat01.sec03_array.no007;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic07Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic07.main(new String[0]);

		// Assert
		String expected = "おはよう" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんばんは";
		assertEquals(expected, print.getActualNotChange());
	}

}
