package lesson.l18;

import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/a.txt");
        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 关闭资源
        fis.close();




    }
}
