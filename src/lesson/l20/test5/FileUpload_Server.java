package lesson.l20.test5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动..... ");
        ServerSocket ss = new ServerSocket(6669);
        byte[] bytes = new byte[1024];
        while (true) {
            Socket accept = ss.accept();
            new Thread(() -> {
                try (
                        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/" + System.currentTimeMillis() + ".png"));
                ) {
                    while (true) {
                        int len = bis.read(bytes);
                        if (len == -1) {
                            break;
                        }
                        bos.write(bytes, 0, len);
                    }
                    Thread.sleep(1000);
                    OutputStream os = accept.getOutputStream();
                    os.write("上传成功".getBytes());
                    os.flush();
                    os.close();
                    System.out.println("文件已上传");
                    System.out.println(os);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
