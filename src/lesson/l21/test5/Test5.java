package lesson.l21.test5;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test5 {
    @Test
    public void method() {
        //获取类上面的注解
        Class c = ComputerTest.class;
        if (c.isAnnotationPresent(Computer.class)) {
            //因为可能有多个注解,所以要指定哪一个注解
            Computer computer = (Computer) c.getAnnotation(Computer.class);
            System.out.println(computer.name());
            System.out.println(computer.price());
            System.out.println(computer.factories());
        }
    }

    @Test
    public void method2() throws Exception {
        Class c = ComputerTest.class;
        Method buy = c.getDeclaredMethod("buy");
        if (buy.isAnnotationPresent(Computer.class)) {
            Computer computer = buy.getAnnotation(Computer.class);
            System.out.println(computer.name());
            System.out.println(computer.price());
            System.out.println(computer.factories());
        }
    }

}
