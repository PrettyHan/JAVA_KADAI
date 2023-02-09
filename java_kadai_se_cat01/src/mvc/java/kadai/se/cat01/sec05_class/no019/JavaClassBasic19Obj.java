package mvc.java.kadai.se.cat01.sec05_class.no019;

public class JavaClassBasic19Obj {

	private String bookTitle; // 本のタイトル ※消さず使うこと
	private int bookPrice; // 本の価格 ※消さず使うこと
	private String bookAuthor; // 本の著者 ※消さず使うこと
	public JavaClassBasic19Obj(String bookTitle, int bookPrice, String bookAuthor) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

}
