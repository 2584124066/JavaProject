package lesson.l19;

import java.io.*;
import java.util.HashMap;
/*文本排序*/
public class Lx1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("d:/a1.txt"))
        ) {
            while (true){
                String s = br.readLine();
                if (s==null){
                    break;
                }
                String[] strings = s.split("\\.");
                map.put(Integer.valueOf(strings[0]),strings[1]);
            }
            for (int i = 1; i <= map.size(); i++) {
                String value = map.get(i);
                bw.write(i+"."+value);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
