package review.Singleton;

/**
 * @author zlx
 * @create 2021-08-19 11:51 上午
 */
public class SingletonTest2 {
    //单例模式的懒汉式
    public static void main(String[] args) {
        Order order1 =Order.getInstance();
        Order order2 =Order.getInstance();
        System.out.println(order1==order2);


    }
    
}
class Order{

    //私有化类的构造器
    private Order() {

    }
    private static Order instance = null;

    public static  Order getInstance()  {
        if(instance==null){
        instance  = new Order() ; }
        return instance;

    }
    
}
