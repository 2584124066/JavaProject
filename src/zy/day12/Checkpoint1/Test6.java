package zy.day12.Checkpoint1;

import java.util.ArrayList;
import java.util.Collection;

public class Test6 {
    public static void function(Collection<?> t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Collection<String> coll1 = new ArrayList<>();
        coll1.add("String");
        function(coll1);

        Collection<Integer> coll2 = new ArrayList<>();
        coll2.add(Integer.MAX_VALUE);
        function(coll2);
    }
}
