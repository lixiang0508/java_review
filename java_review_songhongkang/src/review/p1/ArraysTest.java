package review.p1;

import java.util.Arrays;

/**
 * @author zlx
 * @create 2021-08-14 4:15 下午
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[]  arr1=new int[] {1,2,3,4} ;
        int[]   arr2 = new int[]{1,1,2,4} ;
        System.out.println(Arrays.equals(arr1,arr2));//是否相同
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        int i = Arrays.binarySearch(arr2, 2);
        System.out.println(i);

    }


    
}
