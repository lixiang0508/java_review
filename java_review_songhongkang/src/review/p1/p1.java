package review.p1;

/**
 * @author zlx
 * @create 2021-07-21 10:52 下午
 */
public class p1 {
    //数组
    public static void main(String[] args) {
        int[]  arr= new int[] {3,9,8}  ;
        int[]  arr1  = {3,9,8} ; //数组的两种初始化方式
        //基本类型默认初始值为0 引用类型默认初始值为null
       // System.out.println(Integer.parseInt("0011")>Integer.parseInt("001"));
        String path="dir\n\tsubdir1\n\t\tfile1.ext" ;
        //path = path.replaceAll("\\/+","\\/");
        String[] arr11 = path.split("\n");
       //System.out.println(path);
        System.out.println(arr11.length);
        for(String ssss:arr11) System.out.println(ssss);
    }
}
