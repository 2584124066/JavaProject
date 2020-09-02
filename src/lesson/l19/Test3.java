package lesson.l19;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("d:/br.txt"));
            while (true) {
                String s = br.readLine();
                if (s == null) {
                    break;
                }
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("d:/bw.txt", true));
        ) {
            bw.write("\r\n");
            bw.write("a");
            bw.newLine();
            bw.write("b");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
