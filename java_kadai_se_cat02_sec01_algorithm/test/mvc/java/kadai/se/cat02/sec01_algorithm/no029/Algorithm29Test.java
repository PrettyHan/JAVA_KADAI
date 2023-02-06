package mvc.java.kadai.se.cat02.sec01_algorithm.no029;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;

class Algorithm29Test {

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
			@Override
			public void print(String str) {
				actual.add(str);
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("251jfs323idr9u733887409");

		// Act
		System.setOut(fakePrintStream);
		Algorithm29.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"文字を入力してください。",
				"数字文字の出現回数",
				"'0' : ", "*",
				"'1' : ", "*",
				"'2' : ", "*","*",
				"'3' : ", "*","*","*","*",
				"'4' : ", "*",
				"'5' : ", "*",
				"'6' : ",
				"'7' : ", "*","*",
				"'8' : ", "*","*",
				"'9' : ", "*","*"
				);
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
			@Override
			public void print(String str) {
				actual.add(str);
			}
		};

		JUnitInputStream input = new JUnitInputStream();
		// 自作の標準入力オブジェクトをセット
        System.setIn(input);
        // 入力したい値を引数に指定する
        input.typeLine("f25j;6900hcr7320h58j3803");

		// Act
		System.setOut(fakePrintStream);
		Algorithm29.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"文字を入力してください。",
				"数字文字の出現回数",
				"'0' : ", "*","*","*","*",
				"'1' : ",
				"'2' : ", "*","*",
				"'3' : ", "*","*","*",
				"'4' : ",
				"'5' : ", "*","*",
				"'6' : ", "*",
				"'7' : ", "*",
				"'8' : ", "*","*",
				"'9' : ", "*");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
