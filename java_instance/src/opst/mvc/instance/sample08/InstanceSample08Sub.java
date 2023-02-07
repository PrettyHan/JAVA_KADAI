package opst.mvc.instance.sample08;

public class InstanceSample08Sub {

    private int a;

    public InstanceSample08Sub(int reset) {
        a = reset;
    }

    public void showStr() {
        System.out.println(a + "の2倍は" + (a * 2) + "、"
                + a + "の3倍は" + (a * 3) + "です");
    }

    public void increment() {
        a = a + 1;
    }

}
