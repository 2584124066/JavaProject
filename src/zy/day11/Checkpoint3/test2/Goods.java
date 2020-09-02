package zy.day11.Checkpoint3.test2;

public class Goods {
    private String id;       //商品id
    private String name;     //名称
    private Double price;    //单价
    private Character unit;       //计价单位
    private Integer number;     //数量

    public Goods() {
    }

    public Goods(String id, String name, Double price, Character unit, Integer number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Character getUnit() {
        return unit;
    }

    public void setUnit(Character unit) {
        this.unit = unit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
