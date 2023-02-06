package mvc.java.kadai.se.cat01.sec04_method.no015;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic15Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic15.main(new String[0]);

		// Assert
		String expected = "残高：800000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------"  + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：400000"  + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：100000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お金を引き出せません" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：100000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：0" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" ;
		assertEquals(expected, print.getActualNotChange());
	}

}
