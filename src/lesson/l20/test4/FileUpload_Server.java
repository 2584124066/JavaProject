package lesson.l20.test4;

import java.io.*;
import java.net.ServerSocket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动..... ");
        ServerSocket ss = new ServerSocket(6669);
        InputStream accept = ss.accept().getInputStream();
        BufferedInputStream bis = new BufferedInputStream(accept);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/"+System.currentTimeMillis()+"copy.png"));
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
        bis.close();
        accept.close();
        System.out.println("文件已上传");
    }
}
