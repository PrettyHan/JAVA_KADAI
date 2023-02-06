package mvc.java.kadai.se.cat01.sec07_collection.no005;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic05Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic05.main(new String[0]);

		// Assert
		String expected = "おはよう" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんばんは";
		assertEquals(expected, print.getActual());
	}
}
