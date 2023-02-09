package mvc.java.kadai.se.cat01.sec05_class.no021;

//* --------------------------------------------------
//* 現在の体重は、【71kg】です
//* 1か月2kgのペースで減量すると、70kgまで1か月です
//* --------------------------------------------------


public class JavaClassBasic21Obj {

	private final int GOAL_WEIGHT = 70; //このフィールド【定数】を活用しましょう
	private final int UNIT = 2; //このフィールド【定数】を活用しましょう
	private int weight;

	public JavaClassBasic21Obj(int startWeight) {
		weight = startWeight;
	}

	public void showDietPlan() {
		int count = 0;

		if(weight <= 70) {
			System.out.println("現状あなたに提案するダイエットプランはありません");
			return;
		}

		System.out.printf("現在の体重は、【%d】です%n",weight);
		while(weight > GOAL_WEIGHT) {
			count++;
			weight -= UNIT;
		}

		System.out.printf("1か月2kgのペースで減量すると、70kgまで%dか月です",count);
	}

}
