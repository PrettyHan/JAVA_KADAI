package mvc.java.kadai.se.cat01.sec06_extend.no004;

/** JavaInterfaceBasic01Objを実装したクラスです。*/
public class JavaInterfaceBasic01ObjBImpl implements JavaInterfaceBasic01Obj {

	@Override
	public void print() {
		System.out.println("JavaInterfaceBasic01ObjBImpl#printメソッドを呼び出しました");
	}

	public void hoge() {
		System.out.println("JavaInterfaceBasic01ObjBImpl#hogeメソッドを呼び出しました。");
	}

}
