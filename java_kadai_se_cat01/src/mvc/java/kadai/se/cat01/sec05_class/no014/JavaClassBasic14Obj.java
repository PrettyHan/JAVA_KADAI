package mvc.java.kadai.se.cat01.sec05_class.no014;

public class JavaClassBasic14Obj {

	private String birdName; // 鳥の名前
	private int birdAge; // 鳥の年齢

	public JavaClassBasic14Obj(String name, int age) {
		this.birdName = name;
		this.birdAge = age;
	}

	public void sing() {
		System.out.println("鳥の" + this.birdName + "がピッピーと鳴いた");
	}

	public void birthday() {
		System.out.print(this.birdAge + "才だった鳥の" + this.birdName + "は今日の誕生日で");
		this.birdAge = this.birdAge + 1;
		System.out.println(this.birdAge + "才になりました");
	}

}
