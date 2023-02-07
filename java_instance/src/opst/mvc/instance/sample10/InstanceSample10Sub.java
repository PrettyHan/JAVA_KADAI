package opst.mvc.instance.sample10;

public class InstanceSample10Sub {

    private int a;
    private int b;
    private int c;

    public InstanceSample10Sub(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void showStr() {
        System.out.println(a + "の" + b + "倍は" + (a * b) + "、"
                + a + "の" + c + "倍は" + (a * c) + "です");
        increment();
    }

    private void increment() {
        a = a + 1;
    }

}
