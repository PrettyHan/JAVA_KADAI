package mvc.java.kadai.se.cat01.sec08_exception.no001;

public class JavaExceptionBasic01Obj {


	public void divide(int firstNum, int secondNum) {

		try {

			if (secondNum == 0) {
				/* ①コメントを削除して記述 */
			}

			int ans = /* ②コメントを削除して記述 */ ;

			System.out.println(firstNum + "÷" + secondNum + "＝" + ans);


		} catch (Exception e) {
			System.out.println("0で割ることはできません。");
		}

	}

}
