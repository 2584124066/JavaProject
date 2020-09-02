package lesson.l12.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

    public static ArrayList addDiPai(ArrayList list1,ArrayList list2){
        if (list1.contains("大☠")){
            list1.addAll(list2);
        }
        return list1;
    }


    public static void main(String[] args) {
        //创建牌集合
        ArrayList<String> pokerBox = new ArrayList<>();
        //花色
        String[] colors = {"♥", "♦", "♠", "♣"};
        //数字
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                pokerBox.add(colors[i] + numbers[j]);
            }
        }

        //大王小王
        pokerBox.add("小☺");
        pokerBox.add("大☠");

        //洗牌   使用默认随机源对指定列表进行置换。
        Collections.shuffle(pokerBox);

        //创建 三个 玩家集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();

        // 底牌
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i >= 51) {
                dipai.add(card);
            } else if (i % 3 == 0) {//玩家1
                player1.add(card);
            } else if (i % 3 == 1) {//玩家2
                player2.add(card);
            } else {//玩家3
                player3.add(card);
            }
        }
        
        System.out.println("令狐冲："+addDiPai(player1, dipai));
        System.out.println("田伯光："+addDiPai(player2, dipai));
        System.out.println("绿竹翁："+addDiPai(player3, dipai));
        System.out.println("底牌："+dipai);
    }
}
