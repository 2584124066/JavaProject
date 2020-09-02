package lesson.l15;

public class Test7 {
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
                for (int i = 0; i < 10; i++) {
                    System.out.println("线程2: " + i);
                }
            }
        });

        //设置优先级
        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
