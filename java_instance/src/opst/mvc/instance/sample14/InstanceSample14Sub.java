package opst.mvc.instance.sample14;

public class InstanceSample14Sub {

	private Calculator calc = null;

	public InstanceSample14Sub(double rate) {
		calc = new Calculator(rate);
	}

	public void showStr(int price) {
		double tax = calc.calcTax(price);
		System.out.println(price + "円の消費税は" + tax + "円です");
	}

}
