package review.thread;

/**
 * @author zlx
 * @create 2021-08-25 11:09 下午
 */
public class WindowTest {
    public static void main(String[] args) {
             Window t1= new Window();
        Window t2= new Window();
        Window t3= new Window();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();



        
    }
}
class Window extends Thread{
    private static int ticket=100;
    Object obj = new Object()    ;
    @Override
    public void run()  {
          while(true) {
              synchronized (obj)  {
              if(ticket>0)  {
                  System.out.println(getName()+"卖票，票号为"+ticket);
                  ticket--;
                  try {
                      Thread.sleep(200);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }else{
                  break;
              }
          }    }
    }

}
