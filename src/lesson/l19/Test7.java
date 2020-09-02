package lesson.l19;

import java.io.*;
import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        Student student = new Student("老王", 18);
        Student student2 = new Student("老张", 19);
        Student student3 = new Student("老李", 20);
        ArrayList<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/student.txt"));
            oos.writeObject(list);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/student.txt"));
            ArrayList<Student> list1 = (ArrayList<Student>) ois.readObject();
            list1.forEach(stu->{
                System.out.println(stu.getName()+"---"+stu.getAge());
            });

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
