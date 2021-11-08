package review.duotai;

/**
 * @author zlx
 * @create 2021-08-17 8:10 下午
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p2= new Man();//子类对象的多态性
      //  p2.eat();
        int i=10;
        double ii= 10.0;
        System.out.println(i==ii);  //true
    }


    @org.junit.Test
    public void eat() {
    }

    @org.junit.Test
    public void walk() {
    }
}
