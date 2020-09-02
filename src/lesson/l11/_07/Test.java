package lesson.l11._07;

public class Test {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder);

        StringBuilder sb = new StringBuilder("abcd");
        System.out.println(sb);

        StringBuilder builder1 = builder.append("ABCD");
        System.out.println(builder == builder1);
        System.out.println(builder.equals(builder1));

        builder.append("hello");
        builder.append("world");
        builder.append(true);
        builder.append(100);
        System.out.println(builder);

        StringBuilder builder2 = new StringBuilder();
        builder2.append("hello").append("world").append(true).append(100);
        System.out.println(builder2);

        String str= builder2.toString();
        System.out.println(str);

    }
}
