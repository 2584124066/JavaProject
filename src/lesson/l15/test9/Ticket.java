package lesson.l15.test9;

public class Ticket implements Runnable {
    Integer num = 100;
    //锁对象
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //加上同步代码块,把需要同步的代码放入代码块中,同步代码块中的锁对象必须保证一致！
            synchronized (obj) {
                if (num < 0) {
                    System.out.println("票卖完了");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "：正在卖第：" + num + "张票");
                    num--;
                }
            }
        }
    }
}
