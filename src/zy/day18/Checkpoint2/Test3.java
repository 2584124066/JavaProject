package zy.day18.Checkpoint2;

import java.io.FileInputStream;

public class Test3 {
    public static void main(String[] args) {
        charCount('a');
    }

    public static void charCount(char c) {
        try (FileInputStream fis = new FileInputStream("D:/test.txt");) {
            int count = 0;
            while (true) {
                int len = fis.read();
                if (len == -1) {
                    System.out.println(c + "出现了" + count + "次");
                    break;
                }
                if (c == len) {
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
