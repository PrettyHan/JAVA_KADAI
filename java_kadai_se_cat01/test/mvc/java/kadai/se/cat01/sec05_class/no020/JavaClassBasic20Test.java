package mvc.java.kadai.se.cat01.sec05_class.no020;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic20Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic20.main(new String[0]);

		// Assert
		String expected = "貯金が1000000円あります" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お引き出し金額：200000" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：800000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お引き出し金額：400000" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：400000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お引き出し金額：300000" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：100000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お引き出し金額：100001" + JUnitPrintStream.LINE_SEPARATOR
				+ "お金を引き出せません" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：100000" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "お引き出し金額：100000" + JUnitPrintStream.LINE_SEPARATOR
				+ "残高：0" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------";
		assertEquals(expected, print.getActual());
	}

}
