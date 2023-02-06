package mvc.java.kadai.se.cat01.sec04_method.no012;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic12Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic12.main(new String[0]);

		// Assert
		String expected = "〇〇〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------"  + JUnitPrintStream.LINE_SEPARATOR
				+ "〇〇〇〇〇〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "〇〇〇〇〇〇〇〇〇〇〇〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------";
		assertEquals(expected, print.getActualNotChange());
	}
}
