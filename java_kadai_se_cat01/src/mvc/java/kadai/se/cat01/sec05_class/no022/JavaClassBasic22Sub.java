package mvc.java.kadai.se.cat01.sec05_class.no022;

public class JavaClassBasic22Sub {

	public void printShape(JavaClassBasic22Obj obj) {

		for (int i = 0; i < obj.getCount(); i++) {
			showMark(obj.getMark());
		}
		System.out.println();
		System.out.println("------------------------------");

	}

	public void showMark(String mark) {
		System.out.print(mark);
	}

}
