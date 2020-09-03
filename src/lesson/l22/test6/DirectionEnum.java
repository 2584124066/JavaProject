package lesson.l22.test6;

public enum DirectionEnum {
    //枚举项
    FRONT("1"),
    BEHIND("2"),
    LEFT("3"),
    RIGTH("4");

    private String name;

    DirectionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
