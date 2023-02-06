package mvc.java.kadai.se.cat01.sec04_method.no003;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic03Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic03.main(new String[0]);

		// Assert
		String expected = "UseJavaMethod03#showMessage(String msg, String num)" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは！" + JUnitPrintStream.LINE_SEPARATOR
				+ "300";
		assertEquals(expected, print.getActualNotChange());
	}

}
