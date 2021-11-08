package review.jiekou;

/**
 * @author zlx
 * @create 2021-08-20 6:25 下午
 */
public class InterfaceTest {
    public static void main(String[] args) {
            Plane p = new Plane();
    }
}
interface Flyable{
    public static final int SPEED=100;  //全局常量
    int MINSPD=1;//省略了public static final
    void fly()  ;
    
}
class Plane implements Flyable{
    public Plane()   {

    }


    @Override
    public void fly() {
        System.out.println("flyyyy");
    }
}
