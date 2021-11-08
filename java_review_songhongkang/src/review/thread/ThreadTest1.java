package review.thread;

/**
 * @author zlx
 * @create 2021-08-25 11:18 下午
 */
//继承Runnable接口
public class ThreadTest1 {
    public static void main(String[] args) {
           MThread mThread= new MThread();
           Thread t1= new Thread(mThread) ;
           t1.start();
        Thread t2= new Thread(mThread) ;
        t2.start();

    }
}


class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
