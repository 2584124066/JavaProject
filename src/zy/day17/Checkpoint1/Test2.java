package zy.day17.Checkpoint1;

import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception {
//        1. 使用绝对路径创建对象关联到D盘的a.txt。
        File file = new File("D:\\a.txt");
//        2. 通过文件对象方法判断文件是否存在。
        if (!file.exists());{
//        3. 不存在则调用创建文件的方法创建文件。
            file.createNewFile();
        }
    }
}
