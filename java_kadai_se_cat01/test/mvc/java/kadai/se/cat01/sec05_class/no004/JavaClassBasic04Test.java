package mvc.java.kadai.se.cat01.sec05_class.no004;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic04Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);
		// Act
		System.setOut(print);
		JavaClassBasic04.main(new String[0]);

		// Assert
		String expected = "JavaClassBasic04Sub#makeMessage()\nこんにちは！";
		assertEquals(expected, print.getActual());
	}

}
