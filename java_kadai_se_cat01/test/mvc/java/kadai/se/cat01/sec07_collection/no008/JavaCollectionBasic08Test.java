package mvc.java.kadai.se.cat01.sec07_collection.no008;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic08Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic08.main(new String[0]);

		// Assert
		String expected = "おえういあ";
		assertEquals(expected, print.getActual());
	}

}
