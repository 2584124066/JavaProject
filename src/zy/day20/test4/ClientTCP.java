package zy.day20.test4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8888);
                OutputStream os = socket.getOutputStream()
        ) {
            os.write("你好".getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
