package lesson.l07;

public class Test3 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str："+str);
        System.out.println("str的长度：" + str.length());
        System.out.println("str拼接字符串：" + str.concat(" password"));
        System.out.println("获取str索引为4的字符：" + str.charAt(4));
        System.out.println("str中 l 第一次出现的索引：" + str.indexOf("l"));
        System.out.println("str中 l 最后一次出现从索引" + str.lastIndexOf("l"));
        System.out.println("str从索引0截取到索引2(不包含2)的字符串为：" + str.substring(0,2));
        System.out.println("str是否以 he 开始：" + str.startsWith("he"));
        System.out.println("str是否以 lo 结束：" + str.endsWith("lo"));
    }
}
