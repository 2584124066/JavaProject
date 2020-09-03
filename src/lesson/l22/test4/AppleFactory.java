package lesson.l22.test4;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        System.out.println("生产了一个苹果");
        return new Apple();
    }
}
