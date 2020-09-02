package lesson.l05;

public class Test2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("阿拉加斯");
        dog1.setAge(8);
        dog1.setColor("白色");
        dog1.shake("小明");

        Dog dog2 = new Dog("茶杯",5,"棕色");
        dog2.shake("李华");

        Dog dog3= new Dog("牧羊",3,"白色");
        dog3.shake("宁夏");

        if (dog1.getAge()>dog2.getAge()&&dog1.getAge()>dog3.getAge()){
            System.out.println(dog1.getName()+"年龄最大");
        }else if (dog2.getAge()>dog3.getAge()){
            System.out.println(dog2.getName()+"年龄最大");
        }else {
            System.out.println(dog3.getName()+"年龄最大");
        }

    }
}
