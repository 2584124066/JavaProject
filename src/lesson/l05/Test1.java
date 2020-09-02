package lesson.l05;

public class Test1 {
    //两数和
    public static void getSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
    //两个数比较大小
    public static void twoMax(int num1, int num2) {
        int result = num1 > num2 ? num1 : num2;
        System.out.println("最大值：" + result);
    }

    //三个数比较大小
    public static void threeMax(int a, int b, int c) {
        int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("最大值：" + result);
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        getSum(num1, num2);
        twoMax(10, 20);
        threeMax(num1,num2,num3);
    }
}
