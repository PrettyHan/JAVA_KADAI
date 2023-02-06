package util;

import java.io.OutputStream;
import java.io.PrintStream;

public class JUnitPrintStream extends PrintStream {

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/** 出力内容を保持する */
	private StringBuilder actual = new StringBuilder();

	/** コンストラクタ */
	public JUnitPrintStream(OutputStream out) {
		super(out);
	}

	@Override
	public void print(String str) {
		actual.append(str);
	}

	@Override
	public void println() {
		actual.append(LINE_SEPARATOR);
	}

	@Override
	public void println(String str) {
		actual.append(str);
		actual.append(LINE_SEPARATOR);
	}

	@Override
	public void print(int num) {
		actual.append(String.valueOf(num));
	}

	@Override
	public void println(int num) {
		actual.append(String.valueOf(num));
		actual.append(LINE_SEPARATOR);
	}

	@Override
	public void print(char ch) {
		actual.append(String.valueOf(ch));
	}

	@Override
	public void println(char ch) {
		actual.append(String.valueOf(ch));
		actual.append(LINE_SEPARATOR);
	}

	/** 空白ありの出力結果を取得 */
	public String getActualNotChange() {
		String actualStr = actual.toString();
		// 文末に改行コードがあった場合に除去する
		if(actualStr.endsWith(LINE_SEPARATOR)) {
			actualStr = actualStr.substring(0, actualStr.length() - LINE_SEPARATOR.length());
		}
		return actualStr;
	}


	/** 空白(半角スペース、全角スペース、タグ)なしの出力結果を取得 */
	public String getActual() {
		String actualStr = getActualNotChange();
		actualStr = actualStr.replaceAll("\\t", "");
		actualStr = actualStr.replaceAll("　", "");
		actualStr = actualStr.replaceAll(" ", "");
		return actualStr;
	}

}
