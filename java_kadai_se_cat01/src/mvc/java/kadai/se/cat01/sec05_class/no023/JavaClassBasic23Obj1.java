package mvc.java.kadai.se.cat01.sec05_class.no023;

public class JavaClassBasic23Obj1 {

	private int savingMoney = 0; // 貯金

	public JavaClassBasic23Obj1(int startMoney) {
		savingMoney = startMoney;
		System.out.println("貯金" + savingMoney + "円からはじまります");
	}

	public void showSavingMoney() {
		System.out.println("貯金残高は" + savingMoney + "円です");
	}

	public int withdrawMoney(int price) {

		if (savingMoney < price) {
			System.out.println("お金を引き出せません");
			return 0;
		}

		System.out.println("貯金" + savingMoney + "円から" + price + "円を引き出しました");
		savingMoney = savingMoney - price;
		return price;

	}

}
