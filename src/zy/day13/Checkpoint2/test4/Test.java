package zy.day13.Checkpoint2.test4;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student[] students = {
                new Student("刘一",11,'女'),
                new Student("陈二",12,'女'),
                new Student("张三",13,'男'),
                new Student("李四",14,'男'),
                new Student("张三",13,'男'),
                new Student("李四",14,'男'),
                new Student("孙七",17,'女'),
                new Student("周八",18,'女'),
                new Student("吴九",19,'女'),
                new Student("郑十",20,'女'),
        };
        for (Student student : students) {
            set.add(student);
        }

        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------");
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
