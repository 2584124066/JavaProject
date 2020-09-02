package lesson.l07;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "admin";
        String str2 = "admin";
        String str3 = "ADMIN";
        System.out.println("str1：" + str1);
        System.out.println("str2：" + str2);
        System.out.println("str3：" + str3);
        System.out.println("str1==str2：" + (str1 == str2));
        System.out.println("str1.equals(str2)：" + str1.equals(str2));
        System.out.println("hello.equals(str1)：" + "hello".equals(str1));
        System.out.println("str1.equals(str3)：" + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str2)：" + str1.equalsIgnoreCase(str3));



    }
}
