package review.Singleton;

import org.junit.Test;

/**
 * @author zlx
 * @create 2021-08-18 10:31 下午
 */

public class SingletonTest {
    public static void main(String[] args) {
        Bank b1 =Bank.getInstance();
        Bank b2= Bank.getInstance();
        System.out.println(b1==b2);
    }



    
}

//饿汉式
class Bank{
    // 1 私有化类的构造器
    private Bank(){}
    //2 内部创建类的对象
    //4 要求此对象也必须是静态的
    private static  Bank instance = new Bank() ;
    // 3 提供公共的方法 返回类的对象
    public static  Bank getInstance(){
        return instance;
    }
}
