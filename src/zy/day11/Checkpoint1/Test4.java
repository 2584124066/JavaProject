package zy.day11.Checkpoint1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        String broth = "1998-08-07";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(broth);
        System.out.println(date);
    }
}
