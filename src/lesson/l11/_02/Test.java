package lesson.l11._02;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("张三",20);
        Person person2 = new Person("李四",18);
        Person person3 = new Person("张三",20);
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

        System.out.println(Person.equals2(person1,person2));
        System.out.println(Person.equals2(person1,person3));

    }
}
