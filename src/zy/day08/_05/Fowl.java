package zy.day08._05;

abstract class Fowl {
    int age;
    String color;

    public Fowl(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Fowl() {
    }

    public abstract void eat();
}
