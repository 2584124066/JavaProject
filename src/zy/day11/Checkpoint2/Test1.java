package zy.day11.Checkpoint2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        String str = "1998-08-07";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date broth= df.parse(str);
        long borthTime = broth.getTime();

        Date nowDate = new Date();
        long nowTime = nowDate.getTime();

        int day = (int) ((nowTime-borthTime)/1000/60/60/24);
        System.out.println("您在这个世界上生活了"+day+"天");
    }
}
