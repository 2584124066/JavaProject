package zy.day17.Checkpoint1;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
//        1. 创建两个文件对象分别关联到不同的文件，比如：D:/a.txt，D:/aaa
        File file1 = new File("D:/a.txt");
        if (file1.isFile()) {
            System.out.println(file1.getName() + "是一个文件");
        } else {
            System.out.println(file1.getName() + "不是一个文件");
        }
        File file2 = new File("D:/aaa");
        if (file2.isDirectory()) {
            System.out.println(file2.getName() + "是一个文件夹");
        } else {
            System.out.println(file2.getName() + "不是一个文件夹");
        }
//        2. 调用文件对象的判断是否是文件或是否是文件夹的方法
//        3. 获得文件名，根据判断结果输出信息。
    }
}
