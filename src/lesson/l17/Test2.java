package lesson.l17;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //文件
        File file = new File("D:\\A1\\hello.txt");
        System.out.println("文件名称："+file.getName());
        System.out.println("文件路径："+file.getPath());
        System.out.println("文件绝对路径："+file.getAbsolutePath());
        System.out.println("文件长度："+file.length()+"字节");

        //文件夹
        File file2 = new File("D:\\A1");
        System.out.println("文件名称："+file2.getName());
        System.out.println("文件路径："+file2.getPath());
        System.out.println("文件绝对路径："+file2.getAbsolutePath());
        System.out.println("文件长度："+file2.length()+"字节");

        System.out.println("文件是否存在："+file2.exists());
        System.out.println("是否为文件夹(目录)："+file2.isDirectory());
        System.out.println("是否为文件："+file2.isFile());
    }
}
