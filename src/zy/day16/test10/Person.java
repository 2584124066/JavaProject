package zy.day16.test10;

public class Person {
    String name;
    Character sex;

    public Person() {
    }

    public Person(String name, Character sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

}
