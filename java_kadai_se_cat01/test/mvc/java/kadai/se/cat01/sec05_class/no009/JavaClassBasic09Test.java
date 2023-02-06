package mvc.java.kadai.se.cat01.sec05_class.no009;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic09Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic09.main(new String[0]);

		// Assert
		String expected = "9" + JUnitPrintStream.LINE_SEPARATOR
				+ "59774" + JUnitPrintStream.LINE_SEPARATOR
				+ "10000";
		assertEquals(expected, print.getActual());
	}

}
