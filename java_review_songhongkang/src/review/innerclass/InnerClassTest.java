package review.innerclass;

/**
 * @author zlx
 * @create 2021-08-23 10:58 下午
 */
public class InnerClassTest {
    public static void main(String[] args) {
       Person.Dog dog = new Person.Dog();
    }
}

class Person{
   static class Dog{

    }
    class Bird{
       
    }
    public void method() {
        class AA{  //方法内

        }
    }
    {//代码块内
        class BB{

        }

    }
    public Person() {
        //构造器内
        class CC{

        }
    }
}
