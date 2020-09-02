package zy.day17.Checkpoint3;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        delDirectory(new File(string));

    }

    public static void delDirectory(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else {
                File[] files = file.listFiles();
                for (File f : files) {
                    delDirectory(f);
                }
                file.delete();
            }
        }
    }
}
