package mvc.java.kadai.se.cat01.sec01_variable.no026;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic26Test {

	@Test
	public void mainTest() throws Exception {
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
			public void println(char s) {
				actual.add(String.valueOf(s));
			}

			@Override
			public void println(boolean flg) {
				actual.add(String.valueOf(flg));
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic26.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("OPST 太郎", "20", "男", "false");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
