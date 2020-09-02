package zy.day21.test7;

import java.lang.reflect.Constructor;

public class Test7 {
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;
        Constructor<Person> dt = pc.getDeclaredConstructor(String.class, Integer.class);
        dt.setAccessible(true);
        Person person = dt.newInstance("孙七", 27);
        System.out.println(person.toString());
    }
}
