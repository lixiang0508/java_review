package review.p1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zlx
 * @create 2021-08-15 7:13 下午
 */
public class maptest {
    public static void main(String[] args) {
        HashMap<Integer,Integer>   map= new HashMap<>();
        map.put(0,1)    ;
        map.put(1,2) ;
        ArrayList<Integer> values = (ArrayList<Integer>) map.values();
        System.out.println(values);
        //maptest maptes= new maptest();

    }
}
