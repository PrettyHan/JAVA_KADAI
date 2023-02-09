package mvc.java.kadai.se.cat02.sec01_algorithm.no029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Algorithm29 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			System.out.println("文字を入力してください。");
			String line = reader.readLine();
			int length = line.length();
			String[] list = line.split("");
			HashMap<String, String> map = new HashMap<>();
			map.put("0", "");
			map.put("1", "");
			map.put("2", "");
			map.put("3", "");
			map.put("4", "");
			map.put("5", "");
			map.put("6", "");
			map.put("7", "");
			map.put("8", "");
			map.put("9", "");


			for(String str : list) {
				if(map.containsKey(str)){
					String tmp = map.get(str);
					map.put(str, tmp+"*");

				}
			}
			System.out.println("数字文字の出現回数");
			for (String key : map.keySet()){
				System.out.printf("'%s':%s%n", key, map.get(key));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
