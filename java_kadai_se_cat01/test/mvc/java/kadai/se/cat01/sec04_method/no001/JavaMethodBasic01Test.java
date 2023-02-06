package mvc.java.kadai.se.cat01.sec04_method.no001;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic01.main(new String[0]);

		// Assert
		String expected = "UseJavaMethod01Sub#showMessage()" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは！";
		assertEquals(expected, print.getActualNotChange());
	}

}
