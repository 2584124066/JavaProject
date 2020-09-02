package zy.day20.test5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8888);
            OutputStream os = socket.getOutputStream();
            os.write("hello.服务器,我是客户端。".getBytes());
            os.flush();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
