package mvc.java.kadai.se.cat02.sec01_algorithm.no030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Algorithm30 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("文字を入力してください。");
			String line = reader.readLine();
			int length = line.length();
			String[] list = line.split("");
			int max_len = 0;

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

			for (String value : map.values()){
				max_len = value.length() > max_len ?  value.length() : max_len;
			}
			String[][] strlist = new String[max_len][10];

	        for(int i= 0, count = max_len; i<max_len; i++){
	            for(int j=0; j<=9; j++){
	            	if(map.get(j+ "").length() == count) {
	            		strlist[i][j]="*";
	            	}
	            	else if(i != 0 && strlist[i-1][j] == "*") {
	            		strlist[i][j]="*";
	            	}
	            	else {
	            		strlist[i][j]=" ";
	            	}
	            }
            	count--;
	        }
	        for(int i=0; i<max_len; i++){
	            for(int j=0; j<=9; j++){
	                System.out.print(strlist[i][j]);
	            }
	            System.out.println();
	        }
	        for(int i=0; i<10; i++) {
	        	System.out.print(i);
	        }



		} catch (IOException e) {
			e.printStackTrace();
		}

}
}