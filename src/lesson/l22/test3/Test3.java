package lesson.l22.test3;

import org.junit.Test;

public class Test3 {
    @Test
    public void method() {
        FruitFactory fruitFactory = new FruitFactory();
        Apple apple = (Apple) fruitFactory.creatFruit("apple");
        Pear pear = (Pear) fruitFactory.creatFruit("pear");
    }
}
