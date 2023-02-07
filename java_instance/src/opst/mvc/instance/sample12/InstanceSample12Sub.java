package opst.mvc.instance.sample12;

public class InstanceSample12Sub {

	private int a;
	private int b;
	private int c;
	private Calculator calc = new Calculator();

	public InstanceSample12Sub(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void showStr() {
		System.out.println(a + "の" + b + "倍は" + (a * b) + "、"
				+ a + "の" + c + "倍は" + (a * c) + "です");
		a = calc.increment(a);
	}

}
