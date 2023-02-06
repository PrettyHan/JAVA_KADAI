package mvc.java.kadai.se.cat01.sec04_method.no014;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic14Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic14.main(new String[0]);

		// Assert
		String expected = "1　2　3　"  + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "1　2　3　4　5　6　" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "1　2　3　4　5　6　7　8　9　10　11　12　" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------";

		assertEquals(expected, print.getActualNotChange());
	}
}