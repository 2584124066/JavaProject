package zy.day20.test4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) {
        try (
                ServerSocket ss = new ServerSocket(8888);
                Socket accept = ss.accept();
                InputStream is = accept.getInputStream()
        ) {
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
