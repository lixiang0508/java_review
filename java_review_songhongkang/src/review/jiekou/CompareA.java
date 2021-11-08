package review.jiekou;

/**
 * @author zlx
 * @create 2021-08-23 10:30 下午
 */
public interface CompareA {
    //接口中的静态方法  可以有方法体
    public static void method1()   {
        System.out.println("CompareA:北京");
    }

    public default void method2() {
        //默认方法
        System.out.println("COMPAREB：上海");
    }

}
