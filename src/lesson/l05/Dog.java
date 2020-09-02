package lesson.l05;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog() {
    }
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void shake(String uName){
        System.out.println("年龄"+age+"岁的"+color+name+"犬，正在向"+uName+"摇尾巴。");
    }
}
