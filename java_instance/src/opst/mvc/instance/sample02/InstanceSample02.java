package opst.mvc.instance.sample02;

public class InstanceSample02 {
    public static void main(String[] args) {

        InstanceSample02Sub sub = new InstanceSample02Sub();

        int a = 1;
        a = sub.showStr(a);
        a = sub.showStr(a);
        a = sub.showStr(a);

    }
}
