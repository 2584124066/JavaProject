package zy.day20.test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String str = scanner.next();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw.write(str);
                bw.newLine();
                bw.flush();
                if ("exit".equals(str)) {
                    bw.close();
                    socket.close();
                    return;
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String s = br.readLine();
                if ("exit".equals(s)) {
                    br.close();
                    bw.close();
                    socket.close();
                    return;
                }
                System.out.println("服务器端发来:\t" + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
