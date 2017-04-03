package sparkjava.test;

/**
 * Created by joqk12345 on 4/3/17.
 * www.github.com/joqk12345
 */
import  static  spark.Spark.*;

/**
 * The type Hello world.
 */
public class HelloWorld {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        get("hello", (req,res) -> "hello world ~");

    }
}
