package mvc.java.kadai.se.cat01.sec05_class.no028;

public class JavaClassBasic28Sub {

	public int[] doTenTimes(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = intArray[i] * 10;
		}

		return intArray;
	}

}
