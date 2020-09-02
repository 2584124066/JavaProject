package zy.day18.Checkpoint2;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("d:/stu.txt");
        System.out.println("录入学生信息，输入格式为：学号-学生名字:");
        while (true) {
            String s = scanner.next();
            if ("end".equals(s)) {
                fos.close();
                break;
            }
            fos.write((s + "\r\n").getBytes());
        }
    }
}
