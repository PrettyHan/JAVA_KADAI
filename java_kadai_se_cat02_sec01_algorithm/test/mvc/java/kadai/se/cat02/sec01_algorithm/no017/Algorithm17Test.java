package mvc.java.kadai.se.cat02.sec01_algorithm.no017;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Algorithm17Test {

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
		Algorithm17.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"9",
				" ","8",
				" "," ","7",
				" "," "," ","6",
				" "," "," "," ","5",
				" "," "," "," "," ","4",
				" "," "," "," "," "," ","3",
				" "," "," "," "," "," "," ","2",
				" "," "," "," "," "," "," "," ","1",
				"===================================",
				"12",
				" ","11",
				" "," ","10",
				" "," "," ","9",
				" "," "," "," ","8",
				" "," "," "," "," ","7",
				" "," "," "," "," "," ","6",
				" "," "," "," "," "," "," ","5",
				" "," "," "," "," "," "," "," ","4",
				" "," "," "," "," "," "," "," "," ","3",
				" "," "," "," "," "," "," "," "," "," ","2",
				" "," "," "," "," "," "," "," "," "," "," ","1");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
