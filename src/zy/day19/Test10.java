package zy.day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("d:/test.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
            Collections.reverse(list);
            bw = new BufferedWriter(new FileWriter("d:/test1.txt"));
            for (String str : list) {
                bw.write(str);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
