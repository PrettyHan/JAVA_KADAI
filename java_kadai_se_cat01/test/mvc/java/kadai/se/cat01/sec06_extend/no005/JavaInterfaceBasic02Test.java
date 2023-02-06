package mvc.java.kadai.se.cat01.sec06_extend.no005;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaInterfaceBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaInterfaceBasic02.main(new String[0]);

		// Assert
		String expected = "こんにちは！";
		assertEquals(expected, print.getActual());
	}

}
