package zy.day05._05;

public class Test5 {
    public static void main(String[] args) {
        Manager manager = new Manager("James", "9527", 15000, 3000);
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("============");

        Coder coder = new Coder("Kobe", "0025", 10000);
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
