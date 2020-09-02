package lesson.l10.lx;

import java.util.ArrayList;

public class Common implements OpenMode {
    //普通红包规则： 所用红包平均分布，最后面留下的作为最后一个红包
    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        //用于存储红包
        ArrayList<Integer> redPack = new ArrayList<>();

        int tempMoney = money / count;

        for (int i = 0; i < count - 1; i++) {
            redPack.add(tempMoney);
            //发完一次红包后，总金额应该减少，
            money -= tempMoney;
        }
        //剩余的金额为最后一个红包
        redPack.add(money);
        return redPack;
    }
}
