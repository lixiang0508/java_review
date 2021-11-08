package review.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zlx
 * @create 2021-08-28 7:46 下午
 */
public class IteratorTest {


    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<>()  ;
        for (int i = 0; i < 10; i++) {
             list.add(i)  ;
        }
        Iterator iter =list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
