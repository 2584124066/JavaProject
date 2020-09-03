package lesson.l22.test4;

public class PearFactory implements FruitFactory {

    @Override
    public Fruit createFruit() {
        System.out.println("生产了一个梨");
        return new Pear();
    }
}
