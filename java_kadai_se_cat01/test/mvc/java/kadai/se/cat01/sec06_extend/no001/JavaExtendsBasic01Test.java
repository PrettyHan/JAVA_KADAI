package mvc.java.kadai.se.cat01.sec06_extend.no001;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaExtendsBasic01Test {

	@Test
	public void mainTest() throws Exception {
		// Arrange
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JavaExtendsBasic01.main(new String[0]);

		// Assert
		String expected =  "JavaExtendsBasic01ObjAクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+  "〇*＊" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjBクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "▲*＊▲*＊" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------" + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjCクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "◇*＊◇*＊◇*＊" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------"  + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjDクラスです" + JUnitPrintStream.LINE_SEPARATOR
				+ "★*＊★*＊★*＊★*＊" + JUnitPrintStream.LINE_SEPARATOR
				+ "------------------------------"  + JUnitPrintStream.LINE_SEPARATOR
				+ "JavaExtendsBasic01ObjEクラスです"+ JUnitPrintStream.LINE_SEPARATOR
				+ "☆彡*＊☆彡*＊☆彡*＊☆彡*＊☆彡*＊" ;

		assertEquals(expected, print.getActual());
	}

}
