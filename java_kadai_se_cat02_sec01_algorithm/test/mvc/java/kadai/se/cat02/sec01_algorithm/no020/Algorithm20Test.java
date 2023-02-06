package mvc.java.kadai.se.cat02.sec01_algorithm.no020;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;

class Algorithm20Test {

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
        input.typeLine("53");
        input.typeLine("49");
        input.typeLine("21");
        input.typeLine("91");
        input.typeLine("77");

		// Act
		System.setOut(fakePrintStream);
		Algorithm20.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("5人の点数を入力してください。",
				"最低点は21点です");
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
        input.typeLine("0");
        input.typeLine("-23");
        input.typeLine("-54");
        input.typeLine("-48");
        input.typeLine("-11");

		// Act
		System.setOut(fakePrintStream);
		Algorithm20.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("5人の点数を入力してください。",
				"最低点は-54点です");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
