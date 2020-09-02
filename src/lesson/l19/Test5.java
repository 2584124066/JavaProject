package lesson.l19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test5 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/stu.txt"));
        osw.write("你好");
        osw.close();
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("d:/stu2.txt"),"gbk");
        osw2.write("你好");
        osw2.close();
    }
}
