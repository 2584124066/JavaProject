package lesson.l15;

public class Test8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程1: " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (i == 10) {
                        //当i等于10的时候该线程礼让,但是不一定会交出线程执行权
                        Thread.yield();
                    }
                    System.out.println("线程2: " + i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
