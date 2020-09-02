package zy.day08._02;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="旺财";
        dog.eat();
        dog.lookHome();
        System.out.println("-----------------");
        Cat cat = new Cat();
        cat.name="波斯猫";
        cat.eat();
        cat.catchMouse();
    }
}
