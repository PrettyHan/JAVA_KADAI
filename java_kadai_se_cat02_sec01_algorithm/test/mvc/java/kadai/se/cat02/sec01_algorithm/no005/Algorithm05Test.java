package mvc.java.kadai.se.cat02.sec01_algorithm.no005;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Algorithm05Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void print(String str) {
				actual.add(str);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		Algorithm05.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"素数である",
				"===================================",
				"素数ではない");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
