package lesson.l15;

public class Test6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("守护线程1: " + i);
                }
            }
        });
        //将t1设置为守护线程
        t1.setDaemon(true);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 250; i++) {
                    System.out.println("用户线程2: " + i);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("用户线程3: " + i);
                }
            }
        });
        //开启三条线程,如果t2执行完毕,那么守护线程也会停止
        t1.start();
        t2.start();
        t3.start();
    }
}
