package lesson.l15;

public class Test5 {
    public static void main(String[] args) {
        //创建线程1
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程1:" + i);
                }
            }
        });
        //创建线程2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程2:" + i);
                    //当i等于500的时候,让t1线程加入执行,直至执行完毕
                    if (i==500)
                        try {
                            //让t1线程加入执行,执行10毫秒之后交出执行权
                            t1.join(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
