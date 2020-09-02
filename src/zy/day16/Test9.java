package zy.day16;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        //使用lambda表达式对List，Set，Map集合进行遍历。

//        List
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        list.stream().forEach(n->System.out.print(n+" "));
        list.forEach(n->System.out.print(n+" "));
        System.out.println();
//        Set
        HashSet<Integer> hashSet = new HashSet<>();
        Collections.addAll(hashSet,11,12,13,14,15,16,17,18,19,20);
        hashSet.stream().forEach(n->System.out.print(n+" "));
        System.out.println();

        HashMap<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String>  map = Map.of(
                1,"刘一",
                2,"陈二",
                3,"孙七",
                4,"孙七",
                5,"周八",
                6,"吴九",
                7,"郑十"
        );
        map.forEach((i,s)-> System.out.println(i+"----"+s));
        Set<Integer> integers = hashMap.keySet();
        integers.stream().forEach((key)->{
            System.out.println(key+"---->"+map.get(key));
        });
    }
}
