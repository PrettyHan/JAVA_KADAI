package mvc.java.kadai.se.cat02.sec01_algorithm.no022;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;

class Algorithm22Test {

	/**
	 * 実行例①
	 *
	 * @throws Exception
	 */
	@Test
	public void mainTest1() throws Exception {
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(String str) {
				actual.add(str);
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("35");
        input.typeLine("17");

		// Act
		System.setOut(fakePrintStream);
		Algorithm22.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("2つの整数を入力してください。",
				"中間値は26です");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

	/**
	 * 実行例②
	 *
	 * @throws Exception
	 */
	@Test
	public void mainTest2() throws Exception {
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(String str) {
				actual.add(str);
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("36");
        input.typeLine("17");

		// Act
		System.setOut(fakePrintStream);
		Algorithm22.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("2つの整数を入力してください。",
				"中間値は27です");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
