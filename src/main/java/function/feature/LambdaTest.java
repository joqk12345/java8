package function.feature;

import java.util.Arrays;

/**
 * Created by joqk12345 on 4/3/17.
 * www.github.com/joqk12345
 */
public class LambdaTest {
    static  String player = "joqk";
    public static void main(String[] args) {
        // lambda 表达式  逗号分割的参数列表   -> 语句块组成
        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
        // function 2
        Arrays.asList("a","b","c").forEach((String e) -> System.out.println(e));
        // function 3
        Arrays.asList("zhouqi","yijianlian","bulaqie","yadangsi").forEach(e ->{
            System.out.println(e + player);
            System.out.println(e);
        });

        System.out.println("function4");
        Arrays.asList("zhouqi","yijianlian","bulaqie","yadangsi").sort((e1,e2)-> e1.compareTo(e2));

    }
}
