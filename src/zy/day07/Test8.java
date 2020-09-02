package zy.day07;

public class Test8 {
    public static int getCount(String str, String ch) {
        int count = 0;
        while (str.indexOf(ch)!=-1){
            int index = str.indexOf(ch);
            str = str.substring(index+ch.length());
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "javajfiewjavajfiowfjavagkljjava";
        System.out.println(string+"字符串中java的数量："+getCount(string,"java"));
    }
}
