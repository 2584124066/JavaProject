package zy.day17.Checkpoint1;

import java.io.File;

public class Test6 {
    public static void main(String[] args) throws Exception{
//        1. 在d盘aaa文件夹中创建一个b.txt文件并输入数据
        File file = new File("D:/b.txt");
        file.createNewFile();
//        文件名
        System.out.println(file.getName());
//        文件大小
        System.out.println(file.length());
//        文件的绝对路径
        System.out.println(file.getAbsolutePath());
//        文件的父路径
        System.out.println(file.getParent());

//        2. 创建文件对象关联路径：D:/aaa/b.txt
        File file2 = new File("D:/aaa");
        file2.mkdir();
        File file3 = new File(file2,"b.txt");
        file3.createNewFile();
//        3. 调用文件对象的相关方法获得信息并输出。可以通过API帮助文档查询方法。
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
    }
}
