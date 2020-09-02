package zy.day21.test1;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
    public static Calculator calculator;

    @Before
    public void creatObj() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        System.out.println(calculator.add(4, 2));
    }

    @Test
    public void testMinus() {
        System.out.println(calculator.minus(4, 2));
    }

    @Test
    public void testRide() {
        System.out.println(calculator.ride(4, 2));
    }

    @Test
    public void testDivide() {
        System.out.println(calculator.divide(4, 2));
    }

    @AfterClass
    public static void clearObj(){
        calculator = null;
        System.out.println(calculator);
    }

}
