package lesson.l19;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(97);
        try {
            PrintStream ps = new PrintStream("d:/print.txt");
            System.setOut(ps);
            System.out.println(98);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
