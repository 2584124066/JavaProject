package zy.day08._07;

public class Lecturer extends Employee {

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+id+" 的讲师 "+name+" 在讲课");
    }
}
