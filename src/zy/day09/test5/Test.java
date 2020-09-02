package zy.day09.test5;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.eat();
        c.eat();

        if (d instanceof Dog){
            Dog d1 = (Dog) d;
            d1.lookHome();
        }
        if (c instanceof Cat){
            Cat c1 = (Cat) c;
            c1.catchMouse();
        }

    }
}
