package mvc.java.kadai.se.cat01.sec07_collection.no013;

public class JavaCollectionBasic13Obj {

	private String bookTitle; // 本のタイトル
	private int bookPrice; // 本の価格
	private String bookAuthor; // 本の著者

	public JavaCollectionBasic13Obj(String title, int price, String author) {
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

	public String getBookTitle() {
		return bookTitle;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

}
