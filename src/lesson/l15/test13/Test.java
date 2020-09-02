package lesson.l15.test13;

public class Test {
    public static void main(String[] args) {
        TicketBean ticketBean = new TicketBean("G9527", 100);
        Ticket ticket = new Ticket(ticketBean);
        Thread t = new Thread(ticket, "广州南");
        Thread t2 = new Thread(ticket, "深圳北");
        Thread t3 = new Thread(ticket, "武汉");
        t.start();
        t2.start();
        t3.start();

    }
}
