package zy.day17.Checkpoint1;

import java.io.File;

public class Test3 {
    public static void main(String[] args) throws Exception{
//        1. 创建文件对象指定路径为D:/bbb
        File file = new File("D:\\bbb");
//        2. 调用文件对象创建文件夹的方法
        file.mkdir();
    }
}
