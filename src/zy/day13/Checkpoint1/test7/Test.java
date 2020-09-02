package zy.day13.Checkpoint1.test7;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Person> person = new HashSet<>();
        person.add(new Person("孙七",17));
        person.add(new Person("周八",18));
        person.add(new Person("吴九",19));
        person.add(new Person("周八",18));

        for (Person p : person) {
            System.out.println(p);
        }

    }
}
