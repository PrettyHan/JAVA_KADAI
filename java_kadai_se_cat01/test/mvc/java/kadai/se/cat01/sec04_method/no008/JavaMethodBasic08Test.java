package mvc.java.kadai.se.cat01.sec04_method.no008;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic08Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic08.main(new String[0]);

		// Assert
		String expected = "16";
		assertEquals(expected, print.getActual());
	}

}
