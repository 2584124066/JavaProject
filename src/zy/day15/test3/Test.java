package zy.day15.test3;

public class Test {
    public static void main(String[] args) {
        TestThread tt = new TestThread("Thread");
        tt.start();

        TestRunnable tr = new TestRunnable();
        Thread t = new Thread(tr, "Runnable接口");
        t.start();

    }
}
