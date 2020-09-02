package lesson.l18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] b = new byte[1024 * 2];
        try {
            fis = new FileInputStream("D:/N2.png");
            fos = new FileOutputStream("D:/n1.png");
            while (true) {
                int len = fis.read(b);
                if (len == -1) {
                    break;
                }
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
