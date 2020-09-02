package zy.day09.test7;

public class Company implements Money {
    private double zong = 1000000.0;
    @Override
    public void paySalary(Employee emp) {
        zong = zong-emp.getMoney();
        System.out.println("给"+emp.getName()+"发工资 "+emp.getMoney()+" 元,公司还剩余:"+zong+"元");
    }
}
