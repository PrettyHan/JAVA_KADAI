package mvc.java.kadai.se.cat01.sec05_class.no020;


// お引き出し金額：200000
// 残高：800000

public class JavaClassBasic20Obj {

	private int savingMoney;

	public JavaClassBasic20Obj(int money) {
		System.out.println("貯金が" + money + "円あります");
		this.savingMoney += money;
	}

	public void withdrawMoney(int price) {
		System.out.println("お引き出し金額：" + price);

		if (savingMoney - price < 0) {
			System.out.println("お金を引き出せません");
		}

		else {
			this.savingMoney = (savingMoney - price);
		}

	}

	public void showSavingMoney() {
		System.out.println("残高:"+ (savingMoney));
	}

}
