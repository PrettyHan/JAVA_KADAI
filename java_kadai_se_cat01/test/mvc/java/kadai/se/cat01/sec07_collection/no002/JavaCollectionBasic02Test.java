package mvc.java.kadai.se.cat01.sec07_collection.no002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic02.main(new String[0]);

		// Assert
		String expected = "Circle:〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "Triangle:△" + JUnitPrintStream.LINE_SEPARATOR
				+ "Square:□" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "Circle:〇" + JUnitPrintStream.LINE_SEPARATOR
				+ "Triangle:△" + JUnitPrintStream.LINE_SEPARATOR
				+ "Square:□";
		assertEquals(expected, print.getActual());
	}
}
