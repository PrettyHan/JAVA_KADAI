package mvc.java.kadai.se.cat01.sec05_class.no028;

import java.util.Arrays;

public class JavaClassBasic28Sub {

	public int[] doTenTimes(int[] intArray) {
		int[] copyArray = Arrays.copyOf(intArray, intArray.length);

		for (int i = 0; i < copyArray.length; i++) {
			copyArray[i] = copyArray[i] * 10;
		}

		return copyArray;
	}

}
