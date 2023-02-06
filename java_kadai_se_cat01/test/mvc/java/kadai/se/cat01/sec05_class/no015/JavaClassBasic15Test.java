package mvc.java.kadai.se.cat01.sec05_class.no015;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic15Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic15.main(new String[0]);

		// Assert
		String expected ="◆CDの情報" + JUnitPrintStream.LINE_SEPARATOR
				+ "タイトル：OPSTの歌" + JUnitPrintStream.LINE_SEPARATOR
				+ "価格：300" + JUnitPrintStream.LINE_SEPARATOR
				+ "アーティスト：OPSTバンド";
		assertEquals(expected, print.getActual());
	}

}
