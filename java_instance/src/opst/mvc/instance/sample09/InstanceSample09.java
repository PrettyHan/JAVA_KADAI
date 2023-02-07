package opst.mvc.instance.sample09;

public class InstanceSample09 {
    public static void main(String[] args) {

        InstanceSample09Sub sub = new InstanceSample09Sub(3, 4, 5);

        sub.showStr();
        sub.increment();
        sub.showStr();
        sub.increment();
        sub.showStr();

    }
}
