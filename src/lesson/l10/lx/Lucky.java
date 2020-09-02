package lesson.l10.lx;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {
    //随机红包规则： 随机红包范围：(当前剩余余额/当前剩余红包个数)*2
    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        ArrayList<Integer> redPack = new ArrayList<>();

        Integer c = count;

        Random r = new Random();
        for (int i = 0; i < count-1; i++) {
            int tempMoney = r.nextInt(money / c * 2-1) + 1;

            //在总余额上减去这次发掉的红包金额
            money -= tempMoney;
            c--;
            redPack.add(tempMoney);
        }
        //剩下的钱留给最后一个红包
        redPack.add(money);
        return redPack;
    }
}
