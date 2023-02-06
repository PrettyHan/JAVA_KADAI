package mvc.java.kadai.se.cat01.sec05_class.no007;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic07Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic07.main(new String[0]);

		// Assert
		String expected = "おはようございます！";
		assertEquals(expected, print.getActual());
	}

}
