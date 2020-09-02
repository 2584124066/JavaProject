package zy.day10.test5;

public class Player {
    FightAble select(String str){
        if ("法力角色".equals(str)){
            return new Mage();
        }else if ("武力角色".equals(str)){
            return new Warrior();
        }
        return null;
    }
}
