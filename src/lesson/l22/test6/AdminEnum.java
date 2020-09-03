package lesson.l22.test6;

public enum AdminEnum {
    MA_YUN(1, "马云"),
    MA_HUA_TENG(2, "马化腾");

    private Integer id;
    private String account;

    AdminEnum() {
    }

    AdminEnum(Integer id, String account) {
        this.id = id;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
