package zy.day19.test7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("孙七", 27, '男');
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/stu.txt"));
            oos.writeObject(stu);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
