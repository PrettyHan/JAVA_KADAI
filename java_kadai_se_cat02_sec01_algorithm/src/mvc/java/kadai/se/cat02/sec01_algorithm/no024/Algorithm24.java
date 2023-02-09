package mvc.java.kadai.se.cat02.sec01_algorithm.no024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm24 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			String line = reader.readLine();
			int num = Integer.parseInt(line);

			int answer = factorial(num);

			System.out.printf("%d!=%d%n", num, answer);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int factorial(int num) {
		int fato = 1 ;

		for(int i=num ; i>0 ; i--) {
			fato *= i;
		}
		return fato;
	}
}
