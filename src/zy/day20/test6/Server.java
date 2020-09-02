package zy.day20.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            Scanner scanner = new Scanner(System.in);
            Socket accept = ss.accept();
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                String s;
                while ((s = br.readLine()) != null) {
                    if ("exit".equals(s)) {
                        br.close();
                        ss.close();
                        System.out.println("客户端退出，停止接收");
                        return;
                    }
                    System.out.println("客户端发来:\t" + s);

                    System.out.println("回复客户端：");
                    String str = scanner.next();
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                    bw.write(str);
                    bw.newLine();
                    bw.flush();
                    if ("exit".equals(s)) {
                        bw.close();
                        br.close();
                        ss.close();
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
