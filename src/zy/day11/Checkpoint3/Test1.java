package zy.day11.Checkpoint3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2016-12-18";
        Date date = df.parse(str);

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy年MM月dd日");
        System.out.println(sdf.format(date));

        StringBuilder builder = new StringBuilder();
        builder.append("aaa");
        builder.append("bbb");
        System.out.println(builder);

    }
}
