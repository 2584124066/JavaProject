package lesson.l11._04;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 获取年
        int year = calendar.get(Calendar.YEAR);
        // 获取月
        int month = calendar.get(Calendar.MONTH) + 1;
        // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //获取周
        String[] weeks = {"星期天", "星期一", "星期二", "星期三", "星期天", "星期天", "星期天",};
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String week = weeks[dayOfWeek];
        //获取时
//        int second = calendar.get(Calendar.HOUR); 十二小时制
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //获取分
        int minute = calendar.get(Calendar.MINUTE);
        //获取秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + hour + "分" + hour + "秒");

        //获取date对象
        System.out.println(calendar.getTime());
    }
}
