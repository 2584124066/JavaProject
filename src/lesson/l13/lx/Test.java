package lesson.l13.lx;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("rose", 18));
        list.add(new Student("jack", 16));
        list.add(new Student("abc", 16));
        list.add(new Student("ace", 17));
        list.add(new Student("mark", 19));

        Collections.sort(list,(o1,o2)->{
            int result = o2.getAge()-o1.getAge();
            if (result==0){
                result = o1.getName().charAt(0)-o2.getName().charAt(0);
            }
            return result;
        });

        for (Student student : list) {
            System.out.println(student);
        }

        ArrayList<Student2> list2 = new ArrayList<>();
        list2.add(new Student2("rose", 18));
        list2.add(new Student2("jack", 16));
        list2.add(new Student2("abc", 16));
        list2.add(new Student2("ace", 17));
        list2.add(new Student2("mark", 19));
        Collections.sort(list2);
        for (Student2 student2 : list2) {
            System.out.println(student2);
        }

    }
}
