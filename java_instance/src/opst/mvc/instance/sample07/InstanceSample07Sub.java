package opst.mvc.instance.sample07;

public class InstanceSample07Sub {

    private int a;

    public InstanceSample07Sub() {
        a = 1;
    }

    public void showStr() {
        System.out.println(a + "の2倍は" + (a * 2) + "、"
                + a + "の3倍は" + (a * 3) + "です");
    }

    public void increment() {
        a = a + 1;
    }

}
