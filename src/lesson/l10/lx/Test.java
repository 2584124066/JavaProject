package lesson.l10.lx;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        RedPackage redPackage = new RedPackage();
        redPackage.setName("群主大大");

        //设置发红包模式,普通模式
        redPackage.setOpenMode(new Common());
        ArrayList<Integer> commonRedPack = redPackage.getOpenMode().faHongBao(10, 5);
        System.out.println(redPackage.getName() + "发了一个普通红包： " + commonRedPack);

        //设置发红包模式,随机模式
        redPackage.setOpenMode(new Lucky());
        OpenMode openMode = redPackage.getOpenMode();
        ArrayList<Integer> luckyRedPack = openMode.faHongBao(10, 5);
        System.out.println(redPackage.getName() + "发了一个随机红包： " + luckyRedPack);


    }
}
