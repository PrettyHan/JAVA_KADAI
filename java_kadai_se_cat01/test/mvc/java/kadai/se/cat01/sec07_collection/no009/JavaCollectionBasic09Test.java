package mvc.java.kadai.se.cat01.sec07_collection.no009;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic09Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic09.main(new String[0]);

		// Assert
		String expected = "[1]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[2]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[3]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[4]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[5]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "合計:15" + JUnitPrintStream.LINE_SEPARATOR
				+ "[6]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[7]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[8]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[9]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[10]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[11]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[12]を格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "合計:78";

		assertEquals(expected, print.getActual());
	}

}
