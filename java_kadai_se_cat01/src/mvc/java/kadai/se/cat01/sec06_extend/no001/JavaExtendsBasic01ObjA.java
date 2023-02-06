package mvc.java.kadai.se.cat01.sec06_extend.no001;

public class JavaExtendsBasic01ObjA {

	private String className;

	public JavaExtendsBasic01ObjA(String className) {
		// コンストラクタ
		this.className = className;
	}

	public void showClassName() {
		System.out.println(this.className + "クラスです");
	}

	public void printShape(String mark, int count) {

		for (int i = 0; i < count; i++) {
			System.out.print(mark);
		}
		System.out.println();

	}

}
