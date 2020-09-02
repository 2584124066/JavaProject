package zy.day18.Checkpoint1;

import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] bytes = new byte[1024];
        try {
            fis = new FileInputStream("D:/a.txt");
            while (true) {
                int len = fis.read(bytes);
                if (len == -1) {
                    break;
                }
                System.out.println(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
