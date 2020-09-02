package zy.day08._07;

public class Tutor extends Teacher {

    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+id+" 的助教 "+name+" 在帮助学生解决问题");
    }
}
