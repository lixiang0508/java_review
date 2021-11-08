package review.java8API;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zlx
 * @create 2021-09-02 7:45 下午
 */
public class StreamTest {
    //1 筛选与切片
    @Test
    public void test1() {
        //filter(Predicate p) 过滤 从流中排除某些元素
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i)       ;

        }
        Stream<Integer> stream = list.stream();
        stream.filter(i->i<5).forEach(System.out::print);//01234
        System.out.println();
        list.stream() .limit(3).forEach(System.out::print);//012


    }
    @Test
    public void test3() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str->str.toUpperCase()) .forEach(System.out::print);
          //AA BB CC DD

    }
    @Test
    public void test4(){
        //归约   reduce
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
                 list.add(i) ;
        }
        Integer reduce = list.stream().reduce(0, Integer::sum);//第一参数是初始值
        // 第二参数 式子需要有两个参数
        System.out.println(reduce);

    }
    @Test
    public void test5() {
       // collect将  流转换为其他形式
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i) ; }
        List<Integer> collect = list.stream().filter(e -> e > 5).collect(Collectors.toList());
        System.out.println(collect);

    }
}
