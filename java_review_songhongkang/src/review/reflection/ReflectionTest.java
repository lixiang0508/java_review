package review.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zlx
 * @create 2021-08-31 3:42 下午
 */
public class ReflectionTest {

    @Test
    public void test1() throws Exception {
        Class clazz=Person.class;
        //通过反射 创建Person类的对象
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Person tom = (Person) constructor.newInstance("Tom", 111);
        System.out.println(tom);
        //通过反射调用属性和方法
        Field age = clazz.getDeclaredField("age");
        age.set(tom,11);
        System.out.println(tom);

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(tom)  ;
        



    }
    @Test
    public void test2() throws Exception {
        Class clazz=Person.class;
        Constructor constructor = clazz.getConstructor(String.class);
        //调用私有构造器
        constructor.setAccessible(true);
        Person jerry = (Person) constructor.newInstance("Jerry");
        System.out.println(jerry);
        //调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(jerry,"hanmeimei") ;
       // System.out.println(jerry);
        //调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        showNation.invoke(jerry,"Holland") ;


    }
    @Test
    public void test3() throws ClassNotFoundException {
        //获取Class 实例
        Class<Person> personClass = Person.class;//method 1
        System.out.println(personClass);
        // method2
        Person p1= new Person() ;
        Class<? extends Person> aClass = p1.getClass();
        System.out.println(aClass);
        //method3
        Class<?> aClass1 = Class.forName("review.reflection.Person");


    }
    @Test
    public void test4()  throws Exception{
        Class clazz=Person.class;
        Object o = clazz.newInstance();
        Person p1=(Person)    o;
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p1,22);
        System.out.println(p1.getAge());



    }

}
