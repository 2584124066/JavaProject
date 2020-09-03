package lesson.l22.test3;

public class FruitFactory {
    public Fruit creatFruit(String type) {
        if (type.equals("apple")) {
            System.out.println("生产了一个苹果");
            return new Apple();
        } else if (type.equals("pear")) {
            System.out.println("生产了一个梨");
            return new Pear();
        }
        return null;
    }
}
