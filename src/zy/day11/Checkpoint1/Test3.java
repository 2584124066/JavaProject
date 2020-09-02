package zy.day11.Checkpoint1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = df.format(now);
        System.out.println(str);
    }
}
