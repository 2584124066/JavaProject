package zy.day18.Checkpoint1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/a.png");
        FileOutputStream fos = new FileOutputStream("D:/A/a.png");
        byte[] b = new byte[1024];
        while (true) {
            int len = fis.read(b);
            if (len==-1){
                break;
            }
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
