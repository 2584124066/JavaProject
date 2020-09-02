package lesson.l06;

import java.util.ArrayList;
import java.util.Random;

import static lesson.l06.Print.printList;

public class Test5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        while (true){
            int num = r.nextInt(101);
            if (list.size()!=10){
                if (list.indexOf(num)==-1){
                    list.add(num);
                }
            }else {
                break;
            }
        }

        System.out.print("{");
        printList(list);

    }
}
