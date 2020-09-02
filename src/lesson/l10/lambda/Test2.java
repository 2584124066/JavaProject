package lesson.l10.lambda;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        // 本来年龄乱序的对象数组
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20)};
       /* // 匿名内部类
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };*/
        Arrays.sort(array,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });// 第二个参数为排序规则，即Comparator接口实例

        for (Person person : array) {
            System.out.println(person.getAge());
        }
    }
}
