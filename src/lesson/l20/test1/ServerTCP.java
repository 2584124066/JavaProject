package lesson.l20.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(6666);
        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket accept = ss.accept();
        // 3.通过socket 获取输入流
        InputStream is = accept.getInputStream();

        byte[] b = new byte[1024];
        int len = is.read(b);
        String msg = new String(b, 0, len);
        System.out.println(msg);
        System.out.println(accept.getInetAddress().getHostAddress());

        //=================回写数据=======================
        //1.通过 socket 获取输出流
        OutputStream os = accept.getOutputStream();
        //2.回写数据
        os.write("我很好,谢谢你".getBytes());

        //关闭资源.
        os.close();
        is.close();
        accept.close();
    }
}
