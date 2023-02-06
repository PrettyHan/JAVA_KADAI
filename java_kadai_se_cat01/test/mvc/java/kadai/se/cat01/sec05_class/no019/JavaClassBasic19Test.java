package mvc.java.kadai.se.cat01.sec05_class.no019;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic19Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic19.main(new String[0]);

		// Assert
		String expected = "◆本の情報" + JUnitPrintStream.LINE_SEPARATOR
				+ "タイトル：桃太郎" + JUnitPrintStream.LINE_SEPARATOR
				+ "価格：800" + JUnitPrintStream.LINE_SEPARATOR
				+ "著者：OPST太郎";
		assertEquals(expected, print.getActual());
	}

}
