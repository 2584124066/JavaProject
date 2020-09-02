package lesson.l11._03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        // 创建日期对象，获取当前的时间
        Date date = new Date();
        System.out.println(date);

        //创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将Date对象格式化为字符串
        String dateStr = df.format(date);
        System.out.println(dateStr);

        //将字符串解析为Date对象
        date = df.parse(dateStr);
        System.out.println(date);
    }
}
