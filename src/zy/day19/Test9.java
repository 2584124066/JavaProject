package zy.day19;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        try {
            PrintStream ps = new PrintStream("d:/d.txt");
            System.setOut(ps);
            System.out.println(s);
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
