package lesson.l18;

import java.io.FileReader;
import java.io.IOException;

public class Test9 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("d:/b.txt");
            while (true) {
                int len = fr.read();
                if (len == -1) {
                    break;
                }
                System.out.println((char) len);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
