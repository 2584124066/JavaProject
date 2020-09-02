package zy.day05._05;

public class Manager {
    private String name, number;
    private int money, jiang;

    public Manager() {

    }

    public Manager(String name, String number, int money,int jiang) {
        this.name = name;
        this.number = number;
        this.money = money;
        this.jiang = jiang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getJiang() {
        return jiang;
    }

    public void setJiang(int jiang) {
        this.jiang = jiang;
    }

    public void intro() {
        System.out.println("经理姓名:" + name + "\n工号:" + number);
    }

    public void showSalary() {
        System.out.println("基本工资为" + money + ",奖金为"+jiang);
    }

    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
