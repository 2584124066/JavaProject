package lesson.l16.test4;

public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        //创建消费线程
        ConsumerThread consumer = new ConsumerThread(bz);
        //创建生产线程
        ProductThread product = new ProductThread(bz);
        //开启生产消费线程
        new Thread(product).start();
        new Thread(consumer).start();
    }
}
