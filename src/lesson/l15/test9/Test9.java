package lesson.l15.test9;

public class Test9 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t, "广州南");
        Thread t2 = new Thread(t, "深圳北");
        Thread t3 = new Thread(t, "广州东");

        t1.start();
        t2.start();
        t3.start();
    }
}
