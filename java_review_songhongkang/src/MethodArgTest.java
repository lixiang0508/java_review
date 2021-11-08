/**
 * @author zlx
 * @create 2021-08-15 11:00 上午
 */
public class MethodArgTest {

    public static void main(String[] args) {
               MethodArgTest m1= new MethodArgTest();
               m1.show("a","b","c") ;

    }
    public void show(String... strs){
        System.out.println("多个形参");
    }
}
