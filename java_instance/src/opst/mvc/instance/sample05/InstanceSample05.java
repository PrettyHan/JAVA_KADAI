package opst.mvc.instance.sample05;

public class InstanceSample05 {

    public static void main(String[] args) {
        String a = "A";
        System.out.println("B");
        InstanceSample05Sub sub = new InstanceSample05Sub();
        a = sub.showStr();
        System.out.println("C");
        System.out.println(a);
    }

}
