package zy.day18.Checkpoint1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
//        1.创建字节输出流FileOutputStream对象并指定文件路径。
        FileOutputStream fos = null;
        try {
            fos= new FileOutputStream("D:/a.txt");
//        2.调用字节输出流的write(int byte)方法写出数据
            fos.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
