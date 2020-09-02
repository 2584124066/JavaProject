package lesson.l16.test7;

import java.util.concurrent.CountDownLatch;

public class MyCown implements Runnable {
    private CountDownLatch countDownLatch;

    public MyCown() {
    }

    public MyCown(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        try {
            //阻塞，只要计数器的值变成0，就立马放行
            countDownLatch.await();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "," + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
