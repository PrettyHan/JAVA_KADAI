package mvc.java.kadai.se.cat01.sec01_variable.no023;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaVariableBasic23Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<Double> actual = new ArrayList<Double>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void println(double flg) {
				actual.add(flg);
			}
		};

		// Act
		System.setOut(fakePrintStream);
		JavaVariableBasic23.main(new String[0]);

		// Assert
		List<Double> expected = Arrays.asList(10.5);
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
