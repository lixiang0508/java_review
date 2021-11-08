package review.Singleton;

/**
 * @author zlx
 * @create 2021-08-26 2:48 下午
 */
//懒汉式改写成线程安全的
public class SingletonTest3 {
    public static void main(String[] args) {
        Bank1 instance = Bank1.getInstance();
        

    }

}

class Bank1{
    private Bank1() {
        
    }
    private static Bank1 instance =null;

    public static synchronized Bank1 getInstance() {
        if(instance==null) {
            instance=new Bank1();
        }
        return instance;
    }
}