package zy.day20.test8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 1; i < 30; i++) {
                Socket socket = new Socket("localhost", 7777);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String info = scanner.next();
                bw.write(info);
                bw.newLine();
                bw.flush();

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(br.readLine());
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
