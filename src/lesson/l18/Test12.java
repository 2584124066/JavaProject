package lesson.l18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test12 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("d:/a.txt");
            fw = new FileWriter("d:/a1.txt");
            char[] chars = new char[1024];
            while (true) {
                int len = fr.read(chars);
                if (len == -1) {
                    break;
                }
                fw.write(new String(chars, 0, len));
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null && fw != null) {
                try {
                    fw.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
