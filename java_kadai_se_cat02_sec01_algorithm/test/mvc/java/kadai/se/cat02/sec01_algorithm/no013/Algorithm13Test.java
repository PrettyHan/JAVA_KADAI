package mvc.java.kadai.se.cat02.sec01_algorithm.no013;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Algorithm13Test {

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
		Algorithm13.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"150cm	","45.0kg",
				"155cm	","49.5kg",
				"160cm	","54.0kg",
				"165cm	","58.5kg",
				"170cm	","63.0kg",
				"===================================",
				"140cm	","36.0kg",
				"150cm	","45.0kg",
				"160cm	","54.0kg",
				"170cm	","63.0kg",
				"180cm	","72.0kg");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
