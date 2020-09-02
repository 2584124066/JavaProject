package zy.day18.Checkpoint2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static byte[] b = new byte[1024];

    public static void main(String[] args) throws Exception {
        copyFile(new File("D:/d1"));
    }

    public static void copyFile(File file) throws Exception {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream("d:/d2/"+f.getName());
                while (true){
                    int len = fis.read(b);
                    if (len==-1){
                        break;
                    }
                    fos.write(b,0,len);
                }
                fos.close();
                fis.close();
            } else {
                copyFile(f);
            }
        }
    }
}
