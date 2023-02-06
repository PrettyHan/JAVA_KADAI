package mvc.java.kadai.se.cat02.sec01_algorithm.no023;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;

class Algorithm23Test {

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
			public void print(String str) {
				actual.add(str);
			}
			@Override
			public void print(char ch) {
				actual.add(String.valueOf(ch));
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("5"); //横幅
        input.typeLine("3"); //高さ

		// Act
		System.setOut(fakePrintStream);
		Algorithm23.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("平行四辺形を作りましょう",
				"横幅:","高さ:",
				" "," ","+","+","+","+","+",
				" ","+","+","+","+","+",
				"+","+","+","+","+");
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
			public void print(String str) {
				actual.add(str);
			}
			@Override
			public void print(char ch) {
				actual.add(String.valueOf(ch));
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("6"); //横幅
        input.typeLine("6"); //高さ

		// Act
		System.setOut(fakePrintStream);
		Algorithm23.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("平行四辺形を作りましょう",
				"横幅:","高さ:",
				" "," "," "," "," ","+","+","+","+","+","+",
				" "," "," "," ","+","+","+","+","+","+",
				" "," "," ","+","+","+","+","+","+",
				" "," ","+","+","+","+","+","+",
				" ","+","+","+","+","+","+",
				"+","+","+","+","+","+");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
