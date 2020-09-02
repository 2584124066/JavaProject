package zy.day18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;


public class Checkpoint3 {
    public static File file2 = new File("d:/");//复制到D盘目录下
    public static File file1 = null;
    public static char[] c = new char[1024];

    public static void main(String[] args) throws Exception {
        copyFile(new File("d:/A"));
    }

    public static void copyFile(File file) throws Exception {
        if (file.exists()) {
            //遍历要附近的目录文件
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile()) {//判断是否为文件
                    //遍历D盘目录
                    if (f.getName().endsWith(".java")) {//判断文件后缀名是否以.java结尾
                        File[] f2s = file2.listFiles();
                        for (File f2 : f2s) {
                            if (f.getName().equals(f2.getName())) {//判断D盘目录下是否为相同的文件名
                                //如果有 名字后+uuid 再复制到D盘目录
                                String[] strings = f.getName().split("\\.");
                                String uuid = UUID.randomUUID().toString().replace("-","");
                                file1 = new File("d:/" + strings[0] + uuid + "." + strings[1]);
                                break;
                            } else {
                                file1 = new File("d:/" + f.getName());
                            }
                        }
                        //复制操作
                        FileReader fr = new FileReader(f);
                        FileWriter fw = new FileWriter(file1);
                        while (true) {
                            int len = fr.read(c);
                            if (len == -1) {
                                break;
                            }
                            fw.write(new String(c, 0, len));
                        }
                        fw.flush();
                        fw.close();
                        fr.close();
                    }
                } else if (f.isDirectory()) {
                    copyFile(f);
                }
            }
        }
    }
}
