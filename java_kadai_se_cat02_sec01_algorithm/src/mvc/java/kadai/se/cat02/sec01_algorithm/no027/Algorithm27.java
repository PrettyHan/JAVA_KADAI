package mvc.java.kadai.se.cat02.sec01_algorithm.no027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm27 {

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
 			System.out.println("コピーしてリバースしました");
 			reverseArrayCopy(arr);

 			System.out.println("元の配列を表示します");
 			for(int i = 0 ; i < size ; i++) {
 				System.out.println("x["+i+"]="+arr[i]);
 			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int[] reverseArrayCopy( int[] arr ) {
		int[] reverseArr = Arrays.copyOf(arr, arr.length);
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
        	System.out.printf("x[%d]=%d%n",j, arr[i]);
            reverseArr[j] = arr[i];
        }
        return reverseArr;
	}
}
