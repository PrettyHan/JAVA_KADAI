package mvc.java.kadai.se.cat01.sec02_controlsyntax.no015;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaControlSyntaxBasic15Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Integer> actual = new ArrayList<Integer>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(int num) {
				actual.add(num);
			}

			@Override
			public void print(int num) {
				actual.add(num);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaControlSyntaxBasic15.main(new String[0]);

		// Assert
		Integer expected = 65;
		assertEquals(expected, actual.get(0));
	}

}
