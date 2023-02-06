package mvc.java.kadai.se.cat01.sec07_collection.no004;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic04Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic04.main(new String[0]);

		// Assert
		String expected = "おはよう" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんにちは" + JUnitPrintStream.LINE_SEPARATOR
				+ "こんばんは";
		assertEquals(expected, print.getActual());
	}

}
