package mvc.java.kadai.se.cat02.sec01_algorithm.no028;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import util.JUnitInputStream;

class Algorithm28Test {

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
        input.typeLine("0"); //xサイズ
        input.typeLine("3"); //yサイズ
        input.typeLine("1"); //y[0]
        input.typeLine("2"); //y[1]
        input.typeLine("3"); //y[2]

		// Act
		System.setOut(fakePrintStream);
		Algorithm28.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"値を入力してください",
				"値を入力してください",
				"連結して新しい配列を作成しました。",
				"z[0]=1",
				"z[1]=2",
				"z[2]=3",
				"元の配列を表示します。",
				"y[0]=1",
				"y[1]=2",
				"y[2]=3");
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
        input.typeLine("3"); //xサイズ
        input.typeLine("3"); //x[0]
        input.typeLine("6"); //x[1]
        input.typeLine("9"); //x[2]
        input.typeLine("2"); //yサイズ
        input.typeLine("2"); //y[0]
        input.typeLine("4"); //y[1]

		// Act
		System.setOut(fakePrintStream);
		Algorithm28.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"値を入力してください",
				"値を入力してください",
				"連結して新しい配列を作成しました。",
				"z[0]=3",
				"z[1]=6",
				"z[2]=9",
				"z[3]=2",
				"z[4]=4",
				"元の配列を表示します。",
				"x[0]=3",
				"x[1]=6",
				"x[2]=9",
				"y[0]=2",
				"y[1]=4");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
