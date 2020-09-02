package lesson.l06;

import java.util.ArrayList;

public class Print {
    public static void printList(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            if (i!=list.size()-1){
                System.out.print(list.get(i)+" ● ");
            }else {
                System.out.println(list.get(i)+"}");
            }
        }
    }
}
