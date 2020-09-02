package zy.day20.test9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BackImg {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ServerSocket ss = new ServerSocket(8888);
        byte[] bytes = new byte[1024];
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Socket accept = ss.accept();
                        //接收
                        BufferedInputStream acceptBis = new BufferedInputStream(accept.getInputStream());
                        while (true) {
                            int len = acceptBis.read(bytes);
                            if (len == -1) {
                                accept.shutdownInput();
                                break;
                            }
                            System.out.println(new String(bytes, 0, len));
                        }
                        //发送
                        System.out.println("正在发送照片......");
                        Thread.sleep(3000);
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/a.png"));
                        BufferedOutputStream acceptBos = new BufferedOutputStream(accept.getOutputStream());
                        while (true) {
                            int len = bis.read(bytes);
                            if (len == -1) {
                                acceptBos.flush();
                                acceptBos.close();
                                System.out.println("成功发送");
                                break;
                            }
                            acceptBos.write(bytes, 0, len);
                        }
                    }
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.submit(thread);
        executorService.submit(thread);
        executorService.submit(thread);
        executorService.submit(thread);
        executorService.submit(thread);
    }
}
