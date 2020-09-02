package zy.day15.test3;

public class TestThread extends Thread {

    public TestThread() {
    }

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}
