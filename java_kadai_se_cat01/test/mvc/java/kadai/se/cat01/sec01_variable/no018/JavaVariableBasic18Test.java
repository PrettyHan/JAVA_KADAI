package mvc.java.kadai.se.cat01.sec01_variable.no018;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic18Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Integer> actual = new ArrayList<>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(int num) {
				actual.add(num);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic18.main(new String[0]);

		// Assert
		int expected = 32767;

		assertEquals(expected, actual.get(0).intValue());
	}

}
