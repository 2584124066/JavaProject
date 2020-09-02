package lesson.l19;

import java.io.*;

public class Test1 {
    public static final byte[] b = new byte[1024];

    public static void test1() {
        long star = System.currentTimeMillis();
        try (
                FileInputStream fis = new FileInputStream("D:/test/1.mp4");
                FileOutputStream fos = new FileOutputStream("D:/test/file.mp4");
        ) {
            while (true) {
                int len = fis.read(b);
                if (len == -1) {
                    break;
                }
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - star);
    }

    public static void main(String[] args){
        test1();
        test2();
    }

    public static void test2() {
        long star = System.currentTimeMillis();
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/test/1.mp4"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/test/buffer.mp4"));
        ) {
            while (true) {
                int len = bis.read(b);
                if (len == -1) {
                    break;
                }
                bos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - star);
    }

}
