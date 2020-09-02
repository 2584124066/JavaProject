package zy.day15.test8;

public class Test {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("A");
        Ticket t2 = new Ticket("B");
        Ticket t3 = new Ticket("C");
        Ticket t4 = new Ticket("D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
