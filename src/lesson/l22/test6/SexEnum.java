package lesson.l22.test6;

public enum SexEnum {

    MAN("1"),
    WOMAN("0");
    private String value;

    SexEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
