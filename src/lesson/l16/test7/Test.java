package lesson.l16.test7;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        MyCown myCown = new MyCown(countDownLatch);
        for (int i = 0; i < 10; i++) {
            new Thread(myCown, "线程" + i).start();
        }
        //计数器减一
        countDownLatch.countDown();
    }
}
