package zy.day19;

import zy.day19.test7.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/stu.txt"));
            Student student = (Student) ois.readObject();
            System.out.println(student);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
