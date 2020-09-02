package zy.day19;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream("d:/a.txt"),"GBK");
            isr.write("我爱Java");
            isr.flush();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
