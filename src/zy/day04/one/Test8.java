package zy.day04.one;

public class Test8 {
    public static void main(String[] args) {
        double hua = 86.0;
        double she = 30.0;
        double zHua = (9.0 / 5) * she + 32;
        double zShe = (5 * (hua - 32)) / 9;
        System.out.println("摄氏度：" + she + "⁰" + "--华摄氏度" + zHua + "⁰");
        System.out.println("华摄氏度：" + hua + "⁰" + "--摄氏度" + zShe + "⁰");
    }
}
