package zy.day08._06;

abstract class Worker {
    String id, name;
    double money;

    public Worker(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public abstract void method();

    public abstract void eat();
}
