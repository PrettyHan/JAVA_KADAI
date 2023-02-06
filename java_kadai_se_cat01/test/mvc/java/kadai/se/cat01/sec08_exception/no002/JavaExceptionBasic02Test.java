package mvc.java.kadai.se.cat01.sec08_exception.no002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.JUnitPrintStream;

class JavaExceptionBasic02Test {

	@Test
	void testMain() throws Exception {
		JUnitPrintStream print = new JUnitPrintStream(System.out);

		System.setOut(print);
		JavaExceptionBasic02.main(new String[0]);

		String expected = "OverTheLimitExceptionをcatchしました。" + JUnitPrintStream.LINE_SEPARATOR
				+ "【システム上エラー】文字数の上限は10です。上限を超える文字列は利用できません。";
		assertEquals(expected, print.getActual());
	}

}
