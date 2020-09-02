package lesson.l16.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    //创建锁对象
    ReentrantLock lock = new ReentrantLock();
    //创建三个监视器对象,用于监视三条线程
    Condition c1;
    Condition c2;
    Condition c3;

    public Printer() {
        c1 = lock.newCondition();
        c2 = lock.newCondition();
        c3 = lock.newCondition();
    }

    int count = 1;

    public void show1() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            lock.lock();//开启锁
            while (count != 1) {
                c1.await();//使用c1监视器让当前线程等待
            }
            Thread.sleep(10);
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count = 2;
            c2.signal(); //唤醒c2监视器监视的线程
            lock.unlock(); //释放锁
        }
    }

    public void show2() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            lock.lock();//开启锁
            while (count != 2) {
                c2.await();//使用c2监视器让当前线程等待
            }
            Thread.sleep(10);
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count = 3;
            c3.signal(); //唤醒c3监视器监视的线程
            lock.unlock(); //释放锁
        }
    }

    public void show3() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            lock.lock();//开启锁
            while (count != 3) {
                c3.await();//使用c2监视器让当前线程等待
            }
            Thread.sleep(10);
            System.out.print("我");
            System.out.print("是");
            System.out.print("中");
            System.out.print("国");
            System.out.print("人");
            System.out.println();
            count = 1;
            c1.signal(); //唤醒c3监视器监视的线程
            lock.unlock(); //释放锁
        }
    }

}
