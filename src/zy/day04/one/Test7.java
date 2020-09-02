package zy.day04.one;

public class Test7 {
    public static int round(double num){
        return (int)(num+0.5);
    }
    public static void main(String[] args) {
        System.out.println("10.1->"+round(10.1));
        System.out.println("10.4->"+round(10.4));
        System.out.println("10.5->"+round(10.5));
        System.out.println("10.9->"+round(10.9));
    }
}
