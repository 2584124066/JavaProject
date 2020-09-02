package lesson.l13.set;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Student> stuSet = new HashSet<>();

        Student stu = new Student("于谦", 43);
        stuSet.add(stu);
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟", 23));
        stuSet.add(stu);

        for (Student student : stuSet) {
            System.out.println(student);
        }
    }
}
