package zy.day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try {
//        1. 创建字节输出流对象关联文件路径
            FileOutputStream fos = new FileOutputStream("d:/e.txt");
//        2. 利用字节输出流对象创建高效字节输出流对象
            BufferedOutputStream bos = new BufferedOutputStream(fos);
//        3. 定义字符串存放要输出的数据，然后将字符串转换为字节数组。
            byte[] bytes = "i love java".getBytes();
//        4. 调用高效字节输出流对象的write方法将字节数组输出。
            bos.write(bytes);
//        5. 关闭高效流。
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
