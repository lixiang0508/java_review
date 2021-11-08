package review.enumerateclass;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zlx
 * @create 2021-08-30 9:14 下午
 */
public class GenericTest {
    @Test
    public void test1()  {
        Map<String,Integer> map= new HashMap<> () ;
        map.put("Tom",87);
        map.put("Jerry",97);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        

    }
}
