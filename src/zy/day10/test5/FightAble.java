package zy.day10.test5;

public interface FightAble {
    void specialFight();
    public default void commonFight(){
        System.out.println("普通打击");
    };
}
