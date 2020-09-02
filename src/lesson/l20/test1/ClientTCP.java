package lesson.l20.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("192.168.1.138", 6666);
        // 2.获取流对象 . 输出流
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("你好么? tcp ,我来了".getBytes());

        // ==============解析回写=========================
        //1.通过Socket,获取 输入流对象
        InputStream is = client.getInputStream();
        //2.读取数据数据
        byte[] b = new byte[100];
        int len = is.read(b);
        System.out.println(new String(b, 0, len));

        // 4. 关闭资源 .
        is.close();
        os.close();
        client.close();
    }
}
