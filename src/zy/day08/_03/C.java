package zy.day08._03;

public class C extends B {
    int numc = 30;

    @Override
    public void showB() {
        System.out.println("B类中的numb："+numb);
    }

    @Override
    public void showA() {
        System.out.println("A类中的numa："+numa);
    }

    public void showC(){
        System.out.println("C类中的numc："+numc);
    }
}
