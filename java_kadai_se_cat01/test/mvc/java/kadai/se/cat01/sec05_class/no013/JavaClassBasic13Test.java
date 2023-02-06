package mvc.java.kadai.se.cat01.sec05_class.no013;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaClassBasic13Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaClassBasic13.main(new String[0]);

		// Assert
		String expected = "猫のタマがニャーと鳴いた"  + JUnitPrintStream.LINE_SEPARATOR
				+ "猫のタマは1才でしたが、2才になりました" + JUnitPrintStream.LINE_SEPARATOR
				+ "猫のタマは2才でしたが、3才になりました" + JUnitPrintStream.LINE_SEPARATOR
				+ "猫のタマは3才でしたが、4才になりました";
		assertEquals(expected, print.getActual());
	}

}
