package mvc.java.kadai.se.cat01.sec04_method.no016;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaMethodBasic16Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaMethodBasic16.main(new String[0]);

		// Assert
		String expected = "現状あなたに提案するダイエットプランはありません" + JUnitPrintStream.LINE_SEPARATOR
				+ "--------------------------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重は、【71kg】です" + JUnitPrintStream.LINE_SEPARATOR
				+ "1か月2kgのペースで減量すると、70kgまで1か月です" + JUnitPrintStream.LINE_SEPARATOR
				+ "--------------------------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重は、【72kg】です" + JUnitPrintStream.LINE_SEPARATOR
				+ "1か月2kgのペースで減量すると、70kgまで1か月です" + JUnitPrintStream.LINE_SEPARATOR
				+ "--------------------------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重は、【73kg】です" + JUnitPrintStream.LINE_SEPARATOR
				+ "1か月2kgのペースで減量すると、70kgまで2か月です" + JUnitPrintStream.LINE_SEPARATOR
				+ "--------------------------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重は、【100kg】です" + JUnitPrintStream.LINE_SEPARATOR
				+ "1か月2kgのペースで減量すると、70kgまで15か月です" + JUnitPrintStream.LINE_SEPARATOR
				+ "--------------------------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "現在の体重は、【115kg】です" + JUnitPrintStream.LINE_SEPARATOR
				+ "1か月2kgのペースで減量すると、70kgまで23か月です" + JUnitPrintStream.LINE_SEPARATOR
				+ "--------------------------------------------------";
		assertEquals(expected, print.getActualNotChange());
	}

}
