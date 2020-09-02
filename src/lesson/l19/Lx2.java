package lesson.l19;

import java.io.*;

/*转换文件编码*/
public class Lx2 {
    public static void main(String[] args) throws IOException {
//        1. 指定GBK编码的转换流，读取文本文件。
//        2. 使用UTF-8编码的转换流，写出文本文件。
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/a1.txt"),"GBK");
        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("d:/a2.txt"));
        char[] chars = new char[1024];
        while (true){
            int len = isr.read(chars);
            if (len==-1){
                break;
            }
            osw.write(new String(chars,0,len));
        }
        osw.flush();
        osw.close();
        isr.close();
    }
}
