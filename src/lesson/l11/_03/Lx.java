package lesson.l11._03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lx {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH：mm：ss：sss");
        System.out.println(df.format(new Date()));

        df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒sss毫秒");
        System.out.println(df.format(new Date()));

        Date date = new Date();
        long nowTime = date.getTime();
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        String brothStr = "1998-08-07";
        Date broth = df1.parse(brothStr);
        long brothTime = broth.getTime();
        int result = (int) ((nowTime - brothTime) / 1000 / 60 / 60 / 24);
        System.out.println("您已在这个美丽的世界" + result + "天！");
    }
}
