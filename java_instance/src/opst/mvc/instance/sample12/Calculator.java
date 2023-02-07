package opst.mvc.instance.sample12;

public class Calculator {

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
		double tax = price * 0.1;
		return tax;
	}

}
