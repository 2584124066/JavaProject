package zy.day08._06;

public class Manager extends Worker {

    public Manager(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void method() {
        System.out.println("工号为："+id+",姓名为:"+name+"工资为:"+money+"的经理在工作，管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("工号为："+id+",姓名为:"+name+"工资为:"+money+"的经理在吃鱼");
    }
}
