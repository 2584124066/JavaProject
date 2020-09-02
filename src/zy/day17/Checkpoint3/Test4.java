package zy.day17.Checkpoint3;

import java.io.File;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        printInfo(new File(string));
    }

    public static void printInfo(File file) {
        if (file.exists()) {
            System.out.println(file.getName());
            //1.获取所有文件夹和文件，存储在File数组中
            File[] files = file.listFiles();
            //2.遍历数组
            for (File f : files) {
                //3.无论是文件还是文件夹都需要打印
                System.out.println(f);
            }
            for (File f : files) {
                //4.如果是文件夹，递归调用
                if(f.isDirectory()) {
                    printInfo(f);
                }
            }
        }
    }
}
