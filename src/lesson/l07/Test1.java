package lesson.l07;

public class Test1 {
    public static void main(String[] args) {
        String str1 = "str1";
        System.out.println(str1);

        String str2 = new String("str2");
        System.out.println(str2);

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        System.out.println(str3);

        byte[] bytes = {65, 66, 67, 68, 69};
        String str4 = new String(bytes);
        System.out.println(str4);

        String str5 = new String(bytes, 2, 3);
        System.out.println(str5);

        str1 = "admin";
        str2 = "admin";
        str3 = "ADMIN";
        System.out.println("str1："+str1);
        System.out.println("str2："+str2);
        System.out.println("str3："+str3);
        System.out.println("str1==str2：" + (str1 == str2));
        System.out.println("str1.equals(str2)：" + str1.equals(str2));
        System.out.println("hello.equals(str1)：" + "hello".equals(str1));
        System.out.println("str1.equals(str3)：" + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str2)：" + str1.equalsIgnoreCase(str3));

        System.out.println("str1的长度："+str1.length());
        System.out.println("str1拼接字符串："+str1.concat(" password"));
        System.out.println("获取str1索引为4的字符："+str1.charAt(4));
        System.out.println("str1索引为4的字符："+str1.charAt(4));

    }
}
