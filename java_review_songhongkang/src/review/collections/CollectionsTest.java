package review.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zlx
 * @create 2021-08-30 7:47 下午
 */
public class CollectionsTest {

     @Test
    public void test1() {
         List list = new ArrayList<>()  ;
         list.add(123) ;
         list.add(45);
         list.add(45);
         list.add(456) ;
         System.out.println(list);
         //Collections.reverse(list);
        // System.out.println(list);
         Collections.swap(list,1,2);
         System.out.println(list);
         int frequency = Collections.frequency(list, 45);
         System.out.println(frequency+"次");



     }
}

