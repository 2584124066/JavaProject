package zy.day10.test5;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();

        String str = "法力角色";
        System.out.println("选择：" + str);
        FightAble select = player.select(str);
        select.specialFight();
        select.commonFight();

        System.out.println("================");
        str = "武力角色";
        System.out.println("选择：" + str);
        select = player.select(str);
        select.specialFight();
        select.commonFight();
    }
}
