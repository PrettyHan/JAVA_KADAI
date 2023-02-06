package mvc.java.kadai.se.cat02.sec01_algorithm.no031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm31 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			String line = reader.readLine();
			int value_a = Integer.parseInt(line);

			line = reader.readLine();
			int value_b = Integer.parseInt(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
