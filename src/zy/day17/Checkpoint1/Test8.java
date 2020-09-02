package zy.day17.Checkpoint1;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
//        1. 创建文件对象关联到指定文件夹，比如：d:/aaa
        File file = new File("D:/aaa");
//        2. 调用文件对象的listFiles方法获得文件数组
        File[] files = file.listFiles();
//        3. 遍历文件数组将每一个文件的名字输出到控制台
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
