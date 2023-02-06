package mvc.java.kadai.se.cat01.sec03_array.no009;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic09Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic09.main(new String[0]);

		// Assert
		String expected = "3/6/9/12/15/18/21/24/27/30/";
		assertEquals(expected, print.getActual());

	}

}
