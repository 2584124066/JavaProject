package zy.day15.test8;

public class Ticket extends Thread {
    public static int sum = 20;
    public Ticket() {
    }

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Object.class) {
                if (sum <= 0) {
                    System.out.println("卖完了");
                    System.exit(1);
                } else {
                    System.out.println("窗口" + getName() + "卖了卖了一张票,剩余票数为" + (--sum));
                }
            }
        }
    }
}
