package lesson.l18;

import java.io.File;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("d:/a.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(97);
            fos.write(98);
            fos.write(99);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
