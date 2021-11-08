package review.java8API;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author zlx
 * @create 2021-09-01 11:02 上午
 */
public class LambdaTest {

    @Test
    public void test1() {
        Runnable r1=new Runnable(){

            @Override
            public void run() {
                System.out.println("tuliplan");
            }
        };
        r1.run()  ;
        System.out.println("-------------");
        Runnable r2=() -> System.out.println("早的极乐");
        r2.run();
    }
    @Test
    public void test2(){
        Comparator<Integer> c2= (o1,o2)->Integer.compare(o1,o2);
        System.out.println(c2.compare(11,22));
    }
    @Test
    public void test3() {
              happyTime(222,money-> System.out.println("holland red street for"+money));
    }
    //Consumer型接口
    public void happyTime(int a, Consumer<Integer> con){
        con.accept(a);
    }
}
