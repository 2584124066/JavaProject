package zy.day14.one.Checkpoint3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        //pokerMap集合存储牌
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //创建 花色 数字
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        // 设置 存储编号变量
        int key = 0;
        //大王小王
        pokerMap.put(++key, "大王");
        pokerMap.put(++key, "小王");
        //创建牌存储到pokerMap集合中
        for (String number : numbers) {
            for (String color : colors) {
                pokerMap.put(++key, color + number);
            }
        }
        /*洗牌
         * 因为要将编号打乱顺序 既打乱pokerMap的键
         * 所以应该先获取pokerMap集合中所有的键
         * 然后进行转换到list集合中 再随机排序*/
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        //创建三个玩家编号集合和一个 底牌编号集合
        ArrayList<Integer> noP1 = new ArrayList<Integer>();
        ArrayList<Integer> noP2 = new ArrayList<Integer>();
        ArrayList<Integer> noP3 = new ArrayList<Integer>();
        ArrayList<Integer> dipaiNo = new ArrayList<Integer>();
        for (int i = 0; i < numberList.size(); i++) {
            //发牌的编号
            Integer no = numberList.get(i);
            if (i >= 51) {
                dipaiNo.add(no);
            } else {
                if (i % 3 == 0) {//玩家1
                    noP1.add(no);
                } else if (i % 3 == 1) {//玩家2
                    noP2.add(no);
                } else {//玩家3
                    noP3.add(no);
                }
            }
        }
        //判断是否有大王 有的话添加底牌
        if (noP1.contains(1)) {
            noP1.addAll(dipaiNo);
        } else if (noP2.contains(1)) {
            noP2.addAll(dipaiNo);
        } else {
            noP3.addAll(dipaiNo);
        }
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);
        //创建三个玩家牌面集合 以及底牌牌面集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //进行牌面的转换
        setArrayList(noP1, player1, pokerMap);
        setArrayList(noP2, player2, pokerMap);
        setArrayList(noP3, player3, pokerMap);
        setArrayList(dipaiNo, dipai, pokerMap);
        //查看
        System.out.println("令狐冲：" + player1);
        System.out.println("田伯光：" + player2);
        System.out.println("绿竹翁：" + player3);
        System.out.println("底牌：" + dipai);
    }

    //牌面的转换                                                牌编号               玩家                         牌集合
    public static ArrayList<String> setArrayList(ArrayList<Integer> noList, ArrayList<String> player, HashMap<Integer, String> pokerMap) {
        for (Integer i : noList) {
            //根据编号找到牌面 pokerMap
            String card = pokerMap.get(i);
            // 添加到对应的牌面集合中
            player.add(card);
        }
        return player;
    }
}
