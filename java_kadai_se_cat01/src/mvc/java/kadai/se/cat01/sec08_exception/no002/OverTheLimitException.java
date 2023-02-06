package mvc.java.kadai.se.cat01.sec08_exception.no002;

/** 独自例外クラス */
public class OverTheLimitException extends Exception {

	/** 最大文字数 */
	public static final int LIMIT_MAX = 10;

	@Override
	public String getMessage() {
		return "【システム上エラー】文字数の上限は" + LIMIT_MAX + "です。上限を超える文字列は利用できません。";
	}

}
