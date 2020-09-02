package zy.day08._06;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("m110","老王",10000.0);
        manager.eat();
        manager.method();

        Cooker cooker = new Cooker("c110","小王",6000.0);
        cooker.eat();
        cooker.method();
    }
}
