package lesson.l20.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        ServerSocket serverSocket = new ServerSocket(6667);
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Socket socket = serverSocket.accept();
                        InputStream is = socket.getInputStream();
                        int len;
                        byte[] b = new byte[1024];
                        len = is.read(b);
                        String msg = new String(b, 0, len);
                        //假如每次服务器端处理客户请求需要耗时5秒
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + "服务器端收到消息：" + msg);
                        OutputStream os = socket.getOutputStream();
                        os.write("收到".getBytes());
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        es.submit(thread);
        es.submit(thread);
    }
}
