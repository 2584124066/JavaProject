package zy.day20.test7;

import java.io.*;
import java.net.Socket;

public class UpFile {
    public static void main(String[] args) {
        try {
            byte[] bytes = new byte[1024];
            for (int i = 0; i < 30; i++) {
                Socket socket = new Socket("localhost", 8888);
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/1.java"));
                BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                while (true) {
                    int len = bis.read(bytes);
                    if (len == -1) {
                        bos.flush();
                        socket.shutdownOutput();
                        InputStream is = socket.getInputStream();
                        while (true) {
                            int len2 = is.read(bytes);
                            if (len2 == -1) {
                                is.close();
                                break;
                            }
                            System.out.println(new String(bytes, 0, len2));
                        }
                        break;
                    }
                    bos.write(bytes, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
