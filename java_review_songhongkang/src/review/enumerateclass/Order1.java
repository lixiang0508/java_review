package review.enumerateclass;

/**
 * @author zlx
 * @create 2021-08-30 9:45 下午
 */
public class Order1<T> {
    String orderName;
    int orderId;
    //类内部可以使用类的泛型
    T orderRT;

    public Order1(String orderName, int orderId, T orderRT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderRT = orderRT;
    }
}
