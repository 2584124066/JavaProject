package lesson.l21;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
    /*获取(字节码)Class对象的三种方式*/
    @Test
    public void method() throws Exception {
        //方式1：通过类名.class获取
        Class userClass = User.class;
        System.out.println(userClass);
        //方式2：通过Object类的成员方法getClass()方法获取
        User user = new User();
        Class class1 = user.getClass();
        System.out.println(class1);
        //方式3：通过Class.forName("全限定类名")方法获取
        Class class2 = Class.forName("lesson.l21.User");
        System.out.println(class2);
    }

    /*获取Class对象的信息*/
    @Test
    public void method2() throws Exception {
        Class userClass = User.class;
        //获得简单类名，只是类名，没有包
        System.out.println(userClass.getSimpleName());
        //获取完整类名，包含包名+类名
        System.out.println(userClass.getName());
        //创建此 Class 对象所表示的类的一个新实例。要求：类必须有public的无参数构造方法
        User user = (User) userClass.getDeclaredConstructor().newInstance();
//        User user = (User) userClass.newInstance();//Java9后弃用
        Class string = Class.forName("java.lang.String");
        System.out.println(string.getName());
    }

    /*获取Class对象的构造方法*/
    @Test
    public void method3() throws Exception {
        Class userClass = User.class;
        System.out.println("========获取指定构造方法========");
        //只能获取public
        Constructor constructor = userClass.getConstructor();
        System.out.println(constructor);
        System.out.println(userClass.getConstructor(String.class, Integer.class));

        //能获取任意类型构造方法
        //根据参数列表不同，获取的构造器也不同(方法的重载)
        Constructor declaredConstructor = userClass.getDeclaredConstructor(String.class, Integer.class);
        System.out.println(declaredConstructor);
        Constructor declaredConstructor2 = userClass.getDeclaredConstructor(String.class, Character.class);
        System.out.println(declaredConstructor2);

        //获取所有的public修饰的构造方法
        System.out.println("========所有public修饰的构造方法========");
        Constructor[] constructors = userClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println("========获取所有构造方法========");
        //获取所有构造方法
        Constructor[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor d : declaredConstructors) {
            System.out.println(d);
        }
        //通过反射的方式去构造一个实例（new User ()）
        final Constructor<User> declaredConstructor3 = userClass.getDeclaredConstructor(String.class, Integer.class);
        User user3 = declaredConstructor3.newInstance("孙七", 27);
        System.out.println(user3);
        //暴力反射  除public修饰的构造方法外，其他构造方法反射都需要暴力反射
        final Constructor<User> declaredConstructor4 = userClass.getDeclaredConstructor(String.class, Character.class);
        declaredConstructor4.setAccessible(true);
        User user4 = declaredConstructor4.newInstance("周八", '男');
        System.out.println(user4);

    }

    /*获取Class对象的成员方法*/
    @Test
    public void method4() throws Exception {
        Class aClass = Class.forName("lesson.l21.User");
        //根据方法名和参数类型获得一个方法对象，只能是获取public修饰的
        Method sleep = aClass.getMethod("sleep", String.class, Integer.class);
        //根据方法名和参数类型获得一个任意修饰的方法对象
        Method work = aClass.getDeclaredMethod("work", String.class);
        //获取所有的public修饰的成员方法，包括父类中。
        System.out.println("========public修饰的成员方法,包括父类========");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //获取当前类中所有的方法
        System.out.println("========获取当前类中所有的成员方法========");
        final Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        //调用对象的该成员方法 只能调用public  如果第一个参数null，则表示该方法是静态方法
        sleep.invoke(new User(), "吴九", 27);
        Method work2 = aClass.getDeclaredMethod("work", String.class,Character.class);
        work2.invoke(null,"郑十",'女');
        //暴力反射，设置为可以直接调用私有修饰的成员方法
        work.setAccessible(true);
        work.invoke(new User(), "周八");
    }
    /* 获取Class对象的Field信息 类中的每一个属性(成员变量)都是Field的对象*/
    @Test
    public void method5() throws Exception {
        Class userClass = User.class;
        //只能获取一个public修饰的属性对象
        Field age = userClass.getField("age");
        System.out.println(age);
        //只能获取一个任意修饰属性对象
        Field name = userClass.getDeclaredField("name");
        System.out.println(name);
        //获取所有的public修饰的属性对象
        System.out.println("====获取所有的public修饰的属性对象====");
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========获取所有的属性对象=========");
        //获取所有的属性对象
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field d : declaredFields) {
            System.out.println(d);
        }

        //get set必须实例化对象
        User user = (User) userClass.getDeclaredConstructor().newInstance();
        age.set(user,18);
        System.out.println(age.get(user));
        name.setAccessible(true);//暴力反射
        name.set(user,"刘一");
        System.out.println(name.get(user));

    }
}
