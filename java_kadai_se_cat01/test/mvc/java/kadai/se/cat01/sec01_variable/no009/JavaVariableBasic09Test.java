package mvc.java.kadai.se.cat01.sec01_variable.no009;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic09Test {

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
		JavaVariableBasic09.main(new String[0]);

		// Assert

		boolean expected = false;
		assertEquals(expected, actual.get(0));
	}

}
