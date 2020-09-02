package zy.day20.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ServerSocket ss = new ServerSocket(8888);
        byte[] bytes = new byte[1024];
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String s = UUID.randomUUID().toString().replace("-", "");
                    Socket accept = null;
                    try {
                        accept = ss.accept();
                        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/java/" + s + ".java"));
                        while (true) {
                            int len = bis.read(bytes);
                            if (len == -1) {
                                bos.flush();
                                break;
                            }
                            bos.write(bytes, 0, len);
                        }

                        OutputStream os = accept.getOutputStream();
                        os.write("上传成功".getBytes());
                        os.flush();
                        os.close();
                        Thread.sleep(2000);
                    } catch (IOException | InterruptedException e) {
                        OutputStream os = null;
                        try {
                            os = accept.getOutputStream();
                            os.write("上传失败".getBytes());
                            os.flush();
                            break;
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        e.printStackTrace();
                    }
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
