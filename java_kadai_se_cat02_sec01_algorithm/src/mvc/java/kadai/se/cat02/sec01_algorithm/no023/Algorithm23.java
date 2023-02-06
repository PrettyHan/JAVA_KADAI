package mvc.java.kadai.se.cat02.sec01_algorithm.no023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm23 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.print("横幅:");
			String line = reader.readLine();
			int width = Integer.parseInt(line);

			System.out.print("高さ:");
			line = reader.readLine();
			int height = Integer.parseInt(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
