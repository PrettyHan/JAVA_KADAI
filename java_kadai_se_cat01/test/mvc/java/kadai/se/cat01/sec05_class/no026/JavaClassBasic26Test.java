package mvc.java.kadai.se.cat01.sec05_class.no026;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic26Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic26.main(new String[0]);

		// Assert
		String expected = "[原正人]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[岸川千絵]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[杉山洋一]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[白木美緒]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "[一宮眞一]さんを格納しました" + JUnitPrintStream.LINE_SEPARATOR
				+ "これ以上格納できません" + JUnitPrintStream.LINE_SEPARATOR
				+ "◆従業員一覧" + JUnitPrintStream.LINE_SEPARATOR
				+ "原正人(24)" + JUnitPrintStream.LINE_SEPARATOR
				+ "岸川千絵(31)" + JUnitPrintStream.LINE_SEPARATOR
				+ "杉山洋一(45)" + JUnitPrintStream.LINE_SEPARATOR
				+ "白木美緒(27)" + JUnitPrintStream.LINE_SEPARATOR
				+ "一宮眞一(36)";
		assertEquals(expected, print.getActual());
	}

}
