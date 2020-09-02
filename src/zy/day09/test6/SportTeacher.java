package zy.day09.test6;

public class SportTeacher extends Teacher implements Sport  {

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+age+"岁 "+name+" 的老师在打篮球");
    }
}
