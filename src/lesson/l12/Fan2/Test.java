package lesson.l12.Fan2;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    //？代表可以接收任意类型
    public static void getElement(Collection<?> coll) {
    }

    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll) {
    }

    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll) {
    }

    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement(list1);
        getElement(list2);
        getElement(list3);
        getElement(list4);

        getElement1(list1);
/*      getElement1(list2); //  String类不属于Number类型或者Number类型的子类*/
        getElement1(list3);
/*      getElement1(list4); //  Object类不属于Number类型或者Number类型的子类*/

/*      getElement2(list1); // Integer类不属于Number类型或者Number类型的父类*/
/*      getElement2(list2); // Integer类不属于Number类型或者Number类型的父类*/
        getElement2(list3);
        getElement2(list4);
    }
}
