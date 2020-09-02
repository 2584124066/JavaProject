package lesson.l21;

import java.lang.reflect.Field;
import java.util.ArrayList;

/*测试List集合的扩容机制*/
public class ArrayListTest {
    public static void main(String[] args) {
        //测试默认容量是0，第一次扩容后是10，以后按照1.5倍扩容，即第二次扩容后是15*1.5=22
        ArrayList<Integer> list = new ArrayList<>();

        //测试默认容量和元素的个数
        System.out.println("list的默认容量:" + getCapacity(list));
        System.out.println("list的大小:" + list.size());
        System.out.println("----------------------------");

        //测试添加1个元素后的容量和元素的个数
        list.add(1);
        System.out.println("list的默认容量:" + getCapacity(list));
        System.out.println("list的大小:" + list.size());
        System.out.println("----------------------------");

        //测试添加11个元素后的容量和元素的个数
        for (int i = 2; i <= 11; i++) {
            list.add(i);
        }
        System.out.println("list的默认容量:" + getCapacity(list));
        System.out.println("list的大小:" + list.size());
        System.out.println("----------------------------");

        //测试添加16个元素后的容量和元素的个数
        for (int i = 12; i <= 16; i++) {
            list.add(i);
        }
        System.out.println("list的默认容量:" + getCapacity(list));
        System.out.println("list的大小:" + list.size());
        System.out.println("----------------------------");
    }

    //获取List的容量
    public static Integer getCapacity(ArrayList list) {
        Integer length = null;
        //通过list对象获取Class对象
        Class listClass = list.getClass();
        try {
            //获取elementData属性 查看源码
            // 使用无参构造创建集合时，会把这个数组 Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = new Object[0]  赋值给elementData
            //DEFAULTCAPACITY_EMPTY_ELEMENTDATA：默认容量_空的_元素数据
            Field elementData = listClass.getDeclaredField("elementData");
            elementData.setAccessible(true);//暴力反射
            //获取元素数组 源码中的 Object[] EMPTY_ELEMENTDATA   空的元素数据
            Object[] objects = (Object[]) elementData.get(list);
            //获取元素数组的长度
            length = objects.length;
            return length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return length;
    }
}
