package lesson.l18;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("d:/a.txt");
        FileOutputStream fos = null;
        byte[] bytes = {97,98,99,100};
        try {
            fos = new FileOutputStream(file);
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
