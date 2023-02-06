package mvc.java.kadai.se.cat01.sec04_method.no005;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic05Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic05.main(new String[0]);

		// Assert
		String expected = "UseJavaMethod05#sumNumbers(int fst, int scd, int trd)" + JUnitPrintStream.LINE_SEPARATOR
					+ "50";
		assertEquals(expected, print.getActualNotChange());

	}

}
