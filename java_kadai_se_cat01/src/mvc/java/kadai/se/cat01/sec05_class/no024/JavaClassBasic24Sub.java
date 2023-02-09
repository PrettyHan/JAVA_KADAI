package mvc.java.kadai.se.cat01.sec05_class.no024;

public class JavaClassBasic24Sub {

	private int[] intArray = new int[10];
	private int count = 0;

	public void addInt(int number) {

		if (count < 10) {
			intArray[count] = number;
			System.out.println("[" + number + "]を格納しました");
			count++;
		} else {
			System.out.println("これ以上格納できません");
		}

	}

	public int getAllSum() {
		int sum = 0;

		for(int num : intArray) {
			sum += num;
		}

		return sum;
	}

}
