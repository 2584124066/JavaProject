package zy.day15.test7;

public class Bus implements Runnable {
    public static Integer sum = 80;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (sum <= 0) {
                    System.out.println("满座了");
                    System.exit(1);
                } else {
                    System.out.println(Thread.currentThread().getName() + "上车" + "---还剩下" + (--sum) + "个座");
                }
            }

        }
    }
}
