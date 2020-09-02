package zy.day17.Checkpoint1;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
//        1. 创建文件对象关联路径：d:/ccc/bbb/aaa
        File file = new File("d:/ccc/bbb/aaa");
//        2.调用文件对象创建多级文件夹的方法
        file.mkdirs();
    }
}
