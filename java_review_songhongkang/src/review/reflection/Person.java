package review.reflection;

/**
 * @author zlx
 * @create 2021-08-31 3:42 下午
 */
public class Person {
    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String  name;
   public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("Let's show!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void showNation(String nation) {
        System.out.println("My nation is"+nation);
    }
}
