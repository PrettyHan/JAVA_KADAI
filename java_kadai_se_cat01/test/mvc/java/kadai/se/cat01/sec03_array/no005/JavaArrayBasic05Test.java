package mvc.java.kadai.se.cat01.sec03_array.no005;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaArrayBasic05Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaArrayBasic05.main(new String[0]);

		// Assert
		String expected = "1/2/3/4/5/6/7/8/9/10" + JUnitPrintStream.LINE_SEPARATOR
				+ "11/12/13/14/15/16/17/18/19/20" + JUnitPrintStream.LINE_SEPARATOR
				+ "21/22/23/24/25/26/27/28/29/30";
		assertEquals(expected, print.getActualNotChange());
	}

}
