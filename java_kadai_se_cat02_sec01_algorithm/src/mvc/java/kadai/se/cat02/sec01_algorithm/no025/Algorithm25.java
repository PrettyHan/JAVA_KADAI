package mvc.java.kadai.se.cat02.sec01_algorithm.no025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Algorithm25 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.println("配列のサイズを入力してください");
			System.out.print("サイズ:");
			String line = reader.readLine();
			int size = Integer.parseInt(line);

			System.out.println("配列を初期化する値を入力してください");
			System.out.print("値:");
			line = reader.readLine();
			int value = Integer.parseInt(line);
			int[] arr = new int[size];

			fillArray(arr,value);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fillArray( int[] arr, int value ) {
		for(int i=0 ; i < arr.length ; i++) {
			arr[i] = value;
			System.out.printf("x[%d]=%d%n",i,value);
		}
	}
}
