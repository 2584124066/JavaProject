package lesson.l15.test11;

public class Shower {
    Object obj = new Object();

    public synchronized void show() {
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }

    public void show2() {
//        使用this锁也能够保证代码同步
        synchronized (this) {
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
        }
    }
}
