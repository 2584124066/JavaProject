package zy.day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
            try (
//        1. 创建字节输出流对象关联文件路径
                    FileOutputStream fos = new FileOutputStream("d:/c.txt");
//        2. 利用字节输出流对象创建高效字节输出流对象
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
            ) {
//        3. 调用高效字节输出流对象的write方法写出一个字节
                bos.write("你好啊，勇士！\r\n".getBytes());
                bos.write("今天又是充满七万的一天\r\n".getBytes());
                bos.write("阿拉德大陆我守护不起了！\r\n".getBytes());
//        4. 关闭高效流，释放资源。
                bos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
