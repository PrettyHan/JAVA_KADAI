package mvc.java.kadai.se.cat01.sec01_variable.no020;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic20Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Character> actual = new ArrayList<Character>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(char str) {
				actual.add(str);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic20.main(new String[0]);

		// Assert
		List<Character> expected = Arrays.asList('男');
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
