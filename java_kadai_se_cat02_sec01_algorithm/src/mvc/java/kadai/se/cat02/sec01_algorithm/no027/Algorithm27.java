package mvc.java.kadai.se.cat02.sec01_algorithm.no027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm27 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.print("サイズ:");
			String line = reader.readLine();
			int size = Integer.parseInt(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
