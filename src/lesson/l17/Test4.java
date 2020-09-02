package lesson.l17;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("D:\\A1");
        //文件目录的遍历
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
