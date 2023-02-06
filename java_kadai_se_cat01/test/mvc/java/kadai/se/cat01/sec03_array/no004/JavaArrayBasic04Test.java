package mvc.java.kadai.se.cat01.sec03_array.no004;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic04Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic04.main(new String[0]);

		// Assert
		String expected = "〇" + "△" + "□";
		assertEquals(expected, print.getActual());
	}

}
