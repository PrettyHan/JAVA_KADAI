package mvc.java.kadai.se.cat02.sec01_algorithm.no021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm21 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("小数を入力してください");
			// キーボード入力
			String line = reader.readLine();
			System.out.printf("小数:%s%n", line);
			Double sample = Double.valueOf(line);
			int answer = round(sample);
			System.out.printf("四捨五入すると%dです。", answer);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int round(double x) {
		char str = String.valueOf(x).charAt(2);
		int num = Character.getNumericValue(str);
		if(num >= 5) {
			x = (x + 1) - (num * 0.1);
		}
		else {
			x = x - (num * 0.1);
		}

		return (int) x;
	}

}
