package review.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zlx
 * @create 2021-08-28 1:41 下午
 */
public class CompareTest {

    @Test
    public void test1() {
        String[]    arr= new String[] {"DD","CBB","CkC","Aq"};
        Arrays.sort(arr)          ;
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        String[]    arr= new String[] {"DD","CBB","CkC","Aq"};
        Arrays.sort(arr,new Comparator(){
              //从大到小排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  String && o2 instanceof String) {
                    String s1=(String)  o1;
                    String s2=(String)   o2;
                    return -s1.compareTo(s2)  ;
                }
                return 0;
            }
        })   ;
        System.out.println(Arrays.toString(arr));
    }

}
