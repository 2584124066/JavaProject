package zy.day19;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/a.txt"), "GBK");
            char[] chars = new char[1024];
            while (true) {
                int len = isr.read(chars);
                if (len == -1) {
                    break;
                }
                System.out.println(new String(chars, 0, len));
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
