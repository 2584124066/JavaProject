package zy.day08._05;

public class Test {
    public static void main(String[] args) {
        Cock cock = new Cock(2,"红色","公鸡");
        cock.eat();
        cock.crow();

        Duck duck = new Duck(1,"红色","鸭子");
        duck.eat();
        duck.swim();
    }
}
