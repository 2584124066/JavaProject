package lesson.l15.test13;

public class Ticket implements Runnable {
    private TicketBean ticketBean = new TicketBean();

    public Ticket(TicketBean ticketBean) {
        this.ticketBean = ticketBean;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ticketBean) {
                int num = ticketBean.getNum();
                if (num <= 0) {
                    System.out.println("票卖完了");
                    System.exit(1);
                }
                System.out.println(Thread.currentThread().getName() + "：正在卖" + ticketBean.getName() + ",票号：" + num);
                ticketBean.setNum(num - 1);
            }
        }
    }
}
