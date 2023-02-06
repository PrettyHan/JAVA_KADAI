package mvc.java.kadai.se.cat01.sec05_class.no010;

public class JavaClassBasic10Obj {

	private String bookTitle; // 本のタイトル
	private int bookPrice; // 本の価格
	private String bookAuthor; // 本の著者

	public JavaClassBasic10Obj(String title, int price, String author) {
		this.bookTitle = title;
		this.bookPrice = price;
		this.bookAuthor = author;
	}

	public void showBookInfo() {

		System.out.println("◆本の情報");
		System.out.println("タイトル：" + this.bookTitle);
		System.out.println("価格：" + this.bookPrice);
		System.out.println("著者：" + this.bookAuthor);

	}

}
