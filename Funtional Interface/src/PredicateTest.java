import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    private List<Student> list;

    private enum Gender { MALE, FEMALE }

    class Student{
        private String name;
        private Gender gender;
        private int score;

        Student(String name, Gender gender, int score){
            this.name = name;
            this.gender = gender;
            this.score = score;
        }
    }

    public static void main(String[] args) {
    	PredicateTest test = new PredicateTest();

        test.list = Arrays.asList(
            test.new Student("a", Gender.MALE, 15),
            test.new Student("b", Gender.FEMALE, 73),
            test.new Student("c", Gender.MALE, 92),
            test.new Student("d", Gender.FEMALE, 47)
        );

        Predicate<Student> predicate_male = t -> t.gender.equals(Gender.MALE);
        double avgOfMale = test.getAverage(predicate_male);
        System.out.println("MaleAvg : "+ avgOfMale);

        Predicate<Student> predicate_sixty = t -> t.score >= 60;
        double avgOver60 = test.getAverage(predicate_sixty);
        System.out.println("AvgOver60 : "+ avgOver60);
    }

    private double getAverage(Predicate<Student> predicate){
        int count = 0;
        int sum = 0;
        for (Student stu : list){
            if(predicate.test(stu)){
                count++;
                sum += stu.score;
            }
        }
        return (double) sum/count;
    }
}