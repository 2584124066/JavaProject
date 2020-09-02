package zy.day10.test2;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callName(Student s,boolean flag){
        s.setAttendance(flag);
    }
}
