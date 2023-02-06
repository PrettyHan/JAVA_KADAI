package mvc.java.kadai.se.cat01.sec04_method.no009;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic09Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic09.main(new String[0]);

		// Assert
		String expected = "11" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "12" + JUnitPrintStream.LINE_SEPARATOR
				+"------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "13" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------";
		assertEquals(expected, print.getActual());
	}

}
