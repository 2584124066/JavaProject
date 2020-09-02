package lesson.l18;

import java.io.FileReader;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("d:/b.txt");
            char[] chars = new char[2];
            while (true) {
                int len = fr.read(chars);
                if (len == -1) {
                    break;
                }
                System.out.println(new String(chars,0,len));
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
