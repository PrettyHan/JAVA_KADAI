package mvc.java.kadai.se.cat02.sec01_algorithm.no031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm31 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("整数A:");
			String line = reader.readLine();
			int value_a = Integer.parseInt(line);
			System.out.print("整数B:");
			line = reader.readLine();
			int value_b = Integer.parseInt(line);

			int[]ans = {(value_a + value_b),
					(value_a - value_b),
					(value_a * value_b),
					(value_a / value_b),
					(value_a % value_b)
					};
			calculate(value_a, value_b, ans);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void calculate( int x, int y, int[] ans ){
		String[] strlist = {"和","差","積","商","余"};
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%s:%d%n",strlist[i],ans[i]);
		}


	}
}
