package mvc.java.kadai.se.cat01.sec05_class.no023;

public class JavaClassBasic23Obj2 {

	private int keepMoney = 0; // 財布の中身

	public void addMoney(int money) {
		keepMoney = keepMoney + money;
		System.out.println("財布に" + money + "円追加しました");
	}

	public void showKeepMoney() {
		System.out.println("今財布には" + keepMoney + "円はいっています");
	}

}
