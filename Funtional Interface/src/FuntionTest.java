import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

public class FuntionTest {
    class Student{
        private int stuNum;
        private String stuName;
        private int math;
        private int english;

        Student(int stuNum, String stuName, int math, int english){
            this.stuNum = stuNum;
            this.stuName = stuName;
            this.math = math;
            this.english = english;
        }
    }

    public static void main(String[] args) {
    	FuntionTest test = new FuntionTest();
        Student st1 = test.new Student(123, "ながい", 11, 36);

        //매핑 : Student객체 - Student의 Integer 값
        Function<Student, Integer> function = a -> a.stuNum;
        int result01 = function.apply(st1);
        System.out.println("ながい 番号 : "+ result01);


        //매핑 : 두 Integer 값 - Double 값
        BiFunction<Integer, Integer, Double> biFunction = (a, b) -> (double) (a+b)/2;
        double result02 = biFunction.apply(3, 5);
        System.out.println("平均 : "+ result02);


        //매핑 : Double 값 - Integer 값
        DoubleFunction<Integer> doubleFunction = a -> {
            Double d = Math.floor(a);
            return d.intValue();
        };
        int result03 = doubleFunction.apply(246.71);
        System.out.println(".000 捨てる : "+ result03);


        //매핑 : Integer, Integer - Double
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction;
        toDoubleBiFunction = (math, english) -> (double)(math+english)/2;
        double result04 = toDoubleBiFunction.applyAsDouble(st1.math, st1.english);
        System.out.println("数学と英語の平均 : "+ result04);
    }
}