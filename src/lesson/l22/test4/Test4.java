package lesson.l22.test4;

import org.junit.Test;

public class Test4 {
    @Test
    public void method() {
        AppleFactory appleFactory = new AppleFactory();
        PearFactory pearFactory = new PearFactory();
        Apple apple = (Apple) appleFactory.createFruit();
        Pear pear = (Pear) pearFactory.createFruit();
    }
}
