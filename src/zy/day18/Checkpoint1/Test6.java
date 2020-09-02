package zy.day18.Checkpoint1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:/a.png");
            fos = new FileOutputStream("D:/A/a.png");
            while (true){
                int len = fis.read();
                if (len==-1){
                    break;
                }
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
