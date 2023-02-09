package mvc.java.kadai.se.cat02.sec01_algorithm.no026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm26 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.println("配列のサイズを入力してください");
			System.out.print("サイズ:");
			int size = Integer.parseInt(reader.readLine());
			int[] arr = new int[size];

			System.out.println("値を入力してください");
 			for(int i = 0 ; i < size ; i++) {
 				System.out.print("x["+i+"]=");
 				int value = Integer.parseInt(reader.readLine());
 				arr[i] = value;

			}
 			System.out.println("リバースしました");
 			reverseArray(arr);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reverseArray( int[] arr ) {
		int[] reverseArr = Arrays.copyOf(arr, arr.length);
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
        	System.out.printf("x[%d]=%d%n",j, arr[i]);
            reverseArr[j] = arr[i];
        }
        arr = Arrays.copyOf(reverseArr, reverseArr.length);
	}
}
