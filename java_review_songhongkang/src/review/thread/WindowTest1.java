package review.thread;

/**
 * @author zlx
 * @create 2021-08-26 1:26 下午
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Mythread1   myThread = new Mythread1();
        Thread t1=new Thread(myThread);
        Thread t2=new Thread(myThread);
        Thread t3=new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
    }



}

class Mythread1 implements Runnable{
        private int ticket=100;
    @Override
    public void run() {

        while(true) {
            synchronized (this) {
            if(ticket>0)  {
            System.out.println(Thread.currentThread().getName()+"卖票，票号："+ticket);
            ticket--;}else{
                break;
            }
        }  }
    }
}
