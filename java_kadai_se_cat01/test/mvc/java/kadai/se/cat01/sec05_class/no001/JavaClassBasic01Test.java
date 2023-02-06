package mvc.java.kadai.se.cat01.sec05_class.no001;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic01.main(new String[0]);

		// Assert
		String expected = "JavaClassBasic01Sub#showMessage()" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは！";
		assertEquals(expected, print.getActual());
	}
}