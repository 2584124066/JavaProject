package zy.day08._06;

public class Cooker extends Worker {

    public Cooker(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void method() {
        System.out.println("工号为："+id+",姓名为:"+name+"工资为:"+money+"的厨师在工作，炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为："+id+",姓名为:"+name+"工资为:"+money+"的厨师在吃肉");
    }
}
