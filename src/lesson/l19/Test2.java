package lesson.l19;

import java.io.*;

public class Test2 {

    public static void main(String[] args) {
        char[] c = new char[1024];
        try (
                BufferedReader fr = new BufferedReader(new FileReader("d:/br.txt"));
                BufferedWriter fw = new BufferedWriter(new FileWriter("d:/bw.txt"));
        ) {
            while (true) {
                int len = fr.read(c);
                if (len == -1) {
                    break;
                }
                fw.write(c, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
