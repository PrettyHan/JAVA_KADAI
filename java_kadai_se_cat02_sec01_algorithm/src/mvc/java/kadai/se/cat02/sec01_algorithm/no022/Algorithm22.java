package mvc.java.kadai.se.cat02.sec01_algorithm.no022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm22 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.print("整数1:");
			String line = reader.readLine();
			int num1 = Integer.parseInt(line);

			System.out.print("整数2:");
			line = reader.readLine();
			int num2 = Integer.parseInt(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
