package lesson.l13;

import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,2,1,4,3,5);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"5","2","1","4","3","5");
        System.out.println(list2);
        Collections.sort(list2,(a,b)->{
            return a.charAt(0) - b.charAt(0);
        });
        System.out.println(list2);

    }
}
