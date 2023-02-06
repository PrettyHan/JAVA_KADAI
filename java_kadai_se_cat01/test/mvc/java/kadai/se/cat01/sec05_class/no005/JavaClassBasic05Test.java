package mvc.java.kadai.se.cat01.sec05_class.no005;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic05Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);
		// Act
		System.setOut(print);
		JavaClassBasic05.main(new String[0]);

		// Assert
		String expected = "JavaClassBasic05Sub#sumNumbers(int fst, int scd, int trd)" + JUnitPrintStream.LINE_SEPARATOR
				+ "50";
		assertEquals(expected, print.getActualNotChange());
	}

}
