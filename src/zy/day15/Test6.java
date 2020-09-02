package zy.day15;

public class Test6 {
    public static Integer num = 100;
    public static Integer i = 1;
    public static Integer sum1 = 0;
    public static Integer sum2 = 0;

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (num <= 0) {
                            System.out.println("卖完了");
                            break;
                        } else {
                            System.out.println(Thread.currentThread().getName() + "卖出第" + i + "个，总共剩余" + --num + "个");
                            i++;
                        }
                        if ("实体店".equals(Thread.currentThread().getName())) {
                            sum1++;
                        }
                        if ("官方店".equals(Thread.currentThread().getName())) {
                            sum2++;
                        }
                    }
                }
                if ("实体店".equals(Thread.currentThread().getName())) {
                    System.out.println("实体店卖出了"+sum1+"个");
                }
                if ("官方店".equals(Thread.currentThread().getName())) {
                    System.out.println("官方店卖出了"+sum2+"个");
                }
            }
        };

        Thread t1 = new Thread(r, "实体店");
        Thread t2 = new Thread(r, "官方店");
        t1.start();
        t2.start();
    }
}
