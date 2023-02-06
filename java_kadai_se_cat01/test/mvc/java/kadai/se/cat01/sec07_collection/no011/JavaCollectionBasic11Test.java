package mvc.java.kadai.se.cat01.sec07_collection.no011;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic11Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic11.main(new String[0]);

		// Assert
		String expected = "[原正人]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[岸川千絵]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[杉山洋一]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[白木美緒]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[一宮眞一]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[下山麗華]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "◆従業員一覧" + JUnitPrintStream.LINE_SEPARATOR
				+ "原正人(24)" + JUnitPrintStream.LINE_SEPARATOR
				+ "岸川千絵(31)" + JUnitPrintStream.LINE_SEPARATOR
				+ "杉山洋一(45)" + JUnitPrintStream.LINE_SEPARATOR
				+ "白木美緒(27)" + JUnitPrintStream.LINE_SEPARATOR
				+ "一宮眞一(36)" + JUnitPrintStream.LINE_SEPARATOR
				+ "下山麗華(28)";

		assertEquals(expected, print.getActual());
	}

}
