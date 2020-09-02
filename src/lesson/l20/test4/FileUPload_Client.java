package lesson.l20.test4;

import java.io.*;
import java.net.Socket;

public class FileUPload_Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/test.png"));
        Socket socket = new Socket("192.168.1.138", 6669);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        byte[] bytes = new byte[1024];
        while (true) {
            int len = bis.read(bytes);
            if (len == -1) {
                break;
            }
            bos.write(bytes, 0, len);
        }
        bos.flush();
        bos.close();
        socket.close();
        bis.close();
        System.out.println("文件上传完毕");
    }
}