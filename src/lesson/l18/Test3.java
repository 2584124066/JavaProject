package lesson.l18;

import java.io.File;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("d:/a.txt");
        FileOutputStream fos = null;
        byte[] bytes = "helloworld".getBytes();
        try {
            fos = new FileOutputStream(file);
            fos.write(bytes,1,2);
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
