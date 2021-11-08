package review.jiekou;

public class SubClassTest {
    public static void main(String[] args) {

        SubClass s= new SubClass();
        CompareA.method1();//接口中的静态方法  只能用接口调
        s.method2();//通过实现类的对象 可以调用接口中的默认方法
    }
}

class SubClass implements CompareA{
    
}
