package lesson.l15.test13;

public class TicketBean {
    //票面信息
    private String name;
    //数量
    private int num;

    public TicketBean() {
    }

    public TicketBean(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
