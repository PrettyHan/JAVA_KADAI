package mvc.java.kadai.se.cat02.sec01_algorithm.no003;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Algorithm03Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream(System.out) {
			@Override
			public void print(String str) {
				actual.add(str);
			}

			@Override
			public void print(int num) {
				actual.add(String.valueOf(num));
			}
		};

		// Act
		System.setOut(fakePrintStream);
		Algorithm03.main(new String[0]);

		// Assert
		List<String> expected = Arrays.asList(
				"1	","2	","3	","4	","5	",
				"6	","7	","8	","9	","10	",
				"11	","12	","13	","14	","15	",
				"16	","17	","18	","19	","20	",
				"21	","22	","23	","24	","25	",
				"26	","27	",
				"===================================",
				"1	","2	","3	","4	",
				"5	","6	","7	","8	",
				"9	","10	","11	","12	",
				"13	","14	","15	","16	");
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
