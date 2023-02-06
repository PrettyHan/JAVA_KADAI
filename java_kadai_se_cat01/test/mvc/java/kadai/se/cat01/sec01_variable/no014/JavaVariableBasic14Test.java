package mvc.java.kadai.se.cat01.sec01_variable.no014;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic14Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Boolean> actual = new ArrayList<Boolean>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(boolean flg) {
				actual.add(flg);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic14.main(new String[0]);

		// Assert
		List<Boolean> expected = Arrays.asList(true, false);
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
