package zy.day17.Checkpoint1;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
//        1. 创建文件对象关联路径：d:/a.txt
        File file = new File("d:/a.txt");
//        2. 调用文件对象删除文件的方法
        file.delete();
//        3. 创建文件对象关联路径：d:/aaa
        File file2 = new File("d:/a.txt");
//        4. 调用文件对象删除文件的方法
        file2.delete();
    }
}
