package review.java8API;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author zlx
 * @create 2021-09-01 8:48 下午
 */
public class Method {
    @Test
    public void test1() {
        Consumer<String>   con =str-> System.out.println(str);
        con.accept("I wanna sex");
    }
}
