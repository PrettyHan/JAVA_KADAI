package mvc.java.kadai.se.cat02.sec01_algorithm.no022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm22 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.println("2つの整数を入力してください。");
			System.out.print("整数1:");
			String line = reader.readLine();
			int num1 = Integer.parseInt(line);

			System.out.print("整数2:");
			line = reader.readLine();
			int num2 = Integer.parseInt(line);

			int answer = medium(num1, num2);
			System.out.printf("中間の値は%dです。", answer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int medium(int num1, int num2) {
		return (int) Math.round((num1+num2) / 2.0);
	}

}
