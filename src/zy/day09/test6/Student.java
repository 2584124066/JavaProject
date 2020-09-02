package zy.day09.test6;

public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("年龄为"+age+"岁 "+name+" 的学生在吃饭");
    }
}
