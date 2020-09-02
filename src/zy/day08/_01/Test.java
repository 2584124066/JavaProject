package zy.day08._01;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.name = "马化腾";
        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("------------");
        Teacher teacher = new Teacher();
        teacher.name = "马云";
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}
