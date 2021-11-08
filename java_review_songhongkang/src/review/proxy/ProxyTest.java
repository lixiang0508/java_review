package review.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zlx
 * @create 2021-09-01 9:59 上午
 */

interface  Human{
    String belief() ;
    void eat(String food) ;
}
//被代理类
class SuperMan implements Human{

    @Override
    public String belief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("eat clean");
    }
}
class HumanUtil{
    public void method1(){
        System.out.println("==通用方法一====");
    }
    public void method2() {
        System.out.println("==通用方法二===");
    }
}
class ProxyFactory{
    //返回一个代理类的对象
    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        //obj：被代理类对象
        handler.bind(obj) ;
        Object proxyInstance = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                handler);
        return proxyInstance;
    }   }

    class MyInvocationHandler implements InvocationHandler{
    private Object obj;//需要使用被代理类进行赋值
        public void bind(Object obj) {
            this.obj=obj;
        }
        //当我们通过代理类对象 调用方法a时候 就会自动调用如下方法：invoke()
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            HumanUtil humanUtil = new HumanUtil();
            humanUtil.method1();
            Object rtV=method.invoke(obj,args);
            humanUtil.method2();

            //method：即为代理类对象调用的方法，也作为了被代理类对象要调用的方法
            //obj：被代理类对象
            return rtV;
        }
    }


/*
需要解决的问题：
1.如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
2.当通过代理类的对象调用方法时 如何动态调用被代理类同名方法


 */
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //代理类的对象
        Human proxyInstance=(Human)   ProxyFactory.getProxyInstance(superMan);
         proxyInstance.belief();
         proxyInstance.eat("dumplings");
        
    }
}
