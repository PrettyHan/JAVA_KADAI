package mvc.java.kadai.se.cat01.sec07_collection.no006;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic06Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic06.main(new String[0]);

		// Assert
		String expected = "◆点数一覧" + JUnitPrintStream.LINE_SEPARATOR
				+ "1人目、Aさん:53点" + JUnitPrintStream.LINE_SEPARATOR
				+ "2人目、Bさん:49点" + JUnitPrintStream.LINE_SEPARATOR
				+ "3人目、Cさん:21点" + JUnitPrintStream.LINE_SEPARATOR
				+ "4人目、Dさん:91点" + JUnitPrintStream.LINE_SEPARATOR
				+ "5人目、Eさん:77点" + JUnitPrintStream.LINE_SEPARATOR
				+ "⇒平均点：58点";
		assertEquals(expected, print.getActual());
	}

}
