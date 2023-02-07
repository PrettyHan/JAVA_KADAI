package opst.mvc.instance.sample01;

public class InstanceSample01 {
    public static void main(String[] args) {

        // インスタンスの生成(InstanceSample01Subクラスを使用する準備)
        InstanceSample01Sub sub = new InstanceSample01Sub();

        int a = 1;
        sub.showStr(a);
        a = 2;
        sub.showStr(a);
        a = 3;
        sub.showStr(a);

    }
}
