package lesson.l22.test2;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Single.getStudent()==Single.getStudent());
//        System.out.println(Single2.getStudent()==Single2.getStudent());

        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                try {
                    countDownLatch.await();
                    System.out.println(Single2.getStudent());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        countDownLatch.countDown();
    }
}
