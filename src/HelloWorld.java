import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by matthew on 17-6-7.
 */
public class HelloWorld {
    List<String> list = new ArrayList<>();
    public static void main(String args[]) {
        System.out.print("Hello world !");
        System.out.println();
        /*
        * 在最简单的形式中，一个lambda可以由用逗号分隔的参数列表、–>符号与函数体三部分表示!
        * */
        Arrays.asList("a", "b", "d").forEach( e -> System.out.print(e));
        System.out.println();
        /*
        *  同时，你也可以通过把参数类型与参数包括在括号中的形式直接给出参数的类型.
        * */
        Arrays.asList("e", "e", "f").forEach((String e ) -> System.out.print( e ));

        System.out.println();

        Arrays.asList("hhh", "ooo", "ddd").forEach( e -> {
            System.out.print("Hello");
            System.out.print("world");
        });

        System.out.println();

        String separator = " 5655";
        Arrays.asList("eee", "fff", "ggg").forEach((String e) -> System.out.print(e + separator));
    }
}
