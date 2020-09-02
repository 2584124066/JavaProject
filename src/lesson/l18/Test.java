package lesson.l18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:/1.java");
        FileWriter fw = new FileWriter("d:/2.java");
        while (true) {
            int len = fr.read();
            if (len != -1) {
                break;
            }
            fw.write((char) len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
}
