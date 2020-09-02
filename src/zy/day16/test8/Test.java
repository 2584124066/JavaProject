package zy.day16.test8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student[] students = {
                new Student("刘一",100),
                new Student("陈二",20),
                new Student("张三",40),
                new Student("李四",30),
                new Student("王五",80),
                new Student("赵六",60),
                new Student("孙七",70),
                new Student("周八",50),
                new Student("吴九",90),
                new Student("郑十",10)
        };
        list.addAll(Arrays.asList(students));

        Collections.sort(list, (Student1,Student2)->{
                return Student1.getScore() - Student2.getScore() ;
        });
        System.out.println(list);

    }
}
