package lesson.l11._04;

import java.util.Calendar;

public class Test2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年"+month + "年"+day + "日");

        //设置
        calendar.set(Calendar.YEAR,2021);
        int year1 = calendar.get(Calendar.YEAR);
        System.out.println(year + "年");

        //add
        calendar.add(Calendar.MONTH, -3);
        int month1 = calendar.get(Calendar.MONTH) ;
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(month1+"月");
        System.out.println(day1+"日");

        //getTime
        System.out.println(calendar.getTime());
    }
}
