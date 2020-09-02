package lesson.l17;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:\\A1\\hello.txt");

        String parentPath = "D:\\A";
        String childPath = "hello.txt";
        File file2 = new File(parentPath,childPath);

        File parent = new File("D:\\A1");
        String childPath2 = "hello.txt";
        File file3 = new File(parent,childPath2);




    }
}
