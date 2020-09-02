package lesson.l17;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("D:\\A1");
        // 调用打印目录方法
        printDir(file);
    }

    private static void printDir(File file) {
        // 获取子文件和目录
        File[] files = file.listFiles();
        // 循环打印
        //判断: 当是文件时,打印绝对路径. 当是目录时,继续调用打印目录的方法,形成递归调用.
        for (File f : files) {
            if (f.isFile()){
                System.out.println(f);
            }else {
                // 是目录,继续遍历,调用printDir,形成递归
                printDir(f);
            }
        }
    }

}
