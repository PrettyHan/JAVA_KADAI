package mvc.java.kadai.se.cat01.sec09_io.no001;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;
import util.JUnitPrintStream;

class JavaIOBasic01Test {

	@Test
	public void mainTestEmpty() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		input.typeLine("");
		JavaIOBasic01.main(new String[0]);

		// Assert
		String expected = "氏名を入力してください："
				+ "氏名は必ず入力してください";

		assertEquals(expected, print.getActual());
	}

	@Test
	public void mainTestWorkOver20() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		input.typeLine("OPST太郎あああああああああああああああ");
		JavaIOBasic01.main(new String[0]);
		// Assert
		String expected = "氏名を入力してください："
				+ "氏名は20文字以内で入力してください";

		assertEquals(expected, print.getActual());


	}

	@Test
	public void mainTestCorrectInput() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		input.typeLine("OPST");
		JavaIOBasic01.main(new String[0]);

		// Assert
		String expected = "氏名を入力してください："
				+ "氏名->OPST";

		assertEquals(expected, print.getActual());

	}
}