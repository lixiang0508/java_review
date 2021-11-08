package review.block;

/**
 * @author zlx
 * @create 2021-08-19 12:15 下午
 */
public class BlockTest {
    //代码块
    public static void main(String[] args) {
        Person p1= new Person() ;
        Person p2= new Person() ;
    }

}

class Person{
    String name;
    int age;
    static String desc="我是一个人";

    public Person() {
        
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   static { //静态代码块
       System.out.println("static block!");

    }
    {
        System.out.println("non-static block");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println("eat");
    }
}
