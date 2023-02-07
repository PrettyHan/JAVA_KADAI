package opst.mvc.instance.sample03;

public class InstanceSample03Sub {

    public void showStr(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        double avg = sum / 5.0;
        System.out.println(avg);
    }

}
