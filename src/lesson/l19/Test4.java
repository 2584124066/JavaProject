package lesson.l19;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/a1.txt"));
        printText(isr);
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("d:/a1.txt"), "GBK");
        printText(isr2);
    }

    public static void printText(InputStreamReader isr) throws IOException {
        char[] cs = new char[1024];
        while (true) {
            int len = isr.read(cs);
            if (len == -1) {
                break;
            }
            System.out.println(new String(cs, 0, len));
        }
        isr.close();
    }
}
