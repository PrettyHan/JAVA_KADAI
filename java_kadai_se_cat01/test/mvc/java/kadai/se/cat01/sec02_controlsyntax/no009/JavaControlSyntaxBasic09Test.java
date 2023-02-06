package mvc.java.kadai.se.cat01.sec02_controlsyntax.no009;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaControlSyntaxBasic09Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaControlSyntaxBasic09.main(new String[0]);

		// Assert
		String expected = "2になりました" + JUnitPrintStream.LINE_SEPARATOR
				+ "8になりました";
		assertEquals(expected, print.getActual());

	}

}
