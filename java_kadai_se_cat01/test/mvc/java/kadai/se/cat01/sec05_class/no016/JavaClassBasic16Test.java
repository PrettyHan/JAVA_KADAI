package mvc.java.kadai.se.cat01.sec05_class.no016;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic16Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic16.main(new String[0]);

		// Assert
		String expected = "〇〇〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "〇〇〇〇〇〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "〇〇〇〇〇〇〇〇〇〇〇〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------";
		assertEquals(expected, print.getActual());
	}

}
