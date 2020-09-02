package lesson.l12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");

        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
