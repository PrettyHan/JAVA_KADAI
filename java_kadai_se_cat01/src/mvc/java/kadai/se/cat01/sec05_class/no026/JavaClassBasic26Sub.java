package mvc.java.kadai.se.cat01.sec05_class.no026;

public class JavaClassBasic26Sub {

	private JavaClassBasic26Obj[] ucoArray = new JavaClassBasic26Obj[5];
	private int count = 0;

	public void addMember(JavaClassBasic26Obj uco) {

		if (count < 5) {
			ucoArray[count] = uco;
			System.out.println("[" + uco.getfName()+uco.getlName() + "]さんを格納しました");
			count++;
		} else {
			System.out.println("これ以上格納できません");
		}

	}
// 原正人(24)
	public void showAllMember() {
		System.out.println("◆従業員一覧");
		for (JavaClassBasic26Obj i : ucoArray) {
			System.out.println(i.getfName()+i.getlName()+"("+i.getAge()+")");
		}
	}

}
