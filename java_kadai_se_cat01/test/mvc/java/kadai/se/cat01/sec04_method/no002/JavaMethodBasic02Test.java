package mvc.java.kadai.se.cat01.sec04_method.no002;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic02.main(new String[0]);

		// Assert
		String expected = "UseJavaMethod02#showMessage(String msg)" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは！";
		assertEquals(expected, print.getActualNotChange());
	}

}
