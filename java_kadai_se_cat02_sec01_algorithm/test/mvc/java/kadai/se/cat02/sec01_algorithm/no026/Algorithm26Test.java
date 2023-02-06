package mvc.java.kadai.se.cat02.sec01_algorithm.no026;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;

class Algorithm26Test {

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

			@Override
			public void println(int num) {
				actual.add(String.valueOf(num));
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("5");
        input.typeLine("1");
        input.typeLine("3");
        input.typeLine("5");
        input.typeLine("7");
        input.typeLine("9");

		// Act
		System.setOut(fakePrintStream);
		Algorithm26.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("配列のサイズを入力してください",
				"値を入力してください",
				"リバースしました",
				"x[0]=9",
				"x[1]=7",
				"x[2]=5",
				"x[3]=3",
				"x[4]=1");
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

			@Override
			public void println(int num) {
				actual.add(String.valueOf(num));
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("3");
        input.typeLine("3");
        input.typeLine("6");
        input.typeLine("9");

		// Act
		System.setOut(fakePrintStream);
		Algorithm26.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("配列のサイズを入力してください",
				"値を入力してください",
				"リバースしました",
				"x[0]=9",
				"x[1]=6",
				"x[2]=3");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
