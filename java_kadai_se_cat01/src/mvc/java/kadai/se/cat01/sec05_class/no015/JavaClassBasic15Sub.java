package mvc.java.kadai.se.cat01.sec05_class.no015;

public class JavaClassBasic15Sub {
	private JavaClassBasic15Obj cd;

	public JavaClassBasic15Sub(JavaClassBasic15Obj cd) {
		super();
		this.cd = cd;
	}

	public void showCdInfo() {
		System.out.println("◆CDの情報");
		System.out.println("タイトル："+cd.getCdTitle());
		System.out.println("価格："+cd.getCdPrice());
		System.out.println("アーティスト："+cd.getCdArtist());
	}



}
