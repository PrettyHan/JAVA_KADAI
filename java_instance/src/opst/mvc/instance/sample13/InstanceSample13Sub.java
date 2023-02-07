package opst.mvc.instance.sample13;

public class InstanceSample13Sub {

	private Calculator calc = new Calculator();

	public void showStr(int price) {
		double tax = calc.calcTax(price);
		System.out.println(price + "円の消費税は" + tax + "円です");
	}

}
