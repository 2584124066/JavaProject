package zy.day04.one;

public class Test4 {
    public static char getChar(int num) {
        char chs = (char) num;
        if (chs >= 'a' && chs <= 'z') {
            return chs;
        }
        if (chs >= 'A' && chs <= 'Z') {
            return chs;
        }
        return ' ';
    }

    public static void main(String[] args) {
        char aChar = getChar(100);
        System.out.println("字符："+aChar);
    }
}
