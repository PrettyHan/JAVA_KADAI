package mvc.java.kadai.se.cat01.sec04_method.no004;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic04Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic04.main(new String[0]);

		// Assert
		String expected = "UseJavaMethod04#makeMessage()\nこんにちは！";
		assertEquals(expected, print.getActual());
	}

}
