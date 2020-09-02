package zy.day18.Checkpoint1;

import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:/a.txt");
        byte[] bytes = {97,98,99};
        fos.write(bytes);
        fos.close();
    }
}
