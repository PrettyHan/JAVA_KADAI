package mvc.java.kadai.se.cat01.sec03_array.no001;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JavaArrayBasic01Test {

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
		JavaArrayBasic01.main(new String[0]);

		// Assert
		List<Integer> expected = Arrays.asList(12, 34, 56);
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
		assertEquals(expected.size(), actual.size());
	}

}
