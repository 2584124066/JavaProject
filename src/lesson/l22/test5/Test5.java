package lesson.l22.test5;

import org.junit.Test;

import java.lang.reflect.Method;

public class Test5 {
    @Test
    public void method() throws Exception {
        Class<Phone> phoneClass = Phone.class;
        Phone phone = phoneClass.newInstance();
        Method[] methods = phoneClass.getDeclaredMethods();
        for (Method method : methods) {
            method.invoke(phone);
        }
    }
}
