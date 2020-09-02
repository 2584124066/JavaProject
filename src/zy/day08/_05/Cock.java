package zy.day08._05;

public class Cock extends Fowl {
    private String name;

    public Cock() {
    }

    public Cock(String name) {
        this.name = name;
    }

    public Cock(int age, String color,String name) {
        super(age, color);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(age + "岁的" + color + "的" + name + "在啄米");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void crow() {
        System.out.println(age + "岁的" + color + "的" + name + "在打鸣");
    }
}
