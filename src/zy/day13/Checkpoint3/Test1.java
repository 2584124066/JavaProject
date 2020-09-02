package zy.day13.Checkpoint3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> excel = new ArrayList<>();
        HashSet<Integer> redList = new HashSet<>();
        Random r = new Random();
        while (redList.size() != 6) {
            redList.add(r.nextInt(33) + 1);
        }
        excel.addAll(redList);
        Collections.sort(excel);
        excel.add(r.nextInt(16) + 1);
        System.out.println(excel);
    }
}
