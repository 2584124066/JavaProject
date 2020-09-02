package zy.day09.test8;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();

    public void addGoods(Goods goods){
        list.add(goods);
        System.out.println("加入 "+goods.getName()+" 成功");
    }

    public void showGoods(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getPrice()+",");
        }
    }

    public void total(){
        double sum = 0;
        double zSum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Fruit){
                sum+=list.get(i).getPrice();
                zSum+=list.get(i).getPrice();
            }else {
                sum+=list.get(i).getPrice();
                zSum +=  (list.get(i).getPrice()*0.88);
            }
        }
        System.out.println("原  价为："+sum+"元");
        System.out.println("折扣价位："+zSum+"元");
    }
}
