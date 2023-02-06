package mvc.java.kadai.se.cat01.sec03_array.no002;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic02.main(new String[0]);

		// Assert
		String expected = "△"  + JUnitPrintStream.LINE_SEPARATOR
				+ "〇"  + JUnitPrintStream.LINE_SEPARATOR
				+ "×";
		assertEquals(expected, print.getActual());
	}
}
