package mvc.java.kadai.se.cat02.sec01_algorithm.no025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm25 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.print("サイズ:");
			String line = reader.readLine();
			int size = Integer.parseInt(line);

			System.out.print("値:");
			line = reader.readLine();
			int value = Integer.parseInt(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
