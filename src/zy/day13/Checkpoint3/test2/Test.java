package zy.day13.Checkpoint3.test2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<HashSet<Student>> discipline = new HashSet<>();
        HashSet<Student> class1 = new HashSet<>();
        HashSet<Student> class2 = new HashSet<>();
        Student[] students = {
                new Student("孙七",17),
                new Student("周八",18),
                new Student("吴九",19),
                new Student("郑十",20),
        };
        class1.add(students[0]);
        class1.add(students[1]);
        class2.add(students[2]);
        class2.add(students[3]);

        discipline.add(class1);
        discipline.add(class2);

        for (HashSet<Student> studentHashSet : discipline) {
            System.out.println(studentHashSet);
        }

    }
}
