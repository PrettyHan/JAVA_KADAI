package mvc.java.kadai.se.cat01.sec06_extend.no004;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaInterfaceBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaInterfaceBasic01.main(new String[0]);

		// Assert
		String expected = "JavaInterfaceBasic01ObjAImpl#printメソッドを呼び出しました。" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaInterfaceBasic01ObjAImpl#fugaメソッドを呼び出しました。" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaInterfaceBasic01ObjBImpl#printメソッドを呼び出しました"+ JUnitPrintStream.LINE_SEPARATOR
				+ "JavaInterfaceBasic01ObjBImpl#hogeメソッドを呼び出しました。";

		assertEquals(expected, print.getActual());
	}

}
