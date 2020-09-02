package lesson.l07;

public class Test4 {
    public static void main(String[] args) {
        String str = "helloWorld";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println();

        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println();

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());




    }
}
