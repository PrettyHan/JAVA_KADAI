package mvc.java.kadai.se.cat02.sec01_algorithm.no028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm28 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.print("配列のサイズを入力してください:");
			int size = Integer.parseInt(reader.readLine());
			int[] arr = new int[size];

			System.out.println("値を入力してください");
 			for(int i = 0 ; i < size ; i++) {
 				System.out.print("x["+i+"]=");
 				int value = Integer.parseInt(reader.readLine());
 				arr[i] = value;

			}
			System.out.print("配列のサイズを入力してください:");
			int size2 = Integer.parseInt(reader.readLine());
			int[] arr2 = new int[size2];

			System.out.println("値を入力してください");
 			for(int i = 0 ; i < size2 ; i++) {
 				System.out.print("y["+i+"]=");
 				int value = Integer.parseInt(reader.readLine());
 				arr2[i] = value;

			}

 			System.out.println("連結して新しい配列を作成しました。");
 			int[] joinArr = joinArrayCopy(arr, arr2);
 			for(int i = 0 ; i < joinArr.length ; i++) {
 				System.out.println("z["+i+"]="+joinArr[i]);
 			}

 			System.out.println("元の配列を表示します。");
 			for(int i = 0 ; i < size ; i++) {
 				System.out.println("x["+i+"]="+arr[i]);
 			}
 			for(int i = 0 ; i < size2 ; i++) {
 				System.out.println("y["+i+"]="+arr2[i]);
 			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int[] joinArrayCopy(int[] arr, int[] arr2 ) {
		int newSize = (arr.length) + (arr2.length);
		int[] newArr = new int[newSize];

		for(int i = 0 ; i < arr.length ; i++) {
			newArr[i] = arr[i];
		}
		for(int j = arr.length, i = 0 ; i < arr2.length ; j++, i++) {
			newArr[j] = arr2[i];
		}


        return newArr;
}
}
