package mvc.java.kadai.se.cat01.sec07_collection.no012;

public class JavaCollectionBasic12Obj {

	private String fName; // 苗字
	private String lName; // 名前
	private int age; // 年齢
	private char gender; // 性別
	private String postalCode; // 郵便番号
	private String address; // 住所
	private String tel; // 電話番号

	public JavaCollectionBasic12Obj(String fn, String ln, int age,
			char gd, String pc, String ad, String tel) {
		this.fName = fn;
		this.lName = ln;
		this.age = age;
		this.gender = gd;
		this.postalCode = pc;
		this.address = ad;
		this.tel = tel;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getAddress() {
		return address;
	}

	public String getTel() {
		return tel;
	}

}
