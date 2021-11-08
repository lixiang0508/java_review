package review.staticproxy;

/**
 * @author zlx
 * @create 2021-09-01 9:44 上午
 */

interface ClothFactory{
    void produceCloth() ;
}
//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory clothFactory;//就拿被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        clothFactory.produceCloth();
        System.out.println("代理工厂做一些收尾工作");
    }
}
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}
public class StaticProxyTest {
    public static void main(String[] args) {
        ClothFactory nike = new NikeClothFactory();
        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();

    }
}
