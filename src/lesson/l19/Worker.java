package lesson.l19;

import java.io.Serializable;

public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name,address;
    private transient Integer age;

    public Worker() {
    }

    public Worker(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
