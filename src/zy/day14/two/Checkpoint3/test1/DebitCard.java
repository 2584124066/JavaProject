package zy.day14.two.Checkpoint3.test1;

public class DebitCard {
    private String accountNumber;
    private double money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        if (money<0){
            throw new NegativeExcption("余额不能为负数："+money);
        }
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money<0){
            throw new NegativeExcption("余额为负数："+money);
        }
        this.money = money;
    }
}
