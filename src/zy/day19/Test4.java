package zy.day19;

import java.io.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("d:/data.txt"));
            Scanner scanner = new Scanner(System.in);
            System.out.println("录入字符串：");
            for (int i = 0; i < 3; i++) {
                String next = scanner.next();
                bw.write(next);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            System.out.println("验证字符串：");
            BufferedReader br = new BufferedReader(new FileReader("d:/data.txt"));
            String s = scanner.next();
            boolean flag = false;
            String line;
            while ((line = br.readLine())!=null){
                if (line.equals(s)){
                    flag=true;
                    break;
                }
            }
            br.close();
            if (flag){
                System.out.println("验证成功");
            }else {
                System.out.println("验证失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
