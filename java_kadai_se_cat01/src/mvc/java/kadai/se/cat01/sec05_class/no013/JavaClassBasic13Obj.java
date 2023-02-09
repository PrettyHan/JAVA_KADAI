package mvc.java.kadai.se.cat01.sec05_class.no013;

public class JavaClassBasic13Obj {
	private String name;
	private int age;



	public JavaClassBasic13Obj(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public void mew() {
		System.out.printf("猫の%sがニャーと鳴いた%n", name);
	}
	public void grow() {
		int tmp = age;
		age += 1;
		System.out.printf("猫のタマは%d才でしたが、%d才になりました%n", tmp, age);
	}


}
