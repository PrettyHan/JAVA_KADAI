package mvc.java.kadai.se.cat01.sec05_class.no002;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic02.main(new String[0]);

		// Assert
		String expected = "JavaClassBasic02Sub#showMessage(String msg)" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは！";

		assertEquals(expected, print.getActualNotChange());
	}
}