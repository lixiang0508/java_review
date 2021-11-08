package review.inherit;

/**
 * @author zlx
 * @create 2021-08-16 11:06 下午
 */
public class Student extends  Person {
   private String major;
    public Student(String name, int age,String _major) {
        super(name, age);
        this.major=_major;
    }

    public static void main(String[] args) {
        Student s= new Student("zlx",15,"sss") ;
        s.eat();
    }
    
}
