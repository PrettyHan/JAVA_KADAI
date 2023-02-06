package mvc.java.kadai.se.cat01.sec04_method.no006;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic06Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic06.main(new String[0]);

		// Assert
		String expected = "おはようございます！";
		assertEquals(expected, print.getActual());
	}

}
