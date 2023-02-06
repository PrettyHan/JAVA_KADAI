package mvc.java.kadai.se.cat01.sec03_array.no008;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic08Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic08.main(new String[0]);

		// Assert
		String expected = "◆点数一覧" + JUnitPrintStream.LINE_SEPARATOR
				+ "1人目:53点" + JUnitPrintStream.LINE_SEPARATOR
				+ "2人目:49点" + JUnitPrintStream.LINE_SEPARATOR
				+ "3人目:21点" + JUnitPrintStream.LINE_SEPARATOR
				+ "4人目:91点" + JUnitPrintStream.LINE_SEPARATOR
				+ "5人目:77点" + JUnitPrintStream.LINE_SEPARATOR
				+ "⇒平均点：58点";
		assertEquals(expected, print.getActualNotChange());
	}

}
