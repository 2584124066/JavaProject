package zy.day04.one;

public class Test5 {

    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println(color+"是红色!");
                break;
            case "blue":
                System.out.println(color+"是蓝色!");
                break;
            case "green":
                System.out.println(color+"绿色!");
                break;
            default:
                System.out.println(color+"颜色未知!");
                break;
        }
    }

    public static void main(String[] args) {
        showColor("red");
    }
}
