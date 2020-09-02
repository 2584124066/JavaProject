package zy.day08._05;

public class Duck extends Fowl{
    private String name;
    public Duck() {
    }

    public Duck(int age, String color,String name) {
        super(age, color);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(age+"岁的"+color+"的"+name+"在吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void swim(){
        System.out.println(age+"岁的"+color+"的"+name+"在游泳");
    }
}
