package opst.mvc.instance.sample04;

public class InstanceSample04 {

    public static void main(String[] args) {

        InstanceSample04Sub1 sub1 = new InstanceSample04Sub1();
        InstanceSample04Sub2 sub2 = new InstanceSample04Sub2();

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                sub1.showEven(i);
            } else {
                sub2.showOdd(i);
            }
        }
    }

}
