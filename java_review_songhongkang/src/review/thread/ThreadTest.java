package review.thread;

/**
 * @author zlx
 * @create 2021-08-24 11:45 下午
 */
public class ThreadTest  {
    public static void main(String[] args) {
        MyThread t1=new MyThread()  ;
        t1.start()  ;
        MyThread t2=new MyThread()  ;
        t2.start()  ;

    }

}


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==1) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
