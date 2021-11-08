package review.java8API;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author zlx
 * @create 2021-09-02 12:09 上午
 */
public class Stream {

    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        java.util.stream.Stream<Integer> stream = list.stream();

    }
    @Test
    public void test2(){
        int[]   arr= new int[]{1,2,3,4} ;
        IntStream stream = Arrays.stream(arr);

    }
}
