package lesson.l20.test5;

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
        socket.shutdownOutput();//关闭输出流
        bis.close();
        System.out.println("文件上传完毕");

        InputStream is = socket.getInputStream();
        byte[] back = new byte[1024];
        is.read(back);
        System.out.println(new String(back));
        is.close();

        socket.close();
    }
}