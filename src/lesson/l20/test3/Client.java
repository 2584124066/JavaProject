package lesson.l20.test3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.138", 6668);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();
            OutputStream os = socket.getOutputStream();
            os.write(next.getBytes());
            if ("end".equals(next)) {
                os.close();
                socket.close();
                return;
            }

            InputStream is = socket.getInputStream();
            int len;
            byte[] b = new byte[1024];
            len = is.read(b);
            String msg = new String(b, 0, len);
            if ("end".equals(msg)) {
                System.out.println("客户端收到客户端消息end，结束通信" );
                is.close();
                os.close();
                socket.close();
                return;
            }
            System.out.println("客户端收到消息：" + msg);
        }
    }
}
