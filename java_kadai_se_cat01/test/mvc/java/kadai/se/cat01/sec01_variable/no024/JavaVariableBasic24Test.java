package mvc.java.kadai.se.cat01.sec01_variable.no024;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic24Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(int num) {
				actual.add(String.valueOf(num));
			}

			@Override
			public void println(double num) {
				actual.add(String.valueOf(num));
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic24.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList("2", "2.0", "2.5");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
