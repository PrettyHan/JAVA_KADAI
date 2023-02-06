package mvc.java.kadai.se.cat02.sec01_algorithm.no020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm20 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// キーボード入力
			String line = reader.readLine();
			// 数値への変換
			int sample = Integer.parseInt(line);
			System.out.println(sample);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
