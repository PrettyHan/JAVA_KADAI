package mvc.java.kadai.se.cat01.sec08_exception.no001;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaExceptionBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaExceptionBasic01.main(new String[0]);

		// Assert
		String expected = "10÷5＝2" + JUnitPrintStream.LINE_SEPARATOR
				+ "0で割ることはできません。" + JUnitPrintStream.LINE_SEPARATOR
				+ "3÷1＝3";

		assertEquals(expected, print.getActual());
	}

}
