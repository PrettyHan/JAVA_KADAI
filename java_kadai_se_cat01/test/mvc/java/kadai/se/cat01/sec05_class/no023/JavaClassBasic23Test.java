package mvc.java.kadai.se.cat01.sec05_class.no023;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic23Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic23.main(new String[0]);

		// Assert
		String expected = "貯金100000円からはじまります" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "貯金100000円から20000円を引き出しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "貯金残高は80000円です" + JUnitPrintStream.LINE_SEPARATOR
				+ "財布に20000円追加しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "今財布には20000円はいっています" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "貯金80000円から45000円を引き出しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "貯金残高は35000円です" + JUnitPrintStream.LINE_SEPARATOR
				+ "財布に45000円追加しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "今財布には65000円はいっています";
		assertEquals(expected, print.getActual());
	}

}
