package lesson.l20.test2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            Socket socket = new Socket("192.168.1.138", 6667);
            OutputStream os = socket.getOutputStream();
            os.write(("我是第" + i + "个客户端").getBytes());
            os.close();
            socket.close();
        }
    }
}
