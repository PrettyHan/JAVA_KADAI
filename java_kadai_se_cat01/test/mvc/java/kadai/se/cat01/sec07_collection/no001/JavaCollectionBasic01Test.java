package mvc.java.kadai.se.cat01.sec07_collection.no001;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic01.main(new String[0]);

		// Assert
		String expected = "〇△□";
		assertEquals(expected, print.getActual());
	}

}
