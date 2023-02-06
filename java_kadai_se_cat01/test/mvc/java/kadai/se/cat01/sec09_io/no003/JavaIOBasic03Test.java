package mvc.java.kadai.se.cat01.sec09_io.no003;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.JUnitInputStream;
import util.JUnitPrintStream;

class JavaIOBasic03Test {

	@BeforeAll
	public static void beforeAll() {
		/* useIOwriter.txt の内容を
		 * OPST-1
		 * OPST-2
		 * に変更する
		 */
		try (PrintWriter filePw = new PrintWriter(new BufferedWriter(new FileWriter("useIOwriter.txt", false)))) {
			filePw.println("OPST-1");
			filePw.println("OPST-2");
			filePw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void mainTestReservation1() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);
		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		input.typeLine("OPST-1");
		JavaIOBasic03.main(new String[0]);
		// Assert
		String expected = "予約をご確認します。氏名を入力してください："
				+ "OPST-1様ですね。お待ちしておりました。";
		assertEquals(expected, print.getActual());
	}

	@Test
	public void mainTestReservation2() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);
		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		input.typeLine("OPST-2");
		JavaIOBasic03.main(new String[0]);
		// Assert
		String expected = "予約をご確認します。氏名を入力してください："
				+ "OPST-2様ですね。お待ちしておりました。";
		assertEquals(expected, print.getActual());
	}

	@Test
	public void mainTestNoReservation() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);
		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		input.typeLine("OPST-3");
		JavaIOBasic03.main(new String[0]);
		// Assert
		String expected = "予約をご確認します。氏名を入力してください："
				+ "OPST-3様ですか…、大変申し訳ありませんが確認できませんでした。";
		assertEquals(expected, print.getActual());
	}
}
