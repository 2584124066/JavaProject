package zy.day08._07;

public class Buyer extends AdminStaff {

    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+id+" 的采购专员 "+name+" 在采购音响设备");
    }
}
