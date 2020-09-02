package zy.day19;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (
//        1. 创建字节输入流对象并关联文件路径
                FileInputStream fis = new FileInputStream("d:/c.png");
//        2. 利用字节输入流对象创建高效字节输入流对象
                BufferedInputStream bis = new BufferedInputStream(fis);
//        3. 创建字节输出流对象并关联文件路径
                FileOutputStream fos = new FileOutputStream("d:/c2.png");
//        4. 利用字节输出流对象创建高效字节输出流对象
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
//        5. 创建字节数组用来存放读取的字节数
            byte[] bytes = new byte[1024];
//        6. 利用高效字节输入流循环读取文件数据，每读取一个字节数组，利用高效字节输出流对象将字节数组的内容 输出到目标文件中。直到读取到文件末尾。
            while (true) {
                int len = bis.read(bytes);
                if (len == -1) {
                    break;
                }
                bos.write(bytes, 0, len);
            }
//        7. 关闭高效流对象
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
