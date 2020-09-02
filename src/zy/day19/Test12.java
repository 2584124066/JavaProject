package zy.day19;

import java.io.*;

public class Test12 {
    public static void main(String[] args) {
        try (
                InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/a.txt"), "GBK");
                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/b.txt"));
        ) {
            char[] chars = new char[1024];
            while (true) {
                int len = isr.read(chars);
                if (len == -1) {
                    break;
                }
                osw.write(chars, 0, len);
            }
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
