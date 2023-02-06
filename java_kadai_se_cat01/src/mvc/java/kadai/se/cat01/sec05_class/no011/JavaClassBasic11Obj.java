package mvc.java.kadai.se.cat01.sec05_class.no011;

public class JavaClassBasic11Obj {

	private int age;

	public JavaClassBasic11Obj(int age) {
		this.age = age;
	}

	public void birthday() {
		age = age + 1;
		// age++; // こちらでもOK
	}

	public int tellOlder() {
		return age;
	}

}
