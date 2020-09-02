package zy.day20.test8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws Exception {
        //获取用户名和密码 存到info集合
        HashMap<String, String> info = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("d:/info.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            String[] strArr = s.split("=");
            info.put(strArr[0], strArr[1]);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/info.txt", true));
        //设置线程池
        ExecutorService es = Executors.newFixedThreadPool(10);
        ServerSocket ss = new ServerSocket(7777);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Socket accept = null;
                    try {
                        accept = ss.accept();
                        BufferedReader br2 = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                        String s2 = br2.readLine();
                        System.out.println(s2);
                        String[] strArr = s2.split("=");
                        if (info.containsKey(strArr[0])) {
                            if (!info.get(strArr[0]).equals(strArr[1])) {
                                bw2.write("密码不正确");
                                bw2.newLine();
                                bw2.flush();
                            } else {
                                bw2.write("登录成功");
                                bw2.newLine();
                                bw2.flush();
                            }
                        } else {
                            //用户名不存在注册一个账号
                            bw.write(s2);
                            bw.newLine();
                            bw.flush();
                            info.put(strArr[0], strArr[1]);

                            bw2.write("注册成功");
                            bw2.newLine();
                            bw2.flush();
                        }
                    } catch (IOException e) {
                        try {
                            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                            bw2.write("注册失败");
                            bw2.newLine();
                            bw2.flush();
                            break;
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        e.printStackTrace();
                    }
                }
            }
        });
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
        es.submit(thread);
    }
}
