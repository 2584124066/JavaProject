package lesson.l01;//包名
//创建了一个类
public class test1 {
    public static void main(String[] args) {
        System.out.println("hello world");

        //整数
        System.out.println(10);
        //浮点数
        System.out.println(1.1);
        //字符
        System.out.println('a');
        //字符串
        System.out.println("abc");
        //布尔
        System.out.println(true);

        byte byteNum = 10;
        short shortNum = 20;
        long longNum = 30L;

        float floatNum = 3.123456F;
        double doubleNum = 5.12;

        char charNum = 'a';

        boolean flag = true;
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(charNum);
        System.out.println(flag);

        {//块级作业域
            int num = 20;
        }

    }
}
