import java.nio.file.attribute.AttributeView;
import java.util.*;

public class Poker {
    //pokerMap集合存储牌
    public static HashMap<Integer, String> pokerMap = new HashMap<>();
    //创建三个玩家编号集合和一个 底牌编号集合
    public static ArrayList<Integer> noP1 = new ArrayList<Integer>();
    public static ArrayList<Integer> noP2 = new ArrayList<Integer>();
    public static ArrayList<Integer> noP3 = new ArrayList<Integer>();
    public static ArrayList<Integer> dipaiNo = new ArrayList<Integer>();
    //创建三个玩家牌面集合 以及底牌牌面集合
    public static ArrayList<String> player1 = new ArrayList<>();
    public static ArrayList<String> player2 = new ArrayList<>();
    public static ArrayList<String> player3 = new ArrayList<>();
    public static ArrayList<String> dipai = new ArrayList<>();

    /*洗牌
     * 因为要将编号打乱顺序 既打乱pokerMap的键
     * 所以应该先获取pokerMap集合中所有的键
     * 然后进行转换到list集合中 再随机排序*/
    public static void reform() {
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
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
    }

    //排序
    public static void sortPoke() {
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);
    }

    //牌面的转换
    public static void setArrayList() {
        for (Integer i : noP1) {
            //根据编号找到牌面 pokerMap
            String card = pokerMap.get(i);
            // 添加到对应的牌面集合中
            player1.add(card);
        }
        for (Integer i : noP2) {
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (Integer i : noP3) {
            String card = pokerMap.get(i);
            player3.add(card);
        }
    }

    //查看
    public static void check() {
        System.out.println("令狐冲：" + player1);
        System.out.println("田伯光：" + player2);
        System.out.println("绿竹翁：" + player3);
    }

    //抢地主
    public static void seizingLandlords() {
        int index = new Random().nextInt(3) + 1;
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        switch (index) {
            case 1:
                System.out.println("玩家1是否抢地主  1是 0否");
                num1 = sc.nextInt();
                //1抢
                if (num1 == 1) {
                    noP1.addAll(dipaiNo);
                    System.out.println("玩家1地主");
                    break;
                }
                //玩家2抢
                System.out.println("玩家2是否抢地主  1是 0否");
                num2 = sc.nextInt();
                if (num2 == 1) {
                    noP2.addAll(dipaiNo);
                    System.out.println("玩家2地主");
                    break;
                }
                //玩家3抢
                System.out.println("玩家3是否抢地主  1是 0否");
                num3 = sc.nextInt();
                if (num3 == 1) {
                    noP3.addAll(dipaiNo);
                    System.out.println("玩家3地主");
                    break;
                }
                //都不抢
                System.out.println("重新开始，重新洗牌");
                noP1 = new ArrayList<Integer>();
                noP2 = new ArrayList<Integer>();
                noP3 = new ArrayList<Integer>();
                dipaiNo = new ArrayList<Integer>();
                player1 = new ArrayList<>();
                player2 = new ArrayList<>();
                player3 = new ArrayList<>();
                dipai = new ArrayList<>();
                reform();//洗牌
                sortPoke();//排序
                setArrayList();//牌面的转换
                check();//查看
                seizingLandlords();//重新抢
                break;
            case 2:
                System.out.println("玩家2是否抢地主  1是 0否");
                num2 = sc.nextInt();
                //玩家2抢
                if (num2 == 1) {
                    noP2.addAll(dipaiNo);
                    System.out.println("玩家2地主");
                    break;
                }
                //玩家3抢
                System.out.println("玩家3是否抢地主  1是 0否");
                num3 = sc.nextInt();
                if (num3 == 1) {
                    noP3.addAll(dipaiNo);
                    System.out.println("玩家3地主");
                    break;
                }
                //玩家1抢
                System.out.println("玩家1是否抢地主  1是 0否");
                num1 = sc.nextInt();
                if (num1 == 1) {
                    noP1.addAll(dipaiNo);
                    System.out.println("玩家1地主");
                    break;
                }
                //都不抢
                System.out.println("重新开始，重新洗牌");
                noP1 = new ArrayList<Integer>();
                noP2 = new ArrayList<Integer>();
                noP3 = new ArrayList<Integer>();
                dipaiNo = new ArrayList<Integer>();
                player1 = new ArrayList<>();
                player2 = new ArrayList<>();
                player3 = new ArrayList<>();
                dipai = new ArrayList<>();
                reform();//洗牌
                sortPoke();//排序
                setArrayList();//牌面的转换
                check();//查看
                seizingLandlords();//重新抢
                break;
            case 3:
                System.out.println("玩家3是否抢地主  1是 0否");
                num3 = sc.nextInt();
                //玩家3抢
                if (num3 == 1) {
                    noP3.addAll(dipaiNo);
                    System.out.println("玩家3地主");
                    break;
                }
                //玩家1抢
                System.out.println("玩家1是否抢地主  1是 0否");
                num1 = sc.nextInt();
                if (num1 == 1) {
                    noP1.addAll(dipaiNo);
                    System.out.println("玩家3地主");
                    break;
                }
                //玩家2抢
                System.out.println("玩家1是否抢地主  1是 0否");
                num2 = sc.nextInt();
                if (num2 == 1) {
                    noP2.addAll(dipaiNo);
                    System.out.println("玩家2地主");
                    break;
                }
                //都不抢
                System.out.println("重新开始，重新洗牌");
                noP1 = new ArrayList<Integer>();
                noP2 = new ArrayList<Integer>();
                noP3 = new ArrayList<Integer>();
                dipaiNo = new ArrayList<Integer>();
                player1 = new ArrayList<>();
                player2 = new ArrayList<>();
                player3 = new ArrayList<>();
                dipai = new ArrayList<>();
                reform();//洗牌
                sortPoke();//排序
                setArrayList();//牌面的转换
                check();//查看
                seizingLandlords();//重新抢
                break;
        }
    }

    public static void main(String[] args) {
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
        //洗牌
        reform();
        //排序
        sortPoke();
        //进行牌面的转换
        setArrayList();
        //查看
        check();
        //抢地主
        seizingLandlords();
        //排序
        sortPoke();
        //重写三个玩家牌面集合
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        player3 = new ArrayList<>();
        //进行牌面的转换
        setArrayList();
        //底牌 牌面的转换
        for (Integer i : dipaiNo) {
            String card = pokerMap.get(i);
            dipai.add(card);
        }
        //查看
        check();
        System.out.println("底牌：" + dipai);
    }
}
