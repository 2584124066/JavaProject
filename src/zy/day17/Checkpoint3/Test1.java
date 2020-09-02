package zy.day17.Checkpoint3;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        printInfo(new File("D:/A1"));
    }

    public static void printInfo(File file) {
        File[] files = file.listFiles(f -> f.length() < 200);
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f);
            } else {
                printInfo(f);
            }
        }
    }
}
