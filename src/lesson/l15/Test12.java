package lesson.l15;

import java.util.concurrent.locks.ReentrantLock;

public class Test12 {
    public static void main(String[] args) {
        //创建锁对象
        ReentrantLock lock = new ReentrantLock();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    //开启锁
                    lock.lock();
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                    //释放锁
                    lock.unlock();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    //开启锁
                    lock.lock();
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();
                    //释放锁
                    lock.unlock();
                }
            }
        }.start();
    }
}
