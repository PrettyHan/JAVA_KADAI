import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ConsumerTest {

    Consumer<String> c1 = a -> System.out.println("入力 : "+ a);

    BiConsumer<String, Integer> c2 =  (a, b) -> System.out.println("入力1 : "+ a+ " 入力2 : "+ b);

    IntConsumer c3 = a -> System.out.println("入力 : "+ a);

    DoubleConsumer c4 = a -> System.out.println("入力 : "+ a);

    LongConsumer c5 = a -> System.out.println("入力 : "+ a);

    ObjIntConsumer<Student> c6 = (a, b) -> System.out.println("名前 : "+ a.name+ " 数字 : "+ b);

    ObjDoubleConsumer<Student> c7 = (a, b) -> System.out.println("名前 : "+ a.name+ " 数字 : "+ b);

    ObjLongConsumer<Student> c8 = (a, b) -> System.out.println("名前 : "+ a.name+ " 数字 : "+ b);


    class Student{
        private String name;
        Student(String name){this.name = name;};
    }

    public static void main(String[] args) {
        ConsumerTest test = new ConsumerTest();

        test.c1.accept("ぶんた");
        test.c2.accept("ながい", 123);
        test.c3.accept(456);
        test.c4.accept(123.45);
        test.c5.accept(1232345);

        Student student = test.new Student("ハン");
        test.c6.accept(student, 12);
        test.c7.accept(student, 23.24);
        test.c8.accept(student, 98765);
    }
}