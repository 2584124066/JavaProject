package zy.day13.Checkpoint1;

import java.util.ArrayList;

public class Test10 {
    private static ArrayList add(String... str){
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList list = add("A", "B", "C", "D");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
