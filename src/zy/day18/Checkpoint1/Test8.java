package zy.day18.Checkpoint1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("D:/Info.txt");
        while (true) {
            String s = scanner.next();
            if ("886".equals(s)) {
                fos.close();
                break;
            } else {
                fos.write((s + "\r\n").getBytes());
            }
        }
    }
}
