package zy.day19.test11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("孙七", 27, '女');
        Student student2 = new Student("周八", 28, '男');
        Student student3 = new Student("吴九", 29, '女');
        Student student4 = new Student("郑十", 30, '男');
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, student1, student2, student3, student4);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/stus.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/stus.txt"));
        ) {
            oos.writeObject(list);
            oos.flush();

            ArrayList<Student> list1 = (ArrayList<Student>) ois.readObject();
            for (Student stu : list1) {
                System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getSex());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
