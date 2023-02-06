package mvc.java.kadai.se.cat01.sec01_variable.no022;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic22Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Integer> actual = new ArrayList<Integer>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(int str) {
				actual.add(str);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic22.main(new String[0]);

		// Assert
		Integer expected = 10;
		assertEquals(expected, actual.get(0));
	}
}
