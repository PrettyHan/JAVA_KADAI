package opst.mvc.instance.sample11;

public class InstanceSample11Sub {

    private int[] intArray = new int[3];

	public InstanceSample11Sub(int a, int b, int c) {
		this.intArray[0] = a;
		this.intArray[1] = b;
		this.intArray[2] = c;
	}

	public void showStr() {
		System.out.println(intArray[0] + "の" + intArray[1] + "倍は" + (intArray[0] * intArray[1]) + "、"
				+ intArray[0] + "の" + intArray[2] + "倍は" + (intArray[0] * intArray[2]) + "です");
		increment();
	}

	private void increment() {
	    intArray[0] = intArray[0] + 1;
	}

}
