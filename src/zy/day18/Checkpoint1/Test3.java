package zy.day18.Checkpoint1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:/a.txt",true);
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
