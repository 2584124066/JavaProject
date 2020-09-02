package lesson.l11._02;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        // 如果对象地址一样，则认为相同
        if (this == o) {
            return true;
        }
        // 如果参数为空，或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // 转换为当前类型
        Person person = (Person) o;
        // 要求基本类型相等，并且将引用类型交给java.util.Objects类的equals静态方法取用结果
        return age == person.age && name.equals(person.name);
    }
    //👆优化

    public static boolean equals2(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
