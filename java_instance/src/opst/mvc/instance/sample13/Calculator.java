package opst.mvc.instance.sample13;

public class Calculator {

	private final double TAX_RATE = 0.1;

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
