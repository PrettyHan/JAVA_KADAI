package mvc.java.kadai.se.cat01.sec05_class.no012;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic12Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic12.main(new String[0]);

		// Assert
		String expected = "現在の体重：100kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "ランニングをしました" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在体重、95kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重：95kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "ウォーキングをしました" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在体重、92kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重：92kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "ランニングをしました" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在体重、87kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重：87kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "ウォーキングをしました" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在体重、84kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重：84kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "ランニングをしました" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在体重、79kg" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------";
		assertEquals(expected, print.getActual());
	}

}
