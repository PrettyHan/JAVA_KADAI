package opst.mvc.instance.sample01.supplement;

public class InstanceSample01 {
    public static void main(String[] args) {

        InstanceSample01Sub sub = new InstanceSample01Sub();

        int a = 1;
        sub.showStr(a);
        a = 2;
        sub.showStr(a);
        a = 3;
        sub.showStr(a);

        /*
         * Q,プログラムにエラーが発生しています。
         * エラー発生の原因を考えましょう。
         */
    }
}
