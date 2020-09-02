package lesson.l18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        byte[] words = {97,98,99,100,101};
        for (byte word : words) {
            fos.write(word);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
