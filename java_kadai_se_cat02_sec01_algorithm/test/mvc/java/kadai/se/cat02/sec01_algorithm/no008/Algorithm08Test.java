package mvc.java.kadai.se.cat02.sec01_algorithm.no008;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Algorithm08Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void print(String str) {
				actual.add(str);
			}

			@Override
			public void print(int num) {
				actual.add(String.valueOf(num));
			}
		};

		// Act
		System.setOut(fakePrintStream);
		Algorithm08.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"大きいほうの値は83です。",
				"小さいほうの値は45です。",
				"===================================",
				"大きいほうの値は53です。",
				"小さいほうの値は28です。",
				"===================================",
				"両方とも28です。");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
