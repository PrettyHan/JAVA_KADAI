package mvc.java.kadai.se.cat01.sec05_class.no010;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic10Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic10.main(new String[0]);

		// Assert
		String expected = "◆本の情報" + JUnitPrintStream.LINE_SEPARATOR
				+ "タイトル：シンデレラ" + JUnitPrintStream.LINE_SEPARATOR
				+ "価格：900" + JUnitPrintStream.LINE_SEPARATOR
				+ "著者：OPST花子";
		assertEquals(expected, print.getActual());
	}

}
