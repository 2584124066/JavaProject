package zy.day15;


public class Test5 {
    public static void main(String[] args) {
//        这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒。
//        随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名。
        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + "通过");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(r,"t1");
        Thread t2 = new Thread(r,"t2");
        Thread t3 = new Thread(r,"t3");
        Thread t4 = new Thread(r,"t4");
        Thread t5 = new Thread(r,"t5");
        Thread t6 = new Thread(r,"t6");
        Thread t7 = new Thread(r,"t7");
        Thread t8 = new Thread(r,"t8");
        Thread t9 = new Thread(r,"t9");
        Thread t10 = new Thread(r,"t10");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
