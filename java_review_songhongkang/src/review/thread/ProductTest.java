package review.thread;

/**
 * @author zlx
 * @create 2021-08-26 4:35 下午
 */
//生产者消费者
public class ProductTest {
    public static void main(String[] args) {
        Clerk clk = new Clerk();
        Customer customer=new Customer(clk) ;
        Producer producer = new Producer(clk)  ;
        customer.setName("customer");
        producer.setName("producer");
        customer.start();
        producer.start();
        
    }
}
class Clerk{
    private int productCount=0;
    public synchronized void produceProduct() {
           if(productCount<20)  {
               productCount++;
               System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount+"产品");
                notify();
           }  else{
               try {
                   wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
    }
    public synchronized  void consumeProduct() {
        if(productCount>0) {
            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount+"产品");
            productCount--;
            notify();
        } else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

class Producer extends Thread{
           private Clerk clerk;
           public Producer(Clerk clk) {
               this.clerk=clk;
           }
           @Override
           public void run() {
               System.out.println("生产产品");
             while(true) {
                 try {
                     Thread.sleep(1000)  ;
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }  clerk.produceProduct();
             }
           }
}

class Customer extends Thread{
    private Clerk clerk;
    public Customer(Clerk clk) {
        this.clerk=clk;
    }
    @Override
    public void run() {
        System.out.println("消费产品...");
        while(true) {
            try {
                Thread.sleep(1000)  ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  clerk.consumeProduct();
        }
    }
}
