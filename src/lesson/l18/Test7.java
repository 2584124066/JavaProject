package lesson.l18;

import java.io.FileInputStream;

public class Test7 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/a.txt");
            byte[] b = new byte[1024];
            while (true) {
                //从输入流中读取一些字节数，并将他们存储到字节数组b中
                int len = fis.read(b);
                if (len == -1) {
                    break;
                }
                System.out.println(new String(b, 0, len));
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
