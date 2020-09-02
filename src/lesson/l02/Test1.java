package lesson.l02;

public class Test1 {

    public static void main(String[] args) {

        byte bt = 1;
        int i = 2;
        System.out.println(bt + i);
        System.out.println(100+"1");

        int num1 = 10;
        int num2 = 0;
        System.out.println(num1 += 5);//15
        System.out.println(num1 -= 5);//10
        System.out.println(num1 *= 5);//50
        System.out.println(num1 /= 5);//10
        System.out.println(num1 %= 5);//0

        System.out.println(num1 == 0);
        System.out.println(num1 == num2);

        int result = num1 == num2 ? 1 : 0;
        System.out.println(result);

        int a = 1, b = 3, c = 2;
        char vue = a > b ? (a > c ? 'a' : 'c') : (b > c ? 'b' : 'c');
        System.out.println("最大值：" + vue);
    }
}
