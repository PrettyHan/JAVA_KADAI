package mvc.java.kadai.se.cat01.sec01_variable.no002;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic02Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Integer> actual = new ArrayList<Integer>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(int num) {
				actual.add(num);
			}
		};

		// Act
		System.setOut(fakePrintStream);

		JavaVariableBasic02.main(new String[0]);

		// Assert
		Integer expected = 10;
		assertEquals(expected, actual.get(0));
	}

}
