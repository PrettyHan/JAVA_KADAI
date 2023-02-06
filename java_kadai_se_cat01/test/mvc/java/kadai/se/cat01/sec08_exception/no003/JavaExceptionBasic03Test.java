package mvc.java.kadai.se.cat01.sec08_exception.no003;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaExceptionBasic03Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaExceptionBasic03.main(new String[0]);

		// Assert
		String expected = "JavaExceptionBasic03ObjA#divideメソッドです。9÷3＝3" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjA#divideメソッドです。22÷2＝11" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjB#divideメソッドです。10÷1＝10" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjB#divideメソッドです。0で割ることはできません。" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjC#divideメソッドです。9÷3＝3" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjC#divideメソッドです。22÷2＝11" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjA#divideメソッドです。10÷1＝10" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjA#divideメソッドです。0で割ることはできません。" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjB#divideメソッドです。9÷3＝3" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjB#divideメソッドです。22÷2＝11" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjC#divideメソッドです。10÷1＝10" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExceptionBasic03ObjC#divideメソッドです。0で割ることはできません。";
		assertEquals(expected, print.getActual());
	}

}
