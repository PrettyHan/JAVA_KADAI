package mvc.java.kadai.se.cat01.sec03_array.no006;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic06Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic06.main(new String[0]);

		// Assert
		String expected = "おえういあ";
		assertEquals(expected, print.getActual());
	}

}
