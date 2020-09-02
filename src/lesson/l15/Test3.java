package lesson.l15;

public class Test3 {
    public static void main(String[] args) {
        Thread t = new Thread("小强") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + "：正在执行" + i);

                }
            }
        };
        t.start();

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println(Thread.currentThread().getName() + "：正在执行" + i);
//
//                }
//            }
//        };
//        Thread t = new Thread(r, "小强");
//        t.start();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };

        Thread thread = new Thread(runnable, "小强");
        thread.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("旺财:" + i);
        }

    }
}
