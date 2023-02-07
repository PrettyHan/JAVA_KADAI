package mvc.java.kadai.se.cat02.sec01_algorithm.no020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm20 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// キーボード入力
			int[] arr = new int[5];

			System.out.println("5人の点数を入力してください。");

			for(int i = 0 ; i < arr.length ; i ++) {
				String line = reader.readLine();
				int sample = Integer.valueOf(line);
				arr[i] = sample;
				System.out.printf("%d人目:%d%n",i+1,sample);

			}
			int min = minOf(arr);

			System.out.printf("最低点は%d点です。",min);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int minOf(int[] arr) {
		int min = arr[0];
		for(int score : arr) {
			min = min < score ? min : score;
		}

		return min;
	}
}
