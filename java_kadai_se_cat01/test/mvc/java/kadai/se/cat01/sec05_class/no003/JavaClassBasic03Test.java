package mvc.java.kadai.se.cat01.sec05_class.no003;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic03Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic03.main(new String[0]);

		// Assert
		String expected = "JavaClassBasic03Sub#showMessage(String msg, int num)" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは！" + JUnitPrintStream.LINE_SEPARATOR
				+ "300";
		assertEquals(expected, print.getActualNotChange());
	}

}
