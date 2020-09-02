package lesson.l13.set;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add(new String("B"));
        set.add("C");
        set.add("A");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
