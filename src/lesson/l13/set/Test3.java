package lesson.l13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
