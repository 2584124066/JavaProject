package zy.day08._07;

public class Maintainer extends  AdminStaff {

    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("工号为 "+id+" 的维护专员 "+name+" 在解决不能共享屏幕问题");
    }
}
