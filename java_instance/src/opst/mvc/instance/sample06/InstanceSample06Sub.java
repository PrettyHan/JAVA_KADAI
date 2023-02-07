package opst.mvc.instance.sample06;

public class InstanceSample06Sub {

    private int a = 1;

    public void showStr() {
        System.out.println(a + "の2倍は" + (a * 2) + "、"
                + a + "の3倍は" + (a * 3) + "です");
    }

    public void increment() {
        a = a + 1;
    }

}
