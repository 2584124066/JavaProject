package zy.day20.test9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8888);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //请求
        bos.write("向服务端请求发送照片".getBytes());
        bos.flush();
        socket.shutdownOutput();
        //接收
        byte[] bytes = new byte[1024];
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("d:/backImg.png"));
        while (true) {
            int len = bis.read(bytes);
            if (len == -1) {
                bos2.flush();
                bis.close();
                System.out.println("照片下载成功");
                break;
            }
            bos2.write(bytes, 0, len);
        }
    }
}
