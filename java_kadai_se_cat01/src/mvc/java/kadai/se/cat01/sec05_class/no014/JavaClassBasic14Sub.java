package mvc.java.kadai.se.cat01.sec05_class.no014;

public class JavaClassBasic14Sub {

	private JavaClassBasic14Obj pet;

	public JavaClassBasic14Sub(JavaClassBasic14Obj pet) {
		this.pet = pet;
	}

	public void stroke() {
		System.out.println("ペットを撫でます");
		System.out.print("⇒");
		pet.sing();
	}

	public void celebrate() {
		System.out.println("ペットと過ごして1年…");
		System.out.print("⇒");
		pet.birthday();
	}

}
