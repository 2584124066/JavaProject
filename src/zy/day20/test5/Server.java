package zy.day20.test5;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            final Socket accept = ss.accept();
            final InputStream is = accept.getInputStream();
            byte[] bytes = new byte[1024];
            while (true) {
                int len = is.read(bytes);
                if (len == -1) {
                    break;
                }
                System.out.println(new String(bytes, 0, len));
            }
            is.close();
            accept.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
