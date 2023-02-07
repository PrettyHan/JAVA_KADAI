package opst.mvc.instance.sample08;

public class InstanceSample08 {
    public static void main(String[] args) {

        InstanceSample08Sub sub = new InstanceSample08Sub(3);

        sub.showStr();
        sub.increment();
        sub.showStr();
        sub.increment();
        sub.showStr();

    }
}
