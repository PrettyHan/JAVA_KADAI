package mvc.java.kadai.se.cat01.sec05_class.no028;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic28Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic28.main(new String[0]);

		// Assert
		String expected = "1/2/3/4/5/" + JUnitPrintStream.LINE_SEPARATOR
				+ "↓doTenTimesメソッドを使用すると各要素が10倍になります" + JUnitPrintStream.LINE_SEPARATOR
				+ "10/20/30/40/50/";
		assertEquals(expected, print.getActual());
	}

}
