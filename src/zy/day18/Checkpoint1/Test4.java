package zy.day18.Checkpoint1;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/a.txt");
            while (true) {
                int len = fis.read();
                if (len == -1) {
                    break;
                }
                System.out.println((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
