package lesson.l16.test4;

public class BaoZi {
    private String name;
    private Double price;

    //标识 生产/消费 偶数:生产 奇数:消费
    private Integer flag=0;

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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
