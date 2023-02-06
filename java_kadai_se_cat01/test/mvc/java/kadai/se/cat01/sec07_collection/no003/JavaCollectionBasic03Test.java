package mvc.java.kadai.se.cat01.sec07_collection.no003;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaCollectionBasic03Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaCollectionBasic03.main(new String[0]);

		// Assert
		String expected = "1/2/3/4/5/6/7/8/9/10" + JUnitPrintStream.LINE_SEPARATOR
				+ "11/12/13/14/15/16/17/18/19/20" + JUnitPrintStream.LINE_SEPARATOR
				+ "21/22/23/24/25/26/27/28/29/30";
		assertEquals(expected, print.getActual());
	}

}
