package zy.day10.test3;

public class User {
    private String type;
    private int id;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
