package lesson.l18;

import java.io.File;
import java.io.FileOutputStream;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("d:/a.txt");
        FileOutputStream fos = null;
        byte[] bytes = {101,102,103};
        try {
            fos = new FileOutputStream(file,true);
            fos.write(bytes);
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
