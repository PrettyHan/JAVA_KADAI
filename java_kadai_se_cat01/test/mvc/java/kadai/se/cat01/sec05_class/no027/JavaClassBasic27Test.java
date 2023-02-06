package mvc.java.kadai.se.cat01.sec05_class.no027;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic27Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic27.main(new String[0]);

		// Assert
		String expected = "3/6/9/12/15/18/21/24/27/30/" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "5/10/15/20/25/30/";
		assertEquals(expected, print.getActual());
	}

}
