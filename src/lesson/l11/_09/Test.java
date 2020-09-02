package lesson.l11._09;

public class Test {
    public static void main(String[] args) {

        int num = 100;
        String s = 100+"";
        System.out.println(s);

        String str = "127";
        System.out.println(Byte.parseByte(str));
        System.out.println(Short.parseShort(str));
        System.out.println(Integer.parseInt(str));
        System.out.println(Long.parseLong(str));
        System.out.println(Float.parseFloat(str));
        System.out.println(Double.parseDouble(str));
        System.out.println(Boolean.parseBoolean(str));

    }
}
