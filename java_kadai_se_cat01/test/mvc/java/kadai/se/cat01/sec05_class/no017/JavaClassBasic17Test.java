package mvc.java.kadai.se.cat01.sec05_class.no017;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic17Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic17.main(new String[0]);

		// Assert
		String expected = "◆JavaClassBasic17" + JUnitPrintStream.LINE_SEPARATOR
		        + "氏名：OPST太郎" + JUnitPrintStream.LINE_SEPARATOR
				+ "年齢：30" + JUnitPrintStream.LINE_SEPARATOR
				+ "性別：男" + JUnitPrintStream.LINE_SEPARATOR
				+ "住所：〒123-4567 東京都新宿区" + JUnitPrintStream.LINE_SEPARATOR
				+ "電話：03-1234-5678";
		assertEquals(expected, print.getActualNotChange());
	}

}
