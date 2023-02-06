package mvc.java.kadai.se.cat01.sec05_class.no015;

public class JavaClassBasic15Obj {

	private String cdTitle; // CDのタイトル
	private int cdPrice; // CDの価格
	private String cdArtist; // CDアーティスト

	public JavaClassBasic15Obj(String title, int price, String artist) {
		this.cdTitle = title;
		this.cdPrice = price;
		this.cdArtist = artist;
	}

	public String getCdTitle() {
		return cdTitle;
	}

	public int getCdPrice() {
		return cdPrice;
	}

	public String getCdArtist() {
		return cdArtist;
	}

}
