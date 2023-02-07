package opst.mvc.instance.sample14;

public class Calculator {

	private final double TAX_RATE;

	public Calculator(double rate) {
		this.TAX_RATE = rate;
	}

	public int increment(int number) {
		int result = ++number;
		return result;
	}

	public int decrement(int number) {
		int result = --number;
		return result;
	}

	public double calcTax(int price) {
		// ※本当はお金の計算をdouble型でするのは良くないですが…
		double tax = price * TAX_RATE;
		return tax;
	}

}
