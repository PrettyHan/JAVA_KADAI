package mvc.java.kadai.se.cat02.sec01_algorithm.no023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm23 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.println("平行四辺形を作りましょう");

			System.out.print("横幅:");
			String line = reader.readLine();
			int width = Integer.parseInt(line);

			System.out.print("高さ:");
			line = reader.readLine();
			int height = Integer.parseInt(line);

			printChars(width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printChars( int w, int h ){
		for(int i = h ; i > 0 ; i-- ) {
			System.out.println(" ".repeat(i-1) + "+".repeat(w));
		}
	}
}
