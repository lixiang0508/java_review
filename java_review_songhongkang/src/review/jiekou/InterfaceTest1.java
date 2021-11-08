package review.jiekou;

/**
 * @author zlx
 * @create 2021-08-20 9:10 下午
 */
public class InterfaceTest1 {

    public static void main(String[] args) {
            Computer com= new Computer();
            Flash fls = new Flash();   //接口的非匿名实现类的非匿名对象
        
           // com.transfer(fls); //体现多态性
       // com.transfer(new Flash());//创建接口的非匿名实现类的匿名对象
        USB phone = new USB()  {  //创建接口的匿名实现类的非匿名对象

            @Override
            public void start() {
                System.out.println("phone start");
            }

            @Override
            public void end() {
                System.out.println("phone start");
            }
        } ;
        com.transfer(phone) ;
        com.transfer(new USB()  {  //创建接口的非匿名实现类的非匿名对象

            @Override
            public void start() {
                System.out.println("phone2 start");
            }

            @Override
            public void end() {
                System.out.println("phone2 start");
            } ;
    }  );
}
interface USB{
    void start() ;

    void end() ;
}

static class Computer {
    public void transfer(USB usb) {
        usb.start();
        System.out.println("===具体传输的细节===");
        usb.end();
    }
}

static class Flash implements  USB{

    @Override
    public void start() {
        System.out.println("Flash start");
    }

    @Override
    public void end() {
        System.out.println("Flash end");
    }
}}
