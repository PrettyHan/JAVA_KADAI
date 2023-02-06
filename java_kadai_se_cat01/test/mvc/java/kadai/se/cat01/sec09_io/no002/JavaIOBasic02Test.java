package mvc.java.kadai.se.cat01.sec09_io.no002;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.JUnitInputStream;
import util.JUnitPrintStream;

class JavaIOBasic02Test {

	@BeforeAll
	public static void beforeAll() {
		// useIOwriter.txt を削除しておく
		File file = new File("useIOwriter.txt");
		file.delete();
	}

	@Test
	public void mainTest() throws Exception {

		JUnitPrintStream print = new JUnitPrintStream(System.out);

		// Act
		System.setOut(print);
		JUnitInputStream input = new JUnitInputStream();
		System.setIn(input);
		String expected = "予約を承ります。氏名を入力してください："
				+ "予約を完了しました(useIOwriter.txtを確認)";
		//		1度目の入力
		input.typeLine("OPST-1");
		JavaIOBasic02.main(new String[0]);
		assertEquals(expected, print.getActual());

		//		2度目の入力
		input.typeLine("OPST-2");
		JavaIOBasic02.main(new String[0]);
		expected += "予約を承ります。氏名を入力してください："
				+ "予約を完了しました(useIOwriter.txtを確認)";
		assertEquals(expected, print.getActual());

		try {
			// ファイルの内容を取得
			Path path = Paths.get("useIOwriter.txt");
			List<String> actualText = Files.readAllLines(path, StandardCharsets.UTF_8);
			String[] strArrayText = { "OPST-1", "OPST-2" };
			List<String> expectedText = Arrays.asList(strArrayText);
			assertEquals(expectedText.size(),actualText.size());
			for (int i = 0; i < expectedText.size(); i++) {
				assertEquals(expectedText.get(i), actualText.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
